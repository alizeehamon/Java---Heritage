package heritage;

public class Hangar {

	public static void main(String[] args) {
		Car car = new Car("Clio");
		Boat boat = new Boat("Queen Elizabeth 2");
		System.out.println(car.doStuff());
		System.out.println(boat.doStuff());
	}

}
