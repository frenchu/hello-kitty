package org.asia.hellokitty;

public class PassengerCar extends Car {

	private Person passenger;
	
	public PassengerCar() {
		System.out.println(this);
	}
	
	public Person getPassenger() {
		return passenger;
	}
	
	public void setPassenger(Person passenger) {
		this.passenger = passenger;
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return String.format("Owner: %s\nPassenger: %s\n", getOwner(), getPassenger());
	}
}
