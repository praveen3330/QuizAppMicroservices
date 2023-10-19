package com.nerchko.quizservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nerchko.quizservice.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

	
}
