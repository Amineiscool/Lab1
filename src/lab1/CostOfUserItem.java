package lab1;

import java.util.Scanner;

public class CostOfUserItem {

    /*
     Distance 0-4 = $2
                 Distance 5-15 = $5
                 Distance 16-25 = $10
                 Distance 26-50 = $15
                 Distance 51+ = $20
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the name of the product: ");
        String product = scanner.nextLine();


        System.out.println(" Enter the quantity: ");
        int quantity = scanner.nextInt();


        System.out.println(" Enter the distance: ");
        int distance = scanner.nextInt();



        double price = 0;
        if (distance >= 0 && distance <= 4) {
            price = 2;

        } else if (distance >= 5 && distance <= 15) {
            price = 5;

        } else if (distance >= 16 && distance <= 25) {
            price = 10;

        } else if (distance >= 26 && distance <= 50) {
            price = 15;

        } else if (distance >= 51) {
            price = 20;

        }

        double total = quantity * price;

        System.out.println("Product      Qty      Price       Miles      Total");
        System.out.println("----         ---      -----      -----       -----");
        System.out.printf("%s       %d       %f         %d        %f              ",product, quantity, price, distance, total);
    }
}






