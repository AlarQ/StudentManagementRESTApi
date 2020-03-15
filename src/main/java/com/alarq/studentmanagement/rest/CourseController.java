package com.alarq.studentmanagement.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alarq.studentmanagement.entity.Course;
import com.alarq.studentmanagement.entity.Student;
import com.alarq.studentmanagement.service.CourseService;
import com.alarq.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/api")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getStudents()
	{
		List<Course> students = courseService.getCourses();
		return students;
	}
	
	@GetMapping("/courses/{id}")
	public Optional<Course> getStudent(@PathVariable int id)
	{
		Optional<Course> course = courseService.getCourse(id);
		return course;
	}
	

	@PostMapping("/courses")
	public Course saveStudent(@RequestBody Course course)
	{
		course.setId(0);
		courseService.saveCourse(course);
		return course;
	}
	
	@PutMapping("/courses")
	public Course updateStudent(@RequestBody Course course)
	{
		courseService.saveCourse(course);
		return course;
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		courseService.deleteCourse(id);
	}
}