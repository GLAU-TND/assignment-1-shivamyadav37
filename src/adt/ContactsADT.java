package adt;

public interface ContactsADT<E> {
    //for Adding contacts
    boolean addContact(E item);
    //for viewing Contacts
    void viewContacts();
    //for Searching contacts from the Contact List
    void searchInContacts(String name);
    //for Deleting any contact from Contact List
    boolean deleteFromContacts(int index);
    //for Printing Contacts from Contact List
   // void printContact();


}
