package main;

public class Car {
	public String name;
	public String model;
	
	public Car(String name, String model) {
		this.name = name;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return name + "(" + model + ")";
	}
}
