package com.alarq.studentmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alarq.studentmanagement.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
