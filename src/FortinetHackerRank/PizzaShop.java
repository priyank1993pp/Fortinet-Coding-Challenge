package FortinetHackerRank;

public class PizzaShop {
	
	static Pizza pizza;
	
	public static Pizza orderPizza(int pizzaType){
		
		if(pizzaType == 1){
			pizza = new CheesPizza();
		}else if(pizzaType == 2){
			pizza = new VagiePizza();
		}else{
			pizza = new PepperoniPizza();
		}
		pizza.prepare();
		pizza.back();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
