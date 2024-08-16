package week05;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello Would you like drinks or snacks?");
        String mainOption = input.next();
        double price = 0;

        switch (mainOption){
            case "drinks":
                System.out.println();
        }


    }

}





/*

Task 2
Vending Machine [Scanner, nested conditional statements]

    Define a program that will act like a vending machine. This task will not have many details. I want you to try writing some code with this idea in mind
    Flow:
        ask if they want the drink options or snack options
            if they select the drink option show the menu of water, coffee, soda, energy drink
            if they select the snack option show the menu of chips, cookies, carrots
        based in their selection display the price of the item
 */