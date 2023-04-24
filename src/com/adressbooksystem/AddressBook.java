package com.adressbooksystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    /*
     * Method for creating a contact
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Taking user input for contact details and set the details in contact class
         * 2) Get the details form contact class and printing them
         */
        /*
         1) Taking user input for contact details and set the details in contact class
         */

        ArrayList<Contact> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        /*
         * 1. Display Message
         */
        System.out.println("Please enter how much contact you want to add");
        int noOfContact = sc.nextInt();
        // Taking for loop for add multiple contact details
        for (int i = 1; i <= noOfContact; i++) {
            //Declaring Object
            Contact contact = new Contact();
            //Display messages for various parameter of the address book
            System.out.println("Enter first name of contact ");
            contact.setFirstName(sc.next());
            System.out.println("Enter last name contact ");
            contact.setLastName(sc.next());
            System.out.println("Enter address contact ");
            contact.setAddress(sc.next());
            System.out.println("Enter city contact ");
            contact.setCity(sc.next());
            System.out.println("Enter state contact ");
            contact.setState(sc.next());
            System.out.println("Enter zip contact ");
            contact.setZip(sc.nextInt());
            System.out.println("Enter phone number  contact ");
            contact.setPhoneNumber(sc.nextLong());
            System.out.println("Enter email  contact ");
            contact.setEmail(sc.next());

            // Adding details in array list
            list.add(contact);
        }
        System.out.println(list);


    }
}
