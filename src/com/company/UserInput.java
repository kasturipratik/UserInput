package com.company;

import java.util.Scanner;
public class UserInput {
    private static String firstInitial;
    private static String lastName;
    private static int houseNumber;
    private static String streetName;
    private static String streetType;
    private static String city;

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first initial: ");
        firstInitial = userInput.nextLine();

        System.out.println("Enter your last name: ");
        lastName= userInput.next();

        System.out.println("Enter house number: ");
        houseNumber = userInput.nextInt();

        System.out.println("Enter Street name: ");
        streetName = userInput.next();

        System.out.println("Enter street type: ");
        streetType = userInput.next();

        System.out.println("Enter City: ");
        city = userInput.next();


        System.out.println(firstInitial +" "+ lastName +" "+ houseNumber+ " ");
        System.out.println(streetName +" "+ streetType + " "+city);

    }
}
