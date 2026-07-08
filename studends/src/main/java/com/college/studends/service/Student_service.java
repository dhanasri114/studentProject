package com.college.studends.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.studends.details.Student;
import com.college.studends.repository.Student_repo;


@Service
public class Student_service 
{
	@Autowired
	Student_repo repo;
	
	public Student addStudent(Student stud)
	{
		return repo.save(stud);
	}
	

	public List<Student> addStudentAll(List<Student> stud)
	{
		return repo.saveAll(stud);
	}
	
	public List<Student> readStudent()
	{
		return repo.findAll();
	}
	
	public Student readByname(String name)
	{
		return repo.findByName(name);
	}
	
	public Student updateName(int id,String name)
	{
		Student stu=repo.findById(id).orElseThrow(()->new RuntimeException("id not found"));
		
		stu.setName(name);
		
		return repo.save(stu);	
	}
	
	public void deleteId(int id)
	{
		repo.deleteById(id);
	}
}
