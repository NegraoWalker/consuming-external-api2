package com.walker.consumingexternalapi2.controller;

import com.walker.consumingexternalapi2.client.GoogleClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
    private final GoogleClient googleClient;

    public AlbumController(GoogleClient googleClient) {
        this.googleClient = googleClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok().body(googleClient.pong());
    }
}
