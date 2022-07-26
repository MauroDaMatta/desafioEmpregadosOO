package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payday = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		
		Department department = new Department(name, payday, new Address(email, phone));	
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
	
		for (int i=0; i<n; i++) {
			System.out.println("Dados do funcionário "+ (i+1) + ":");
			sc.nextLine();
			System.out.print("Nome: ");
			String nameemployee = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(nameemployee, salary);
			department.addEmp(employee);
		}
		showReport(department);
		sc.close();
	}
	private static void showReport(Department department) {
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.print(department.toString());
	}
}
