package com.spotify.oauth2.api.applicationApi;

import com.spotify.oauth2.Utils.ConfigLoader;
import com.spotify.oauth2.api.RestResource;
import com.spotify.oauth2.pojo.Playlist;
import io.restassured.response.Response;

import static com.spotify.oauth2.api.Route.PLAYLISTS;
import static com.spotify.oauth2.api.Route.USERS;
import static com.spotify.oauth2.api.Token_Manager.getToken;


public class playlistApi {
    public static Response post (Playlist requstPlaylist){
        return RestResource.post(USERS+"/"+ ConfigLoader.getInstance().getUser() +PLAYLISTS ,getToken(),requstPlaylist);

    }
    public static Response get (String PlaylistId){
        return RestResource.get(PLAYLISTS +"/"+PlaylistId,getToken());

    }
    public static Response put(String PlaylistId,Playlist requstPlaylist){
        return RestResource.put(PLAYLISTS +"/"+PlaylistId ,getToken(),requstPlaylist);

    }

}
