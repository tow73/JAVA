import java.util.*;
public class A10_4 {

	public static void main(String[] args) {
		Account myAccount1 = new Account(0, "myAccount1", 0);
		Account myAccount2 = new Account(0, "myAccount2", 0);
		
		myAccount1.deposit(10000);
		System.out.println(myAccount1.toString());
		
		myAccount2.deposit(30000);
		System.out.println(myAccount2.toString());
		
		myAccount2.withdraw(5000);
		System.out.println(myAccount2.toString());
		
		System.out.println("transfer(5000)");
		myAccount1.transfer(myAccount1, myAccount2, 5000);
		
		System.out.println(myAccount1.toString());
		System.out.println(myAccount2.toString());
	}

}
