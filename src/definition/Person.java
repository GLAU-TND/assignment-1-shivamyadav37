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

    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String[] getContactNumber() {
        return contactNumber;
    }

    public String getEmailOfContact() {
        return emailOfContact;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public void setContactNumber(String[] contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmailOfContact(String emailOfContact) {
        this.emailOfContact = emailOfContact;
    }
}


