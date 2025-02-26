package entities;

public class Student {
	private String name;
	private double note1, note2, note3;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getN1() {
		return note1;
	}
	public void setN1(double n1) {
		this.note1 = n1;
	}
	public double getN2() {
		return note2;
	}
	public void setN2(double n2) {
		this.note2 = n2;
	}
	public double getN3() {
		return note3;
	}
	public void setN3(double n3) {
		this.note3 = n3;
	}
	
	public double finalGrade() {
		return note1 + note2 + note3;
	}
	
	public double missing() {
		if(finalGrade() < 60) {
			 return 60.00 - finalGrade(); 
		}else {
			return 0.0;
		}
	}
	
}
