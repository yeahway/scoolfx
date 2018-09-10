package com.scoolfx.desktop.api.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.scoolfx.desktop.api.model.type.Relation;

@Entity
@Table(name = "PARENTS")
@XmlRootElement
public class Parent extends Base {

	private static final long serialVersionUID = 7944614264776964222L;

	private String name;

	@ManyToMany(mappedBy = "parents")
	private Set<Student> students;

	private Relation relation = Relation.FATHER;

	private String phoneNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", relation=" + relation + ", phoneNo=" + phoneNo + "]";
	}

}
