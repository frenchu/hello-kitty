package org.asia.hellokitty;

public class Car {

	private Person owner;
	
	public Person getOwner() {
		return owner;
	}
	
	public String getOwnerName() {
		return owner.getName();
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
		System.out.println(this);
	}
}
