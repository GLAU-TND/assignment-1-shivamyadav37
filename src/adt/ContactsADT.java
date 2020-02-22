package adt;

public interface ContactsADT<E> {
    //for Adding contacts
    boolean addContact(E item);
    //for viewing Contacts
    void viewContacts();
    //for Searching contacts from the Contact List
    void searchInContacts();
    //for Deleting any contact from Contact List
    void deleteFromContacts();
    //for Printing Contacts from Contact List
    void printContact();


}
