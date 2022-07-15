package PhoneBook;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static PhoneBook phoneBook = new PhoneBook();
    private static final ArrayList<User> users = new ArrayList<>();
    private static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        introMenu();

    }

    private static void viewContact() {
        System.out.println("Enter name or phone number: ");
        String info = userInput.nextLine();

        Contact result = phoneBook.getContact(info);

        System.out.println(result);

        mainMenu();

    }
    private static void deleteContact() {
        System.out.println("Enter name or phone number to be deleted: ");
        String info = userInput.nextLine();

        Contact result = phoneBook.getContact(info);
        phoneBook.remove(result);

        System.out.println("Number successfully Deleted");

        mainMenu();

    }

    private static void addContact() {

        System.out.println("Enter phone Number: ");
        String number = userInput.nextLine();

        System.out.println("Enter Contact name: ");
        String name = userInput.nextLine();

        Contact entry = new Contact(name, number);

        System.out.println(entry.getPhoneNumber());
        phoneBook.add(entry);
        mainMenu();

    }
    private static void viewALlContact() {

        for(Contact contact: phoneBook.getAllContacts()) {
            System.out.println(contact);
        }
        mainMenu();
    }
    private static void editContact() {
        System.out.println("Enter name or phone number to be edited: ");
        String info = userInput.nextLine();
        Contact contact = phoneBook.getContact(info);

        String prompt = """
                What would you like to edit;
                1: Change Contact name
                2: Change Contact number
                3: Enter email Address
                4: Enter home address
                """;

        System.out.println(prompt);

        System.out.println("Enter an option: ");
        int edit = userInput.nextInt();
        userInput.nextLine();

        switch (edit){
            case 1-> {
                System.out.println("Enter name: ");
                String name = userInput.nextLine();
                contact.setContactName(name);
                mainMenu();
            }
            case 2 -> {
                System.out.println("Enter number: ");
                String number = userInput.nextLine();
                contact.setPhoneNumber(number);
                mainMenu();
            }
            case 3 ->{
                System.out.println("Enter email address: ");
                String email = userInput.nextLine();
                contact.setEmailAddress(email);
                mainMenu();
            }

            case 4 ->{
                System.out.println("Enter home address: ");
                String address  = userInput.nextLine();
                contact.setAddress(address);
                mainMenu();
            }
        }

        System.out.println("Contact Edited");


    }
    private static void mainMenu(){
        String prompt = """
                Welcome!!;
                1: Add contact
                2: Delete contact
                3: View contact
                4: View All Contact
                5: Edit contact
                0: Logout
                """;
        System.out.println(prompt);
        int number = userInput.nextInt();
        userInput.nextLine();

        switch (number){
            case 1 -> addContact();
            case 2 -> deleteContact();
            case 3 -> viewContact();
            case 4 -> viewALlContact();
            case 5 -> editContact();
            case 0 -> introMenu();
        }
    }
    private static void introMenu(){
        String prompt = """
                Dee's PhoneBook - Exceptional!!
                1: Register as New user
                2: Log in
                0: exit
                """;
        System.out.println(prompt);
        int number = userInput.nextInt();
        userInput.nextLine();

        switch (number){
            case 1 -> registrationPage();
            case 2 -> loginPage();
            case 3 -> System.exit(0);

    }
}

    private static void registrationPage() {
        System.out.println("Enter Username");
        String username = userInput.nextLine();

        System.out.println("Enter Password");
        String passWord = userInput.nextLine();

        User newUser = new User(username, passWord);
        users.add(newUser);

        mainMenu();

    }

    private static void loginPage() {
        System.out.println("Enter Username");
        String username = userInput.nextLine();

        for (User user: users) {
            if (Objects.equals(user.getUserName(), username)) {
                System.out.println("Enter Password");
                String passWord = userInput.nextLine();
                if(user.checkPassWord(passWord)){
                    mainMenu();
                }
            }
            else {
                System.out.println("Username not found!");
                loginPage();
            }

        }

    }
    }
