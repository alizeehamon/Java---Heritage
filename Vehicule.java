package heritage;

public abstract class Vehicule {
	String brand;
	int kilometers;

	public Vehicule(String brand) {
		this.brand = brand;
		this.kilometers = 0;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public abstract String doStuff();

}
