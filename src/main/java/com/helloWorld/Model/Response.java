package com.helloWorld.Model;

import lombok.*;

@Getter
@Setter
public class Response {
    String code;
    Object Response;

    public Response(String code, Object response) {
        this.code = code;
        Response = response;
    }
}
