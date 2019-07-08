package Entities;

public class Retangle {

	public double h;
	public double w;

	public double area() {
		return h * w;

	}

	public double perimetro() {

		return (2 * h) + (2 * w);

	}

	public double Diagonal() {
		return Math.sqrt((h * h) + (w *w));
	}
}
