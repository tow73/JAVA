import java.util.*;

public class Receipt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money, price, surtax, change;
		
		System.out.print("πﬁ¿∫ µ∑: ");
		money = input.nextInt();
		System.out.print("ªÛ«∞ ∞°∞›: ");
		price = input.nextInt();
		
		surtax = price / 10;
		change = money - price;
		
		System.out.println("∫Œ∞°ºº: " + (surtax));
		System.out.println("¿‹µ∑: " + (change));
	}

}