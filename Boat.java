package heritage;

public class Boat extends Vehicule {

	public Boat(String brand) {
		super(brand);
	}

	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return "I am " + this.getBrand() + " and I go glug glug!";
	}

}
