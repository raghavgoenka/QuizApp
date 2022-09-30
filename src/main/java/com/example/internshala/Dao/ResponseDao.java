package com.example.internshala.Dao;

import com.example.internshala.entities.QuizResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseDao extends JpaRepository<QuizResponse,Integer> {

}
