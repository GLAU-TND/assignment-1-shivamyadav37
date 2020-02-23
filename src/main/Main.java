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
        String[] contactNumber = new String[5];
        String emailOfContact;
        boolean ctr;
        while (ctr==true){
            System.out.println("Welcome to Shivam's Contact List App");
            System.out.println("Press 1 to add a new contact\n" +"Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" + "Press 4 to delete a contact\n" + "Press 5 to exit program ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("You have chosen to add a new contact: \n" +"Please enter the name of the Person");
                    System.out.println("First Name:");
                    contactFirstName = scanner.nextLine();
                    System.out.println("Last Name:");
                    contactLastName = scanner.nextLine();
                    listOfContactsObj.setName(contactFirstName,contactLastName);
                    listOfContactsObj.setFirstNameInList(contactFirstName);
                    System.out.println("Contact Number:");
                    contactNumber[0]=scanner.nextLine();
                    for (int i = 1; i <= 2; i++) {
                        System.out.println("Would you like to add new Number?");
                        char response = scanner.next().charAt(0);
                        if (response == 'y') {
                            contactNumber[i] = scanner.next();
                        } else {
                            break;
                        }
                    }

                    


            }

        }

    }
}
