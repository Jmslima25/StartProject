package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;

public class ProgramF {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario J = new Funcionario();
		System.out.println("Enter your name, Salary and Tax:");
		J.name = sc.next();
		J.salary = sc.nextDouble();
		J.tax = sc.nextDouble();
		System.out.printf("Employee: " + J.name + ", " + J.netsalary());
		
		System.out.println();
		System.out.println("Which porcetage  to increase  salary: ");
		double porcentage = sc.nextInt();
		J.increaseSalary(porcentage);
		System.out.println();
		
		System.out.printf("Employee : " + J);
		
	}

}
