package com.scoolfx.desktop.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scoolfx.desktop.api.model.Grade;

public interface IGradeRepository extends JpaRepository<Grade, Long> {

}
