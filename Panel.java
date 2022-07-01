import java.util.Scanner;

public class Panel {
    public static void printPanel() throws Exception {
        Scanner input = new Scanner(System.in);
        Admin admin = Admin.getInstance();
        AdminManagement adminManagement = new AdminManagement();
        RegistrationSystemEstatePanel estatePanel = new RegistrationSystemEstatePanel();
        RegistrationSystemPeoplePanel peoplePanel = new RegistrationSystemPeoplePanel();
        BankSystemPanel bankPanel = new BankSystemPanel();
        Robbery robbery = new Robbery();

        boolean exit = false;
        while (!exit) {
            System.out.println("1.RegistrationSystem(People)  2.RegistrationSystem(Estate)  3.BankSystem  4.Robbery  5.eXit");

            switch (input.next()) {
                case "1"://people
                    peoplePanel.peoplePanel(adminManagement);
                    break;

                case "2":
                    estatePanel.estatePanel(adminManagement);
                    break;

                case "3":
                    bankPanel.bankPanel();
                    break;

                case "4":
                    robbery.robberyProcess();
                    break;

                case "5":
                    exit = true;
                    break;

                default:
                    System.out.println("Enter carefully!");
                    break;
            }
        }
    }
}
