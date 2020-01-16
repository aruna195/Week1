package cpsc;

public class MarbleFlavorCake extends FlavorDecorator {
	
	public String addFlavor() {		
		return "MarbleFlavor";
	}
	
	public double getCost() {		
		return super.getCost() + 5.00;
    }
}
