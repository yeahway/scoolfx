package com.scoolfx.desktop.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Grade")
@XmlRootElement
public class Grade extends Base {

	private static final long serialVersionUID = 9178673836150139447L;

	@Column(name = "class", nullable = false)
	private String name;

	@OneToMany(mappedBy = "grade", cascade = CascadeType.DETACH, fetch = FetchType.EAGER, targetEntity = Student.class)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Student> students;

	@OneToMany(mappedBy = "grade", cascade = CascadeType.DETACH, fetch = FetchType.EAGER, targetEntity = FeeStructure.class)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<FeeStructure> fees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FeeStructure> getFees() {
		return fees;
	}

	public void setFees(List<FeeStructure> fees) {
		this.fees = fees;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Grade [name=" + name + ", students=" + students + ", fees=" + fees + "]";
	}

}
