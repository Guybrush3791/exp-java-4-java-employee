package org.java.obj;

import java.time.LocalDate;

import org.java.obj.abs.Person;

public class Employee extends Person {

	private int salary;
	private boolean tred;
	private boolean quad;
	
	public Employee(String name, String lastname, LocalDate dateOfBirth,
					int salary, boolean tred, boolean quad) {
		
		super(name, lastname, dateOfBirth);
		
		setSalary(salary);
		setTred(tred);
		setQuad(quad);
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isTred() {
		return tred;
	}
	public void setTred(boolean tred) {
		this.tred = tred;
	}
	public boolean isQuad() {
		return quad;
	}
	public void setQuad(boolean quad) {
		this.quad = quad;
	}

	@Override
	public int getYearSalary() {
		
		return getSalary() * 12
				+ (isTred() ? getSalary() : 0)
				+ (isQuad() ? getSalary() : 0);
	}

	@Override
	public String toString() {
		
		return "(E) " + getStringImpl()
			+ "\nsalary: " + getSalary()
			+ "\ntredicesima: " + isTred()
			+ "\nquattordicesima: " + isQuad();
	}
}
