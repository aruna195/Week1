package cpsc;

public class DecoratorPattern {

	public static void main(String[] args) {
		FruitFlavorCake fruitCakeObj = new FruitFlavorCake();
		System.out.println("Cake ordered with Fruit Flavor: " + "$" + fruitCakeObj.getCost());
		ChocolateFlavorCake chocolateCakeObj = new ChocolateFlavorCake();
		System.out.println("Cake ordered with Chocolate Flavor: " + "$" + chocolateCakeObj.getCost());
		MarbleFlavorCake marbleCakeObj = new MarbleFlavorCake();
		System.out.println("Cake ordered with Marble Flavor: " + "$" + marbleCakeObj.getCost());

	}

}
