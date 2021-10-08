package fr.diginamic.entites;

public class Theatre {

	private String name;
	private int capacity;
	private int customer;
	private double recipe;

	/**
	 * @constructor
	 * 
	 * @param name
	 * @param capacity
	 */
	public Theatre(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	/**
	 * register if the total capacity is ok
	 * else print error message
	 * @param customer
	 * @param price
	 */
	public void register(int customer, double price) {
		int testCapacity = this.customer + customer;
		if (testCapacity < capacity) {
			recipe = customer * price;
			this.customer += customer;
		} else {
			System.out.println("the capacity is no ok");
		}
	}

	/**
	 * redefinition of the method toString() for display
	 *
	 */
	@Override
	public String toString() {
		return " The theater has  "+ customer + " customer for a recipe of " + recipe+" €";
	}

}
