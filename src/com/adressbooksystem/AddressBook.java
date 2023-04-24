package com.adressbooksystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    /*
     * Method for creating a contact
     * @param args
     */

    //Array List
    ArrayList<Contact> list = new ArrayList<>();

    public void addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how much contact you want to add");
        int noOfContact = sc.nextInt();
        // Taking for loop for add multiple contact details
        for (int i = 1; i <= noOfContact; i++) {
            Contact contact = new Contact();
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
        /*
         * 3)Created Method for editing Contacts
         */
    }

    public void editContact() {
        System.out.println("Please enter first name whose details you want to edit!");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for (Contact person : list) {
            if (name.equals(person.getFirstName())) {
                System.out.println("Enter First name to update");
                person.setFirstName(sc.next());
                System.out.println("Enter Last name to  update");
                person.setLastName(sc.next());
                System.out.println("Enter Address to  update");
                person.setAddress(sc.next());
                System.out.println("Enter City to update");
                person.setCity(sc.next());
                System.out.println("Enter State to update");
                person.setState(sc.next());
                System.out.println("Enter Zip to update");
                person.setZip(sc.nextInt());
                System.out.println("Enter Phone number to update");
                person.setPhoneNumber(sc.nextLong());
                System.out.println("Enter Email to update");
                person.setEmail(sc.next());
            } else {
                System.out.println("Enter contact not available");
            }
        }

        System.out.println(list);
    }

    /*
     * 4)Created method for deleting contacts
     */
    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name for deletion");
        String name = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getFirstName())) {
                list.remove(i);
                break;
            } else {
                System.out.println("Contact not available");
            }
        }
    }

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("----Welcome to Address Book----");
            System.out.println("Enter choice which you want to perform");
            System.out.println("Enter 1 to add contact");
            System.out.println("Enter 2 to edit contact");
            System.out.println("Enter 3 for deleting contact");

            /*
             * Taking Input of Choice
             */
            int button = sc.nextInt();
            switch (button) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                default:
                    b = false;


            }
        }
    }
}






