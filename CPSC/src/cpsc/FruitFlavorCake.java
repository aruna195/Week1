package cpsc;

public class FruitFlavorCake extends FlavorDecorator {
	
	public String addFlavor() {		
		return "Fruit Flavor";
	}
	
	public double getCost() {		
		return super.getCost() + 15.00;
	}

}
