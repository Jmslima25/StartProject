package Entities;

public class Grade {

	public String name;
	public double media;

	public void media(double Grade1, double Grade2, double Grade3) {
		media = Grade1 + Grade2 + Grade3;
	}

	public String toString() {
		return String.format("%.2f", 60 - media) + " " + "POINTS";
	}
}
