package Entities;

public class Funcionario {

	public String name;
	public double salary;
	public double tax;
	
	 
	
	
	
	public double netsalary() {
	    return salary - tax;
		
	}
	
	public void increaseSalary(double porcentage) {
		 salary +=  salary * porcentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netsalary());
	}
}