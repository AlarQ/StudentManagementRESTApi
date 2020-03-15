package com.alarq.studentmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alarq.studentmanagement.entity.Student;


//for exception translation????
@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private EntityManager entityManager;

	public StudentDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	@Override
	public List<Student> getStudents() {
		Session session = entityManager.unwrap(Session.class);
		
		Query<Student> theQuery = session.createQuery("from Student order by last_name",Student.class);
		List<Student> students = theQuery.list();
		
		return students;
	}


	@Override
	public void saveStudent(Student student) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(student);
	}


	@Override
	public Student getStudent(int id) {
		Session session = entityManager.unwrap(Session.class);
		Student student = session.get(Student.class, id);
		return student;
	}


	@Override
	public void deleteStudent(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Query query = session.createQuery("delete from Student "
				+ "where id=:studentId");
		query.setParameter("studentId",id);
		query.executeUpdate();
	}

}
