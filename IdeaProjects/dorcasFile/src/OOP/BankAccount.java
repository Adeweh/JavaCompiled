package OOP;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(1432, 25.56, "Adeh", "myemail@adeh.com",220992);
        System.out.println("I call the main constructor");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("I am the main constructor");
    }
    public BankAccount(String name, String email, int phoneNumber) {
        this(12456, 56.22, name,email,phoneNumber);
        System.out.println("can i still call main constructor");

    }

    public int getAccountNumber() {
        return accountNumber;
    }

//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(int balance) {
//        this.balance = balance;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
    public void depositFunds(double amount){
        balance+= amount;
        System.out.println("Deposit amount " + amount +  " made. New balance is " + balance);
    }
    public  void withdrawFunds(double amount){
        if(balance - amount < 0){
            System.out.println("Insufficient funds");
        }else {
            balance -= amount;
            System.out.println("Withdrawal of "+ amount + " made. Remaining balance is " + balance);
        }

    }
}
