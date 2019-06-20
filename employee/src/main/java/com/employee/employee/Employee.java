
package com.employee.employee;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Employee implements 	Serializable  {
	//il faut utiliser les classes avec majiscule par ce que l'id doit etre un objet 
	@Id @GeneratedValue
	private Long emplyeeId ;
	private String Name;
	private String LastName ; 
	@Column(length=70)
	private String Gender; 
	private Integer IdentityNumber;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String lastName, String gender,
			Integer identityNumber) {
		super();
		Name = name;
		LastName = lastName;
		Gender = gender;
	
		IdentityNumber = identityNumber;
	}
	public Long getEmplyeeId() {
		return emplyeeId;
	}
	public void setEmplyeeId(Long emplyeeId) {
		this.emplyeeId = emplyeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public Integer getIdentityNumber() {
		return IdentityNumber;
	}
	public void setIdentityNumber(Integer identityNumber) {
		IdentityNumber = identityNumber;
	}

}