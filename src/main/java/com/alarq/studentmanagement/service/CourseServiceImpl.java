package com.alarq.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alarq.studentmanagement.dao.CourseRepository;
import com.alarq.studentmanagement.dao.StudentDAO;
import com.alarq.studentmanagement.entity.Course;
import com.alarq.studentmanagement.entity.Student;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	@Transactional
	public List<Course> getCourses() {
		return courseRepository.findAll();
	}

	
	@Override
	@Transactional
	public void saveCourse(Course course) {
		courseRepository.save(course);
	}


	@Override
	@Transactional
	public Optional<Course> getCourse(int id) {
		return courseRepository.findById(id);
	}


	@Override
	@Transactional
	public void deleteCourse(int id) {
		courseRepository.deleteById(id);
	}

}
