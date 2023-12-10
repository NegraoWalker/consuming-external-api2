package com.walker.consumingexternalapi2.controller;

import com.walker.consumingexternalapi2.client.Album;
import com.walker.consumingexternalapi2.client.AlbumSpotifyClient;
import com.walker.consumingexternalapi2.client.AuthSpotifyClient;
import com.walker.consumingexternalapi2.client.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
    private static final String CLIENT_ID = "Pegar no Spotify";
    private static final String CLIENT_SECRET = "Pegar no Spotify";
    private final AuthSpotifyClient authSpotifyClient;
    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<List<Album>> ping(){
        var request = new LoginRequest("client_credentials",CLIENT_ID,CLIENT_SECRET);
        System.out.println(authSpotifyClient.login(request).getAcessToken());
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = albumSpotifyClient.getReleases("Bearer " + token);
        return ResponseEntity.ok().body(response.getAlbums().getItems());
    }
}
