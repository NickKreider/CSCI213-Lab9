/*
Car.java
Author: Nick Kreider
Date: 4/26/2022
A class for an object to contain information for a car
*/


public class Car extends Vehicle{
	private int doors;
	private int passangers;
	
	/**
	*A parameterized constructor for Car
	*@param make, the make of the car
	*@param model, the model of the car
	*@param plate, the plate of the car
	*@param doors, the number of doors
	*@param passangers, the number of passangers
	*/
	public Cars(String make, String model, String plate, int doors, int passengers){
		super(make, model, plate);
		this.doors = doors;
		this.passangers = passengers;
	}
	
	/**
	*A getter method for doors
	*@return doors, the number of doors
	*/
	public int getDoors(){
		return this.doors
	}
	
	
	/**
	*A getter method for passengers
	*@return passangers, the number of passangers
	*/
	public int getPassangers(){
		return this.passangers;
	}
	
	
	/**
	*Returns the car information in a string
	*@return str, the information in String form
	*/
	public String toString(){
		String str = String.format("%d-door %s %s with license %s", this.door, super.getMake(), super.getModel(), super.getPlate());
		return str;
	}
	
	/**
	*Determines if two cars are equal
	*@param obj, the other car being compared
	*@return boolean, true if they are equal false otherwise
	*/
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) obj;
		
		if ((super.equals(otherCar))&&(this.doors == otherCar.doors)&&(this.passangers == otherCar.passengers)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	*returns a copy of the car
	*@return theCopy, the copy of the car
	*/
	public Car copy() {
		int numDoors = this.doors;
		int numPassangers = this.passangers;
		String aMake = super.getMake();
		String aModel = super.getModel();
		String aPlate = super.getPlate();
		
		Car theCopy = new Car(aMake, aModel, aPlate, numDoors, numPassangers);
		
		return theCopy;
	}

}