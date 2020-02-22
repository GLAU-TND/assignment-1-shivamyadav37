package definition;

public class Person {
    //Declaring all the Variables , that will get used
    private String contactFirstName;
    private String contactLastName;
    private String[] contactNumber;
    private String emailOfContact;

    public Person(String contactFirstName, String contactLastName, String[] contactNumber, String emailOfContact) {
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.contactNumber = contactNumber;
        this.emailOfContact = emailOfContact;
    }

}


