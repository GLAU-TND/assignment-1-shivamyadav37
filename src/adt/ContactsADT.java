package adt;

public interface ContactsADT<E> {
    //for Adding contacts
    boolean addContact(E item);
    //for viewing Contacts
    void viewContacts();
    //for Searching contacts from the Contact List
    void searchInContacts();
    //
    void deleteFromContacts();
    void printContact();


}
