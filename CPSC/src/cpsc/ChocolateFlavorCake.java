package cpsc;

public class ChocolateFlavorCake extends FlavorDecorator {
	
	public String addFlavor() {		
		return "Chocolate Flavor";
	}
	
	public double getCost() {		
			return super.getCost() + 10.00;
	}
}

