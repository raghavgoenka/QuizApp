package com.example.internshala.services;

import com.example.internshala.entities.QuizResponse;
import com.example.internshala.entities.User;
import com.fasterxml.jackson.databind.JsonNode;
import springfox.documentation.spring.web.json.Json;

public interface UserServices {

    public JsonNode addUser(JsonNode user);


    public JsonNode addResponse(String userEmail,JsonNode response);


}
