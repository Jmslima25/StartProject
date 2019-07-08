package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Retangle;

public class ProgramR {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle X ;
		X = new Retangle();
		
		System.out.println("Enter the height:");
		X.h = sc.nextDouble();
		System.out.println("Enter the Weight:");
		X.w = sc.nextDouble();
		
		double AreaX = X.area();
		double PerimetroX = X.perimetro();
		double DiagonalX = X.Diagonal();
		
		System.out.printf("Area: %.2f%n ",AreaX);
		System.out.printf("Perimetro: %.2f%n",PerimetroX);
		System.out.printf("Diagonal: %.2f%n",DiagonalX);
		
      sc.close();
	}

}
