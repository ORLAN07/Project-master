package com.example.polls.payload;

public class ApiResponse {

    private Boolean seccess;
    private String message;

    public ApiResponse(Boolean seccess, String message) {
        this.seccess = seccess;
        this.message = message;
    }

    public Boolean getSeccess() {
        return seccess;
    }

    public void setSeccess(Boolean seccess) {
        this.seccess = seccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
