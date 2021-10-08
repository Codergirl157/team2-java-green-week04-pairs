package com.techelevator;


public class CateringSystemCLI {


	
	public static void main(String[] args) {
		CateringSystemCLI cli = new CateringSystemCLI();
		cli.run();
	}	

	
	
	public void run() {
		//probably should do stuff here... ;-)

		//create an instance of the inventory so we can use it to get data
		ProductInventory inventory = new ProductInventory("C:\\Users\\Student\\source\\repos\\pairs\\team2-java-green-week04-pairs\\m1-capstone-java-cateringsystem\\cateringsystem.csv");


	}
	
	



}
