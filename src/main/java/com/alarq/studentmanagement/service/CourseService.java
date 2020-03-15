package com.alarq.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.alarq.studentmanagement.entity.Course;

public interface CourseService {
	public List<Course> getCourses();

	public void saveCourse(Course student);

	public Optional<Course> getCourse(int id);

	public void deleteCourse(int id);
}
