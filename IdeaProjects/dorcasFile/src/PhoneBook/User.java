package PhoneBook;

import java.util.Objects;

public class User {
    private final String userName;
    private final String passWord;
    private PhoneBook phoneBook;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        phoneBook = new PhoneBook();
        
    }

    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

    public void add(Contact contact) {
        phoneBook.add(contact);
    }

    public void remove(Contact contact) {
        phoneBook.remove(contact);
    }

    public Contact getContact(String info) {
        return phoneBook.getContact(info);
    }

    public Contact[] getAllContacts() {
        return phoneBook.getAllContacts();
    }

    public String getUserName() {
        return userName;
    }

    public boolean checkPassWord(String passWord) {
        return Objects.equals(this.passWord, passWord);
    }
}
