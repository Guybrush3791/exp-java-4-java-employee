package org.java.obj;

import java.time.LocalDate;

import org.java.obj.abs.Person;

public class Boss extends Person {

	private int dividend;
	private int bonus;
	
	public Boss(String name, String lastname, LocalDate dateOfBirth,
				int dividend, int bonus) {
		
		super(name, lastname, dateOfBirth);
		
		setDividend(dividend);
		setBonus(bonus);
	}
	
	public int getDividend() {
		return dividend;
	}
	public void setDividend(int dividend) {
		this.dividend = dividend;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public int getYearSalary() {
		
		return getDividend() + getBonus();
	}

	@Override
	public String toString() {
		
		return "(B) " + getStringImpl()
		 	+ "\ndividendo: " + getDividend()
		 	+ "\nbonus: " + getBonus();
	}
}
