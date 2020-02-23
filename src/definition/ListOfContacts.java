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

    //Created addAfter method
    private void addAfter (Node <E> node , E data){
        node.next = new Node<>(data , node.next);
        size++;
    }

    public int getSize() {
        return size;
    }

    //@Override
    public void addContact(int index , E data) {
        if(index<0 || index >size){
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        else if(size == 0){
            addFirst(E data);
        }
        else{
            Node<E> count = getNode(index - 1);
            addAfter(count,data);
        }
        //return false;
    }

    private Node<E> getNode(int index){
        Node<E> response = head;
        for(int i= 0; i < index ;i++){
            response= response.getNext();

        }
        return response;

    }

    public void setName(String contactFirstName) {
        this.listName = listName;
    }

    public ArrayList getListName() {
        return listName;
    }

    @Override
    public boolean addContact(E item) {
        addContact(size , data);
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
