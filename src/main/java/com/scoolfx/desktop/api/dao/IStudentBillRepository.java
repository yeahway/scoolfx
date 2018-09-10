package com.scoolfx.desktop.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scoolfx.desktop.api.model.StudentBill;

public interface IStudentBillRepository extends JpaRepository<StudentBill, Long>{

}
