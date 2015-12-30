package a1;


public class Aufgabe1 {

	public static void main(String[] args) {
				
		Student admin = new Student();
		
		Student dende = new Student();
		dende.immatrikulieren(28);
		
		Student marcel = new Student();
		marcel.immatrikulieren(19);
		
		Student thomas = new Student();
		thomas.immatrikulieren(22);
		
		System.out.println(admin.durchschnitt());
		
		marcel.exmatrikulieren();
		
		System.out.println(admin.durchschnitt());
		System.out.println(admin.getStudentenZahl());
	}

}
