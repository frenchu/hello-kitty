package org.asia.hellokitty;

public class Main {

	public static void main(String[] args) {
		Person asia = new Person("Joanna", "Sendo", 22, 45.25f);
		Person pawel = new Person("Pawe³", "Weselak", 45, 80.5f);
		
		System.out.println("Samochód stoi w salonie");
		PassengerCar fordKa = new PassengerCar();
		System.out.println("Asia kupuje samochód");
		fordKa.setOwner(asia);
		System.out.println("Pawe³ wsiada do auta");
		fordKa.setPassenger(pawel);
		System.out.println("Pawe³ wysiada z auta");
		fordKa.setPassenger(null);
	}
}
