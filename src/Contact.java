public class Contact {


    /*
    1-  Create the Private instance variables
    firstName, lastName, Company, phoneNumber, emails, city
    2- Create getters and setter for this variables
    3- Create the constructor to initialize your instance variables and constructor must be private
    4- Create one method to instantiate object of contact,
    otherwise since constructor is private you can not instantiate
     */

    private String firstName;
    private String lastName;
    private String company;
    private int phoneNumber;
    private String email;
    private String city;

    public Contact() {

    }
    private Contact(String firstName,String lastName, String company, int phoneNumber, String email, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }


}
