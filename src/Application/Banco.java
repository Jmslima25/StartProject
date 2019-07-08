package Application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import Entities.Cadastro;

public class Banco {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a accout number: ");
		int conta = sc.nextInt();
		System.out.print("Enter a accont holder:");
		sc.nextLine();
		String name = sc.nextLine();

		Cadastro ct = new Cadastro(conta, name);

		System.out.println();
		System.out.print("Is there na inicial deposit(y/n): ");
		char deposito = 0;
		deposito = (char) System.in.read();
		double deposito1 = 0;
		if (deposito == 'y') {
			System.out.print("Enter inicial deposit value:");
			deposito1 = sc.nextDouble();
			ct.depositAc(deposito1);
		} else {
			deposito1 = 0.0;
		}
		System.out.println("Account data: ");
		System.out.printf("accout " + ct);
		System.out.println(); 
		System.out.print("Enter a deposit value:");
		deposito1 = sc.nextDouble();
		ct.depositAc(deposito1);
		
		System.out.println(" ");
		System.out.println("Updated Account data: ");
		System.out.printf("Accout " + ct);
		System.out.println(" ");
		System.out.print("Enter a Withdraw value: ");
		deposito1 = sc.nextDouble();
		ct.saqueAc(deposito1);
		
		System.out.println(" ");
		System.out.println("Updated Account data:");
		System.out.println("Accout " + ct);
		
		
		sc.close();
	}

}
