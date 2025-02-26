package com.comparable;

public class Emploee implements Comparable<Emploee>{
	private String name;
	private double salary;
	
	public Emploee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Emploee otherEmploee) {
		
		return this.name.compareTo(otherEmploee.getName());
	}

	

}
