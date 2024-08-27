package com.spotify.oauth2.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.HashMap;
import static com.spotify.oauth2.api.Route.API;
import static com.spotify.oauth2.api.Route.TOKEN;
import static com.spotify.oauth2.api.SpecBuilder.*;
import static io.restassured.RestAssured.given;


public class RestResource {
    public static Response post (String path,String token ,Object requstPlaylist){

        return RestAssured.given(getRequestSpec()).
                body(requstPlaylist).
                auth().oauth2(token).
                when().
                post(path).
                then().spec(getResponseSpec()).
                extract().
                response();
    }
    public static Response postAccount (HashMap<String,String>formParam){

        return given(getAccountRequestSpec()).
                formParams(formParam).
                when().
                post(API +TOKEN).
                then().spec(getResponseSpec()).
                extract().response();
    }
    public static Response get (String path, String token){
       return given(getRequestSpec()).
               auth().oauth2(token).
                when().
                get(path).
                then().spec(getResponseSpec()).
                extract().response();
    }
    public static Response put(String path,String token ,Object requstPlaylist){
       return given(getRequestSpec()).
                body(requstPlaylist).
               auth().oauth2(token).
                when().
                put(path).
                then().spec(getResponseSpec()).
                extract().response();

    }

}
