package heritage;

public class Car extends Vehicule {

	public Car(String brand) {
		super(brand);
	}

	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return "I am " + brand + " and I go zoom zoom zoom!";
	}

}
