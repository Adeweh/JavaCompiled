package Regex;

public class RegexSamples {

    public static boolean validatePhoneNumber(String number) {
        return number.matches("[+]234[7-9][0-1]\\d{8}|0[7-9][0-1]\\d{8}") ;
    }

    public static boolean validateEmail(String email) {
        return email.matches("[a-z]+\\d*[a-z]+\\d*.[a-z]*@[a-z]+[.]com");
    }

    public static boolean validatePassword(String password) {
        return password.matches("[A-Z]*[a-z]*\\d*@*\\d+");
    }
}
