package com.bridgelabs.clinicalmanagement.model;

import com.bridgelabs.functionalutil.OopsMethods;

public class Doctor {
	
	private int id;
	private String name;
	private String specialization;
	private String availability;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
  public String toString() {
	  return "Doctor [id=" + id+ " , name= " + name+ " , specialization = " + specialization + " , Availability= " + availability + " ]";
  }
  public void addData()
  {
	  System.out.println("Enter doctor details-->");
	  System.out.println("Enter Doctor Id:");
	  id=OopsMethods.inputinteger();
	  System.out.println("Enter Doctor Name:");
	  name=OopsMethods.inputString();
	  System.out.println("Enter Doctor Specialisation:");
	  specialization=OopsMethods.inputString();
	  System.out.println("Enter Doctor Availability:");
	   availability=OopsMethods.inputString();
	   System.out.println();
	  
  }
  
  
  
}
