package studio0;

public class LunchReceipt {

	public static void main(String[] args) {
	
		double 
		burritoPrice = 7.5;
		double drinkPrice = 1.25;
		double chipsPrice = 1.00;
		double guacPrice = 2.50;
		
		double subtotal = burritoPrice + drinkPrice + chipsPrice + guacPrice;
		double taxRate = 0.04225;
		double taxAmount = subtotal * taxRate;
		double total = subtotal + taxAmount;
		
		System.out.println("Your total was: $" + total);
	}
	
	
}

/*Code sets prices for four menu items (burrito, drinks, chips, guac), then adds it all up before applying a tax 
 * rate to the total, which in this case is 0.04225%
 * The code then displays the final total by adding the subtotal with the tax amount, listing it as "Your total was:.	
 */