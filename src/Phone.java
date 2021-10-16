import java.util.ArrayList;

public class Phone extends Contact{

    /*
       1- Create instance variables
       phoneBrand, phoneModel, SerialNumber, passCode and ArrayList<Contact> allContact
       2- Create constructor to initialize this variables
       3- Create the method to add new contact this method take one parameter as Contact
       4- Create the method to print all Contacts' first and last name with phone number
       5- Create the method to update person's phone number. This method takes two parameter old phone number and new phone number
       6- Create the method to search with phone number and print all other information for person
       7- create the method to search with name of person and print phone number of person
       8- Create the method to update city of person with new city, you need two parameter one is phone number of person another is new email address.
       9- Create the method to update email address for person with new email address, you need two parameter oldEmail and newEmail

       In this contact list only two things are unique Phone number and email address. You can not store same phone number and email address two times
       because of that before adding the new contact you need to make sure this phone number is not exist in your Contact arraylist.
     */

    String phoneBrand;
    String phoneModel;
    int serialNumber;
    int passCode;
    ArrayList<Contact> allContact=new ArrayList<>();

    public Phone(String phoneBrand, String phoneModel, int serialNumber, int passCode, ArrayList<Contact> allContact) {
        super();
//        this.phoneBrand = phoneBrand;
//        this.phoneModel = phoneModel;
//        this.serialNumber = serialNumber;
//        this.passCode = passCode;
//        this.allContact = allContact;
    }
    //       3- Create the method to add new contact this method take one parameter as Contact
    public void newContact(Contact newContact){
        allContact.add(newContact);
    }
    //       4- Create the method to print all Contacts' first and last name with phone number
    public void printAll(){

    }
}
