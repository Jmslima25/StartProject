package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Grade;

public class Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Grade A = new Grade();
		A.name = sc.next();

		double Grade1 = sc.nextDouble();
		double Grade2 = sc.nextDouble();
		double Grade3 = sc.nextDouble();
		A.media(Grade1, Grade2, Grade3);

		System.out.printf("Final Grade: %.2f%n", A.media);

		if (A.media >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING: " + A);
		}

		sc.close();
	}

}
