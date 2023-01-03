
public class SalariedEmployee extends Employee {
	private int monthly;
	private int salary;
	
	public SalariedEmployee(String name, int id) {
		super(name, id);
	}
	
	public void setMonthly(int m) {monthly = m;}
	public int getMonthly() {return monthly;}
	
	public int computeSalary() {
		return monthly * 12;
	}
	
	public String toString() {
		return super.toString() + "¿« ø¨∫¿¿∫ " + computeSalary();
	}
}
