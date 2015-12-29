package a1;

import java.util.ArrayList;

public class Student {

	private int alter = 0;
		
	void immatrikulieren(int alter){
		this.setAlter(alter);
	}
	
	void exmatrikulieren(){
		this.setAlter(0);
	}
	
	double durchschnitt(ArrayList<Student> student){
		
		double x = 0;
		int counter = 0;
		for(Student s : student){
			x = x + s.getAlter();
			counter++;
		}
		
		return x/counter;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
}
