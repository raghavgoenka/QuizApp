package com.example.internshala.services;

import com.example.internshala.Dao.ResponseDao;
import com.example.internshala.Dao.UserDao;
import com.example.internshala.entities.QuizResponse;
import com.example.internshala.entities.User;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;

@Service
public class UserServicesImpl implements UserServices{


    @Autowired
    private UserDao userDao;
    @Autowired
    private ResponseDao responseDao;


    @Override
    public JsonNode addUser(JsonNode user) {


        User newUser=  new User(user.get("userName").toString(),
                user.get("userEmail").toString(),
                user.get("file").get(0).get("content").toString(),
                user.get("salary").toString());


        if(userDao.findByuserEmail(newUser.getUserEmail()).size()==0){
            userDao.save(newUser);
        }
        addResponse(newUser.getUserEmail(),user);
        return  user;

    }



    @Override
    public JsonNode addResponse(String userEmail,JsonNode response) {

      QuizResponse newResponse=new QuizResponse(userEmail,response.get("question5").toString(),
              response.get("question6").toString(),
              response.get("question7").toString(),
              response.get("question8").toString());

      try{
       responseDao.save(newResponse);
      }
      catch (Exception e){
         System.out.println(e);
      }
       return response;
    }
}
