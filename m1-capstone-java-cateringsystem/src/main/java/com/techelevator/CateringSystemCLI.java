package com.techelevator;


import java.util.List;

public class CateringSystemCLI {


	
	public static void main(String[] args) {
		CateringSystemCLI cli = new CateringSystemCLI();
		cli.run();
	}	

	
	
	public void run() {
		//probably should do stuff here... ;-)

		//create an instance of the inventory so we can use it to get data
		ProductInventory inventory = new ProductInventory("C:\\Users\\Student\\source\\repos\\pairs\\team2-java-green-week04-pairs\\m1-capstone-java-cateringsystem\\cateringsystem.csv");
		UserInterface userInterface = new UserInterface();

		//while loop, if statements
		while(1 > 0){
			String choice = userInterface.printMenu();

			if(choice.equals("1")){
				//display catering menu
				List<MenuItem> results = inventory.retrieveListOfItems();
				//pass to userInterface
				userInterface.printMenu(results);

			}
			else if (choice.equals("2")){
				//display submenu

			}
			else if (choice.equals("3")){
				//Quit

			}
			else {
				//error Invalid Option

			}

		}



	}
	
	



}
