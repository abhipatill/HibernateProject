package com.entit;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Candidate implements Serializable {

	@Id
	private int id;
	private String name;
	private String assembly;
	private String partyname;
	private String statename;
	private String gender;
	private int age;

	public Candidate() {

	}

	public Candidate(int id, String name, String assembly, String paryname, String statename, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.assembly = assembly;
		this.partyname = paryname;
		this.statename = statename;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getParyname() {
		return partyname;
	}

	public void setParyname(String paryname) {
		this.partyname = paryname;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", assembly=" + assembly + ", paryname=" + partyname
				+ ", statename=" + statename + ", gender=" + gender + ", age=" + age + "]";
	}

}
