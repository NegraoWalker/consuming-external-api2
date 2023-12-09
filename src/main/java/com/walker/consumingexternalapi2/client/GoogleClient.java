package com.walker.consumingexternalapi2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GoogleClient",url = "https://google.com")
public interface GoogleClient {
    @GetMapping
    String pong();
}
