package a1;

import java.util.ArrayList;

public class Aufgabe1 {

	public static void main(String[] args) {
		
		ArrayList<Student> studenten= new ArrayList<Student>();
		
		Student admin = new Student();
		
		Student dende = new Student();
		dende.immatrikulieren(28);
		
		Student marcel = new Student();
		marcel.immatrikulieren(19);
		
		Student thomas = new Student();
		thomas.immatrikulieren(22);
		
		studenten.add(dende);
		studenten.add(marcel);
		studenten.add(thomas);
		
		System.out.println(admin.durchschnitt(studenten));
		
		marcel.exmatrikulieren();
		
		System.out.println(admin.durchschnitt(studenten));
	}

}
