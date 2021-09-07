package com.helper.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helper.demo.model.Feedback;



public interface FeedbackDao  extends JpaRepository<Feedback, Integer> {

}
