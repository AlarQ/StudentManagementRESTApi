package com.alarq.studentmanagement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alarq.studentmanagement.entity.Student;
import com.alarq.studentmanagement.service.StudentService;


@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> students = studentService.getStudents();
		return students;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id)
	{
		Student student = studentService.getStudent(id);
		return student;
	}
	

	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student)
	{
		student.setId(0);
		studentService.saveStudent(student);
		return student;
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return student;
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
	}
}
