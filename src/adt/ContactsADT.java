package adt;

public interface ContactsADT<E> {
    boolean addContact(E item);
    void viewContacts();
    void searchInContacts();
    void deleteFromContacts();
    void printContact();


}
