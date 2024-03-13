package user_items_calculator;

import java.util.Scanner;
public class UserItemsCalculator {





    public static void main(String[] args) {

        String product;

        int qty;

        float price;

        float miles;

        float fee;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the name of the item?");

        product = scan.next();

        System.out.println("How many did you order?");

        qty = scan.nextInt();

        System.out.println("What is the price of the item?");

        price = scan.nextFloat();

        System.out.println("How many miles is the delivery?");

        miles = scan.nextFloat();

        if (miles < 5) {
            fee = 2.00f;
            } else if (miles < 16) {
            fee = 5.00f;
            } else if (miles < 26) {
            fee = 10.00f;
            } else if (miles < 51) {
            fee = 15.00f;
            } else {
            fee = 20.00f;}

        double total = qty * price + fee;
        System.out.println("The total price for " + qty + " " + product + " at $" + price + " per item is $" + total + "\nThank you. Come Again!!!");
        }
    }
