package FortinetHackerRank;

import java.util.Scanner;

public class OrderPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1.Chees Pizza");
		System.out.println("2.Vagie Pizza");
		System.out.println("3.Peppronie Pizza");
		System.out.println("Please enter pizza choise as 1, 2 or 3:");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int pizzaType = sc.nextInt();
		
		@SuppressWarnings("unused")
		Pizza pizza = PizzaShop.orderPizza(pizzaType);
		
	}

}
