
public class HourlyEmployee extends Employee {
	private int hours;
	private int rate;
	
	public HourlyEmployee(String name, int id) {
		super(name, id);
	}
	
	public void setHours(int h) {hours = h;}
	public int getHours() {return hours;}
	public void setRate(int r) {rate = r;}
	public int getRate() {return rate;}
	
	public int computeSalary() {
		return rate * hours;
	}
	
	public String toString() {
		return super.toString() + "의 지급 급여는 " + computeSalary();
	}
}
