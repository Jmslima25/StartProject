package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your full name :");
	    String sentence = sc.nextLine();
	    
	    System.out.println("How muny badroons in your house?");
	    int bed = sc.nextInt();
		
	    System.out.println("Enter product price :");
	    double price = sc.nextDouble();
	    
	    System.out.println("Enter your last name, age and height:");
	    String name = sc.next();
	    int age = sc.nextInt();
	    double height = sc.nextDouble();
	    
		System.out.println(sentence);
		System.out.println(bed);
		System.out.println(price);
		System.out.println(name);
		System.out.println( age);
		System.out.println(height);
		
		sc.close();
		
	}

}

// para fazer a importação apertar ctrl + shift + o