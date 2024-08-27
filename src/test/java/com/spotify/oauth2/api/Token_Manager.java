package com.spotify.oauth2.api;

import com.spotify.oauth2.Utils.ConfigLoader;
import io.restassured.response.Response;
import java.time.Instant;
import java.util.HashMap;
public class Token_Manager {
    private static String access_token;
    private static Instant expiry_time;
    public synchronized static String getToken(){
        try{
            if(access_token == null || Instant.now().isAfter(expiry_time)){
                System.out.println("Renewing token ...");
                Response response = RenewToken();
                access_token = response.path("access_token");
                int expiryDurationInSeconds = response.path("expires_in");
                expiry_time = Instant.now().plusSeconds(expiryDurationInSeconds - 300);
            } else{
                System.out.println("Token Renewing Good");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Token Is Failed");
        }
        return access_token;
    }


    private static Response RenewToken(){

        HashMap<String,String> formParam=new  HashMap<String,String>();
        formParam.put("client_id", ConfigLoader.getInstance().getClientId());
        formParam.put("client_secret",ConfigLoader.getInstance().getClientSecret());
        formParam.put("refresh_token",ConfigLoader.getInstance().getRefreshToken());
        formParam.put("grant_type",ConfigLoader.getInstance().getGrantType());
        Response response = RestResource.postAccount(formParam);


        if (response.statusCode() !=200){

            throw new RuntimeException(" Renew Token Failed");
        }
        return response;

    }
}
