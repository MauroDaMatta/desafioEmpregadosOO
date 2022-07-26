package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	
	private Employee employee;
	private List<Employee> emps = new ArrayList<>();
	private Address address; 
	
	public Department() {
	}

	public Department(String name, int payDay, Employee employee, List<Employee> emps, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.employee = employee;
		this.emps = emps;
		this.address = address;
	}
	
	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public Department(String name, int payDay) {
		this.name = name;
		this.payDay = payDay;
	}
	
	public Department(String name, int payDay, List<Employee> emp) {
		this.name = name;
		this.payDay = payDay;
		this.emps = emp;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void addEmp(Employee emp) {
		emps.add(emp);
	}
	
	public void removeEmp(Employee emp) {
		emps.remove(emp);
	}
	
	public double payRoll() {
		double sum = 0.0;
		for (Employee e : emps ) {
			double payment = e.getSalary();
			sum += payment;
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento ");
		sb.append(name + " = R$");
		sb.append(String.format("%.2f", payRoll())+ "\n" );
		sb.append("Pagamento realizado no dia " + payDay + "\n");
		sb.append("Funcionários: \n");
		for (Employee x : emps) {
			sb.append(x.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: " + address.getEmail());
		
		return sb.toString();
		
	}
	
}
























