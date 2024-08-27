package com.spotify.oauth2.Testes;

import com.spotify.oauth2.Utils.DataLoader;
import com.spotify.oauth2.api.applicationApi.playlistApi;
import com.spotify.oauth2.pojo.Playlist;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static com.spotify.oauth2.Utils.FakerUtils.generateDescription;
import static com.spotify.oauth2.Utils.FakerUtils.generateName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

 public class PlaylistTestes {

     public Playlist PlaylistBuilder(String name ,String Description , boolean Public){

         return Playlist.builder().
                 name(name).
                 description(Description).
                 _public(Public).build();
     }
     public void AssertPlaylist(Playlist requstPlaylist, Playlist responsePlaylist){
         assertThat(responsePlaylist.getName(),equalTo(requstPlaylist.getName()));
         assertThat(responsePlaylist.getDescription(),equalTo(requstPlaylist.getDescription()));
         assertThat(responsePlaylist.get_public(),equalTo(requstPlaylist.get_public()));

     }
     public void StatusCode(int actualStatue , int expectedStatus){
         assertThat(actualStatue,equalTo(expectedStatus));

     }

   @Test
    public void CreatePlaylist(){
         Playlist requstPlaylist=PlaylistBuilder(generateName(),generateDescription(),false);
        Response response = playlistApi.post(requstPlaylist);
        StatusCode(response.statusCode(),201);
        Playlist responsePlaylist=response.as(Playlist.class);

        AssertPlaylist(requstPlaylist,responsePlaylist);


    }
    @Test
    public void GetPlaylist(){
        Response response= playlistApi.get(DataLoader.getInstance().getGetPlaylistId());
        StatusCode(response.statusCode(),200);

    }
    @Test
    public void UpdatePlaylist(){
        Playlist requstPlaylist=PlaylistBuilder(generateName(),generateDescription(),false);
        Response response= playlistApi.put(DataLoader.getInstance().getGetPlaylistId() , requstPlaylist);

        assertThat(response.statusCode(),equalTo(200));
    }

}
