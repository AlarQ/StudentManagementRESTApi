package com.alarq.studentmanagement.service;

import java.util.List;

import com.alarq.studentmanagement.entity.Student;

public interface StudentService {
	public List<Student> getStudents();

	public void saveStudent(Student student);

	public Student getStudent(int id);

	public void deleteStudent(int id);
}
