package org.java.obj.abs;

import java.time.LocalDate;

public abstract class Person {

	private String name;
	private String lastname;
	private LocalDate dateOfBirth;
	
	public Person(String name, String lastname, LocalDate dateOfBirth) {
		
		setName(name);
		setLastname(lastname);
		setDateOfBirth(dateOfBirth);
	}

	public abstract int getYearSalary();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	protected String getStringImpl() {
		
		return getName() + " " + getLastname()
			+ "\ndata di nascita: " + getDateOfBirth()
			+ "\nyear salary: " + getYearSalary();
	}
	
	@Override
	public String toString() {
		
		return "(P) " + getStringImpl();
	}
}
