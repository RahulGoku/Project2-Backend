package com.helper.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helper.demo.model.Courses;

public interface CoursesDao extends JpaRepository<Courses, Integer>{

}
