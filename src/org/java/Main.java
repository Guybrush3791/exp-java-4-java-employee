package org.java;

import java.time.LocalDate;

import org.java.obj.Boss;
import org.java.obj.Employee;
import org.java.obj.abs.Person;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee("Guybrush", "Threepwood", 
				LocalDate.now(), 1300, true, true);
		System.out.println(e);
		
		System.out.println("\n----------------------------\n");
		
		Boss b = new Boss("Marco", "Rossi", LocalDate.now(), 20000, 30000);
		System.out.println(b);
		
		System.out.println("\n----------------------------\n");
		
		Person[] people = { e, b };
		int sumYearSalary = 0;
		for (int x=0;x<people.length;x++) {
			
			Person p = people[x];
			int yearSalary = p.getYearSalary();
			sumYearSalary += yearSalary;
		}
		
		System.out.println("Costo annuale dipendenti: " + sumYearSalary + "E/anno");
	}
}
