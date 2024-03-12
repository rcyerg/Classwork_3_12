package user_items_calculator;

public class UserItemsCalculator {





    public static void main(String[] args) {

        String product = "rice";

        int qty = 20;

        float price = 5.00f;

        float miles = 10.00f;

        float fee;

        if (miles == 0 || miles <= 4) {
            fee = 2.00f;
            } else if (miles == 5 || miles <= 15) {
            fee = 5.00f;
            } else if (miles == 16 || miles <= 25) {
            fee = 10.00f;
            } else if (miles == 26 || miles <= 50) {
            fee = 15.00f;
            } else {
            fee = 20.00f;}

        double total = qty * price + fee;
        System.out.println("The total price for " + qty + " " + product + " at $" + price + " per item is $" + total + "\nThank you. Come Again!!!");
        }
    }
