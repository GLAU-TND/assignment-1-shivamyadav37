package adt;

public interface ContactsADT<E> {
    //for Adding contacts
    boolean addContact(E item);

    void viewContacts();
    void searchInContacts();
    void deleteFromContacts();
    void printContact();


}
