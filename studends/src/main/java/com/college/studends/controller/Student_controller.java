package com.college.studends.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.studends.details.Student;
import com.college.studends.service.Student_service;

@RestController
public class Student_controller 
{
	@Autowired
	Student_service service;
	
	@PostMapping("/add/student")
	public Student save_Student(@RequestBody Student stud)
	{
		return service.addStudent(stud);
	}
	
	
	@PostMapping("/add/student/all")
	public List<Student> save_StudentAll(@RequestBody List<Student> stud)
	{
		return service.addStudentAll(stud);
	}
	
	
	@GetMapping("read/all")
	public List<Student> Read_Students()
	{
		return service.readStudent();
	}
	
	@PutMapping("/update/student/id/name/{id}/{name}")
	public Student modiftStudentName(@PathVariable int id, @PathVariable String name)
	{
		return service.updateName(id, name);
	}
	
	@DeleteMapping("/delete/student/id/{id}")
	public void removeStudentId(@PathVariable int id)
	{
		service.deleteId(id);
	}
}
