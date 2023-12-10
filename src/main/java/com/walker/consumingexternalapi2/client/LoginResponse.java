package com.walker.consumingexternalapi2.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


public class LoginResponse {
    @JsonProperty("access_token")
    private String acessToken;

    public LoginResponse() {
    }

    public LoginResponse(String acessToken) {
        this.acessToken = acessToken;
    }

    public String getAcessToken() {
        return acessToken;
    }

    public void setAcessToken(String acessToken) {
        this.acessToken = acessToken;
    }
}
