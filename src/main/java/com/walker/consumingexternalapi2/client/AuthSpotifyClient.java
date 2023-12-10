package com.walker.consumingexternalapi2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "AutoSpotifyClient",url = "https://accounts.spotify.com")
public interface AuthSpotifyClient {
    @PostMapping(value = "/api/token",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    LoginResponse login(@RequestBody LoginRequest loginRequest);

}
