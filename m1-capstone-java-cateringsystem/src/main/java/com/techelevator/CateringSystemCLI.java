package com.techelevator;


import java.util.List;
import java.util.Scanner;

public class CateringSystemCLI {
    ProductInventory inventory;
    UserInterface userInterface;
    BalanceAccount balanceAccount;
    //class variables to be used below


    public static void main(String[] args) {
        CateringSystemCLI cli = new CateringSystemCLI();
        cli.run();
    }


    public void run() {
        //probably should do stuff here... ;-)

        //create an instance of the inventory so we can use it to get data
        inventory = new ProductInventory("C:\\Users\\Student\\source\\repos\\pairs\\team2-java-green-week04-pairs\\m1-capstone-java-cateringsystem\\cateringsystem.csv");
        userInterface = new UserInterface();
        balanceAccount = new BalanceAccount();
        //while loop, if statements

        boolean isRunning = true;
        while (isRunning) {
            String choice = userInterface.printMenu();

            if (choice.equals("1")) {
                //display catering menu
                List<MenuItem> results = inventory.retrieveListOfItems();
                //pass to userInterface
                userInterface.printMenu(results);

            } else if (choice.equals("2")) {

                subMenu();
                //display submenu


            } else if (choice.equals("3")) {
                //Quit
                isRunning = false;
                System.out.println("Thank you, and have a great day!");
                System.exit(0);
            } else {
                //error Invalid Option
                System.out.println("Please enter a valid selection");
            }


        }


    }
    private void subMenu()  {


        boolean running = true;

        while (running) {

            Scanner scanner = new Scanner(System.in);

            String subMenuChoice = userInterface.printsubMenu();

            if (subMenuChoice.equalsIgnoreCase("1")) {
                System.out.println("Please enter the amount of money you want to add.");
                double credit = Double.parseDouble(scanner.nextLine());
                balanceAccount.addMoney(credit);

                System.out.println("Your Account Balance is: $" + balanceAccount.getAccountBalance());

            }
                else if (subMenuChoice.equalsIgnoreCase("2")) {

                List<MenuItem> results = inventory.retrieveListOfItems();


                    userInterface.printMenu(results);

                System.out.println("Please enter the product code for the item you want to purchase");
                String choice = scanner.nextLine();
                System.out.println(choice);


            }
        }    }    }