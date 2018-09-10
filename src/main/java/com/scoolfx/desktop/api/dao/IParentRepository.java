package com.scoolfx.desktop.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scoolfx.desktop.api.model.Parent;

public interface IParentRepository extends JpaRepository<Parent, Long> {

}
