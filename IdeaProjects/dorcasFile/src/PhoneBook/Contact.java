package PhoneBook;

public class Contact {
    private String phoneNumber;
    private String contactName;

    private String emailAddress;

    private String homeAddress;

    public Contact(String contactName, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
        emailAddress = "";
        homeAddress = "";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }

    public String getAddress() {
        return homeAddress;
    }

    public void setAddress(String address) {
        this.homeAddress = address;
    }

    @Override
    public String toString() {

        return String.format("""
    Contact Name: %s
    Phone Number: %s
    Email Address: %s
    Home Address: %s
    """, getContactName(), getPhoneNumber(), getEmailAddress(), getAddress());
    }
}
