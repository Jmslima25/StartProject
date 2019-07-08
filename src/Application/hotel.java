package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.quartos;

public class hotel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de hospedes:");
		
		int n = sc.nextInt();
		quartos vect[] = new quartos[10];

		for (int x = 0; x < n; ++x) {
			System.out.println();
			System.out.println("Digite o nome:");
			String name = sc.next();
			System.out.println("digite o email:");
			String email = sc.next();
			System.out.println("Digite o quarto:");
			int quarto = sc.nextInt();
			vect[quarto] = new quartos(name, email);

		}
		System.out.println();
        System.out.println("Quartos reservados:");
        for(int x = 0; x<10; ++x) {
        	if(vect[x] != null) {
        		System.out.println(x  + ":" + vect[x]);
        		
        	}
        }
	}

}
