package main;

import definition.ListOfContacts;
import definition.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListOfContacts listOfContactsObj = new ListOfContacts();
        String contactFirstName;
        String contactLastName;
        String[] contactNumber;
        String emailOfContact;
        boolean ctr;
        while (ctr==true){
            System.out.println("Welcome to Shivam's Contact List App");
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:

            }

        }

    }
}
