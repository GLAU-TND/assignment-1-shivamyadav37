package definition;

import adt.ContactsADT;
import org.w3c.dom.Node;

import java.util.ArrayList;

public class ListOfContacts<E> implements ContactsADT<E> {
    ArrayList listName = new ArrayList<String>();
    ArrayList listNameFirstName = new ArrayList<String>();
    private Node<E> head;
    private int size= 0;
    private int counter = 0;

    //Created addFirst method
    private void addFirst(E data){
        head = new Node<>(data,head);
        size++;
    }

    private




    @Override
    public boolean addContact(E item) {
        return false;
    }

    @Override
    public void viewContacts() {

    }

    @Override
    public void searchInContacts(E item) {

    }

    @Override
    public boolean deleteFromContacts(int index) {
        return false;
    }
}
