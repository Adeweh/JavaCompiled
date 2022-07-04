package BankingApp;

public class Customer {
    private static  int countBVN = 1;
    private int BVN;
    private String name;
    private Gender gender;
    private  int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.BVN = countBVN;
        countBVN++;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public int getBVN() {
        return BVN;
    }

    public void resetId() {
        countBVN = 1;
    }
}
