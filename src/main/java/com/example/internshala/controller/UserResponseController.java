package com.example.internshala.controller;

import com.example.internshala.entities.User;
import com.example.internshala.services.UserServices;
import com.fasterxml.jackson.databind.JsonNode;
import netscape.javascript.JSObject;
import nonapi.io.github.classgraph.json.JSONDeserializer;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@Controller
@RestController
public class UserResponseController {
    @Autowired

    private UserServices userServices;
    @RequestMapping("/quiz")
    @GetMapping("/quiz")
    public String a(){return "Hello world";}
    @PostMapping("/quiz")

    public String addUser(@RequestBody  com.fasterxml.jackson.databind.JsonNode response )
    {
        try {
            this.userServices.addUser(response);
            return "Response collected successfully";
        }
        catch(Exception e)
        {
            return "Error in collecting your response";
        }
    }
}
