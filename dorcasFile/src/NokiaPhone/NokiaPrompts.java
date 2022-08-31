package NokiaPhone;

import java.util.Scanner;

public class NokiaPrompts {

    private static String receive;

    private static int number;

    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu () {
        receive = """
        1 for Phone Book
        2 for Messages
        3 for Chat
        4 for Call
        5 for Tones
        6 for Settings
        7 for Call Divert
        8 for Games
        9 for Calculator
        10 for Reminders
        11 for Clock
        12 for Profiles
        13 for SIM services
        """;

        System.out.println(receive);

        number = userInput.nextInt();
        switch (number) {
            case 1 -> phoneBook();
            case 2 -> messages();
            case 3 -> chats();
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> games();
            case 9 -> calculator();
            case 10 -> reminder();
            case 11 -> clock();
            case 12 -> profiles();
            case 13 -> simServices();
            default -> System.out.println("Invalid number ");
        }
}
        public static void mainClock (String menuName){
            receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
            System.out.println(receive);
            number = userInput.nextInt();
            switch (number) {
                case 1-> System.out.println(menuName);
                case 0-> clock();
            }
       }public static void securitySettings(){
        System.out.println("""
                                press 1 for PIN code request:
                                press 2 for Call barring service:
                                press 3 for Fixed dialing:
                                press 4 for Closed user group:
                                press 5 for Phone Security:
                                press 6 for Change access codes:
                                press 7 for Previous menu:\s""");
        int securitySettings = userInput.nextInt();
        switch (securitySettings) {
            case 1 -> mainSecuritySettings("PIN code request.");
            case 2 -> mainSecuritySettings("Call barring servic display. ");
            case 3 -> mainSecuritySettings("Fixed dialing. ");
            case 4 -> mainSecuritySettings("Closed user group. ");
            case 5 -> mainSecuritySettings("Phone Security. ");
            case 6 -> mainSecuritySettings("Change access codes"); case 7 -> settings();
        }
       }public static void mainSecuritySettings (String menuName){
            receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
            System.out.println(receive);
            number = userInput.nextInt();
            switch (number) {
                case 1-> System.out.println(menuName);
                case 0-> securitySettings();}}public static void phoneSettings(){
        System.out.println("""
                                press 1 for Language:
                                press 2 for Cell info display:
                                press 3 for Welcome note:
                                press 4 for Network selection:
                                press 5 for Lights:
                                press 6 for Confirm SIM service actions
                                press 7 for Previous menu:\s""");
        int phoneSettings = userInput.nextInt();
        switch (phoneSettings) {
            case 1 -> mainPhoneSettings("Language");
            case 2 -> mainPhoneSettings("Cell info display");
            case 3 -> mainPhoneSettings("Welcome note");
            case 4 -> mainPhoneSettings("Network Selection");
            case 5 -> mainPhoneSettings("Lights");
            case 6 -> mainPhoneSettings("Confirm SIM service actions"); case 7 ->settings();       }
       }public static void mainPhoneSettings (String menuName){
            receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
            System.out.println(receive);
            number = userInput.nextInt();
            switch (number) {
                case 1-> System.out.println(menuName);
                case 0-> phoneSettings();} }public static void callSettings(){
        System.out.println("""
                                press 1 for Automatic redial:
                                press 2 for Speed dialing:
                                press 3 for Call waiting options:
                                press 4 for Own number sending:
                                press 5 for phone line in use:
                                press 6 for Automatic answer:
                                press 7 for Previous menu:\s""");
        int callSettings = userInput.nextInt();
        switch (callSettings) {
            case 1 -> mainCallSettings("Automatic redial");
            case 2 -> mainCallSettings("Speed dialing");
            case 3 -> mainCallSettings("Call waiting options");
            case 4 -> mainCallSettings("Own number sending");
            case 5 -> mainCallSettings("Phone line in use");
            case 6 -> mainCallSettings("Automatic answer");  case 7 -> settings();}
        }public static void mainCallSettings (String menuName){
            receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
            System.out.println(receive);
            number = userInput.nextInt();
            switch (number) {
                case 1-> System.out.println(menuName);
                case 0-> callSettings();}
    }public static void mainSettings (String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> settings();
        }
    }
    public static void mainTones(String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> tones();
        }
    }public static void callCostSetting(){
        System.out.println("press 1 for call cost limit:\npress 2 for show costs in:\npress 3 for Previous menu: ");
        int callCostSettings = userInput.nextInt();
        switch (callCostSettings) {
            case 1 -> mainCallCostSettings("Call cost limit");
            case 2 -> mainCallCostSettings("Show costs in");case 3-> callRegister();}
        }public static void mainCallCostSettings (String menuName){
            receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
            System.out.println(receive);
            number = userInput.nextInt();
            switch (number) {
                case 1-> System.out.println(menuName);
                case 0-> callCostSetting();}
    }public static void showCallCosts(){
        System.out.println("""
                                press 1 for last call cost:
                                press 2 for All calls cost:
                                press 3 for clear counters:
                                press 4 for Previous menu:\s""");
        int showCallCost = userInput.nextInt();
        switch (showCallCost) {
            case 1 -> mainShowCallCost("Last call cost");
            case 2 -> mainShowCallCost("All calls cost");
            case 3 -> mainShowCallCost("Clear counters");case 4-> callRegister();}
        }public static void mainShowCallCost (String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> showCallCosts();}
    }public static void showCallDuration(){
        System.out.println("""
                                press 1 for last call duration:
                                press 2 for All calls duration:
                                press 3 for Received calls duration:
                                press 4 for Dialled calls duration:
                                press 5 for Clear timers:
                                press 6 for Previous menu:""");
        int showCallDuration = userInput.nextInt();
        switch (showCallDuration) {
            case 1 -> mainShowCallDuration("Last call duration");
            case 2 -> mainShowCallDuration("All calls duration");
            case 3 -> mainShowCallDuration("Received calls duration");
            case 4 -> mainShowCallDuration("Dialed calls duration");
            case 5 -> mainShowCallDuration("Clear timers"); case 6 -> callRegister();
        }
    }  public static void mainShowCallDuration (String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> showCallDuration();
        }
    }public static void mainCallRegister (String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> callRegister();
        }
    }
    public static void options(){
        System.out.println("press 1 for Type of view:\npress 2 for Memory Status\npress 3 for previous menu: ");
        int Options = userInput.nextInt();
        switch (Options) {
            case 1 -> mainOptions("Type of view");
            case 2 -> mainOptions("Memory status");
            case 3 -> phoneBook();
        }
    }
    public static void mainOptions (String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> options();
        }
    }

    public static void mainPhoneBook (String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> phoneBook();
        }
    }
    public static void messageSettings(){
        System.out.println("press 1 for set 1:\npress 2 for Common:\npress 3 for Previous menu: ");
        int Options = userInput.nextInt();
        switch (Options) {
            case 1 -> setSettings();
            case 2 -> commonSettings();     case 3 -> messages();
        }
    }
    public static void mainMessageSettings(String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> messageSettings();
        }
    } public static void setSettings(){
        System.out.println("press 1 for Message centre number:\npress 2 for Messages sent as:\npress 3 for Messages validity:\npress 4 for Previous menu: ");
        int setOne = userInput.nextInt();
        switch (setOne) {
            case 1 -> mainMessageSettings("Message centre number");
            case 2 -> mainMessageSettings("Message sent as");
            case 3 -> mainMessageSettings("Message validity");       case 4 -> messageSettings();
        }
    } public static void commonSettings(){
        System.out.println("press 1 for Delivery reports:\npress 2 for Reply via same centre sent as:\npress 3 for Character support:\npress 4 for Previous Menu: ");
        int common = userInput.nextInt();
        switch (common) {
            case 1 -> System.out.println("Delivery reports");
            case 2 -> System.out.println("Reply via same centre");
            case 3 -> System.out.println("Character support");     case 4 -> messageSettings();
        }
    }
 
 public static void phoneBook() {
        receive = """
                        1 for Search
                        2 for Service Nos
                        3 for Add name
                        4 for Erase
                        5 for Edit
                        6 for Assign tone
                        7 for Send b'card
                        8 for Options
                        9 for Speed dials
                        10 for Voice tags
                        11 for Main menu
                        """;
        System.out.println(receive);
        int phoneBook = userInput.nextInt();

        switch (phoneBook) {
            case 1 -> mainPhoneBook("Search");
            case 2 -> mainPhoneBook("Service Nos.");
            case 3 -> mainPhoneBook("Add name.");
            case 4 -> mainPhoneBook("Erase.");
            case 5 -> mainPhoneBook("Edit.");
            case 6 -> mainPhoneBook("Assign tone.");
            case 7 -> mainPhoneBook("Send b'card.");
            case 8 -> options();
            case 9 -> mainPhoneBook("Speed dials.");
            case 10 ->mainPhoneBook("Voice tags.");
            case 11 -> mainMenu();
            default -> System.out.println("Enter a valid number: ");

        }
    }
    public static void mainMessages (String menuName){
        receive = "1. "+ menuName + """
                        
                        0 for Previous menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println(menuName);
            case 0-> messages();
        }
    }

    public static void messages() {
    receive = """
                        1 for Write Messages
                        2 for Inbox
                        3 for Outbox
                        4 for Picture messages
                        5 for Templates
                        6 for Smileys
                        7 for Message Settings
                        8 for Info service
                        9 for Voice mailbox number
                        10 for Service command editor
                        11 for Main menu
                        """;

                System.out.println(receive);
    int messages = userInput.nextInt();

                switch (messages) {
        case 1 -> mainMessages("Write Messages");
        case 2 -> mainMessages("Inbox.");
        case 3 -> mainMessages("Outbox.");
        case 4 -> mainMessages("Picture messages");
        case 5 -> mainMessages("Templates");
        case 6 -> mainMessages("Smileys.");
        case 7 -> messageSettings();
                case 8 -> mainMessages("Info service");
                case 9 -> mainMessages("Voice mailbox number");
                case 10 ->mainMessages("service command editor");
                case 11 -> mainMenu();
                default -> System.out.println("Enter a valid number: ");


            }
        }

public static void chats (){
    receive = """
                        1.Chat
                        0 for Main Menu
                        """;
                System.out.println(receive);
                number = userInput.nextInt();
                switch (number) {
                    case 1-> System.out.println("Chat");
                    case 0-> mainMenu();
                }
                }

public static void callRegister (){
    receive = """
                        1 for Missed Calls.
                        2 for Received Calls.
                        3 for Dialed Calls
                        4 for Erase recent call lists
                        5 for Show call duration
                        6 for Show call costs
                        7 for Call costs settings
                        8 for Prepaid credit
                        9 for Main menu
                        """;

                System.out.println(receive);

    int callRegister = userInput.nextInt();

                switch (callRegister) {
        case 1 ->mainCallRegister("Missed calls");
        case 2 ->mainCallRegister("Received calls");
        case 3 ->mainCallRegister("Dialed calls");
        case 4 ->mainCallRegister("Erase recent call lists");
        case 5 -> showCallDuration();
        case 6 -> showCallCosts();
        case 7 -> callCostSetting();
        case 8 -> mainCallRegister("Prepaid Credit.");
        case 9 -> mainMenu();
        default -> System.out.println("Enter a valid number: ");

    }
}
public static void tones(){
    receive= """
                        1 for Ringing tone
                        2 for Ringing volume
                        3 for Incoming call alert
                        4 for Composer
                        5 for Message alert tone
                        6 for Keypad tones
                        7 for Warning and game tones
                        8 for Vibrating alert
                        9 for Screen saver
                        10 for Main menu
                        """;
                System.out.println(receive);

    int tones = userInput.nextInt();

                switch (tones) {
        case 1 -> mainTones("Ringing tone");
        case 2 -> mainTones("Ringing volume.");
        case 3 -> mainTones("Incoming call alert.");
        case 4 -> mainTones("Composer.");
        case 5 -> mainTones("Message alert tone.");
        case 6 -> mainTones("Keypad tones.");
        case 7 -> mainTones("Warning and game tones.");
        case 8 -> mainTones("Vibrating alert.");
        case 9 -> mainTones("Screen saver.");
        case 10 -> mainMenu();

    }
}
public static void settings(){
    receive = """
                        1 for Call settings
                        2 for Phone settings
                        3 for Security settings
                        4 for Restore factory settings
                        5 for Main menu
                        
                        """;

                System.out.println(receive);

    int settings = userInput.nextInt();
                switch (settings) {
        case 1 ->callSettings();
        case 2 -> phoneSettings();
        case 3 -> securitySettings();
        case 4 -> mainSettings("Restore factory settings.");
        case 5 -> mainMenu();
        default -> System.out.println("Enter a valid number: ");
    }
}
private static void callDivert(){
    receive = """
                        1.Call Divert
                        0 for Main Menu
                        """;
    System.out.println(receive);
    number = userInput.nextInt();
    switch (number) {
        case 1-> System.out.println("Call divert");
        case 0-> mainMenu();
    }
}
private static void games(){
    receive = """
                        1.Games
                        0 for Main Menu
                        """;
    System.out.println(receive);
    number = userInput.nextInt();
    switch (number) {
        case 1-> System.out.println("Games");
        case 0-> mainMenu();
    }
}
        private static void calculator(){
            receive = """
                        1.Calculator.
                        0 for Main Menu
                        """;
            System.out.println(receive);
            number = userInput.nextInt();
            switch (number) {
                case 1-> System.out.println("Calculator");
                case 0-> mainMenu();
            }
        }private static void reminder(){
        receive = """
                        1.Reminder.
                        0 for Main Menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println("Reminder");
            case 0-> mainMenu();
        }
    }
private static void clock() {
    receive = """
             1 for Alarm Clock
             2 for Clock settings
             3 for Date settings
             4 for Stopwatch
             5 for Countdown timer
             6 for Auto update of date and time
             7 for Main menu
            """;

    System.out.println(receive);
    int clock = userInput.nextInt();

    switch (clock) {
        case 1 -> mainClock("Alarm clock");
        case 2 -> mainClock("Clock settings");
        case 3 -> mainClock("Date setting");
        case 4 -> mainClock("Stopwatch.");
        case 5 -> mainClock("Countdown timer");
        case 6 -> mainClock("Auto update of date and time");
        case 7 -> mainMenu();
    }
}
    private static void profiles(){
        receive = """
                        1.Profiles.
                        0 for Main Menu
                        """;
        System.out.println(receive);
        number = userInput.nextInt();
        switch (number) {
            case 1-> System.out.println("Profiles");
            case 0-> mainMenu();
        }
    }
private static void simServices(){
    receive = """
                        1.SIM Services
                        0 for Main Menu
                        """;
    System.out.println(receive);
    number = userInput.nextInt();
    switch (number) {
        case 1-> System.out.println("SIM Services");
        case 0-> mainMenu();
    }
}
}









