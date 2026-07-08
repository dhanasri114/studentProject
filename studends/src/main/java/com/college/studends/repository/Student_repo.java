package com.college.studends.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.studends.details.Student;

@Repository
public interface Student_repo extends JpaRepository<Student, Integer>
{
	 Student findByName(String name);
}
