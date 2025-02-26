package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		Emploee e1 = new Emploee("Jrff12", 11000.00);
		Emploee e2 = new Emploee("Madame", 10000.00);

		ArrayList<Emploee> emploees = new ArrayList<Emploee>();
		emploees.add(e1);
		emploees.add(e2);

		Collections.sort(emploees);

		for (Emploee em: emploees) {
			System.out.println(em.getName() + ", " + em.getSalary());
		}
	}

}
