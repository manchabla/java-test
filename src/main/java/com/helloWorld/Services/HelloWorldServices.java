package com.helloWorld.Services;

import com.helloWorld.Model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldServices {

    @GetMapping("")
    Response Test() {
        return new Response("200","This is a Test");
    }
}
