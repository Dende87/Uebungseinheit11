package a1;

public class Student {

	private int alter = 0;
	
	private static int studentenZahl = 0;
	private static int alterSumme = 0;

	void immatrikulieren(int alter) {
		this.setAlter(alter);
		alterSumme += alter;
		studentenZahl++;
	}

	void exmatrikulieren() {
		alterSumme -= this.alter;
		this.setAlter(0);
		studentenZahl--;
	}

	double durchschnitt() {
		return alterSumme / studentenZahl;
	}

	public int getStudentenZahl() {
		return studentenZahl;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
}
