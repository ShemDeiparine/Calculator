//Shem Deiparine
//sdeipar1@umbc.edu

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Shem Deiparine");
        System.out.println("sdeipar1@umbc.edu");
        System.out.println("---------------------------------");
        System.out.println("Homework 2: Simple Calculator");
        System.out.println("---------------------------------");

        Scanner input1 = new Scanner(System.in);

        int x;

        do {

            System.out.println("Input 1 to add");
            System.out.println("Input 2 to subtract");
            System.out.println("Input 3 to multiply");
            System.out.println("Input 4 to divide");
            System.out.println("Input 0 to exit");

            x = input1.nextInt();

            if (x == 1) {

                System.out.println("Enter any number");
                double y = input1.nextDouble();
                System.out.println("Enter another number");
                double z = input1.nextDouble();
                System.out.println("The answer is: " + (y + z));

            } else if (x == 2) {

                System.out.println("Enter any number");
                double y = input1.nextDouble();
                System.out.println("Enter another number");
                double z = input1.nextDouble();
                System.out.println("The answer is: " + (y - z));

            } else if (x == 3) {

                System.out.println("Enter any number");
                double y = input1.nextDouble();
                System.out.println("Enter another number");
                double z = input1.nextDouble();
                System.out.println("The answer is: " + (y * z));

            } else if (x == 4) {

                System.out.println("Enter any number");
                double y = input1.nextDouble();
                System.out.println("Enter another number");
                double z = input1.nextDouble();
                System.out.println("The answer is: " + (y / z));

            }

            else if (x > 4||x < 0) {

                System.out.println("Please enter a valid number");
            }

        } while (x != 0);
        System.out.println("Exiting...");
    }
}




