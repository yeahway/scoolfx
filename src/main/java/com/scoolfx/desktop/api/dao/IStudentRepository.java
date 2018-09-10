package com.scoolfx.desktop.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scoolfx.desktop.api.model.Grade;
import com.scoolfx.desktop.api.model.Student;
import com.scoolfx.desktop.api.model.type.Gender;
import com.scoolfx.desktop.api.model.type.Section;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

	List<Student> findBySection(Section section);

	List<Student> findByNameContainingIgnoreCase(String name);

	List<Student> findByNameContainingIgnoreCaseAndSection(String name, Section section);

	List<Student> findByGrade(Grade grade);

	List<Student> findByNameContainingIgnoreCaseAndSectionAndGrade(String name, Section section, Grade grade);

	List<Student> findByRollNo(Long rollNo);

	List<Student> findByNameContainingIgnoreCaseAndGrade(String name, Grade grade);

	List<Student> findByDobIgnoreCase(String dob);

	List<Student> findByAge(int age);

	List<Student> findByGender(Gender gender);

	List<Student> findByAddressIgnoreCase(String address);

	List<Student> findByPhoneNoIgnoreCase(String phoneNo);

	List<Student> findByEmailIgnoreCase(String email);

	List<Student> findByActiveIgnoreCase(boolean active);

	List<Student> findByUrlIgnoreCase(String url);
}
