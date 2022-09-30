package com.example.internshala.Dao;

import com.example.internshala.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    public List<User> findByuserEmail(String userEmail);
}