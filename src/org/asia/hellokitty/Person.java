package org.asia.hellokitty;

// co robi ta klasa? WTF?
public class Person {

	private String name;
	private String surname;
	private int age;
	private float weight;

	public Person(String name, String surname, int age, float weight) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return name + " " + surname;
	}
}
