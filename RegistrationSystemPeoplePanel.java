import java.util.Scanner;

public class RegistrationSystemPeoplePanel {
    public void peoplePanel(AdminManagement adminManagement) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean again = true;
        while (again) {
            System.out.println(
                    "1.Add Person\n" +
                            "2.Edit\n" +
                            "3.Delete\n" +
                            "4.Load Information\n" +
                            "5.Back");
            switch (input.next()) {
                case "1"://insert
                    System.out.println("Enter : NationalCode,  Name, Age, Sex, DigitalWallet ");
                    adminManagement.insertPeople(input.nextInt(), input.next(), input.nextInt(), input.next(), input.nextInt());
                    break;

                case "2"://update
                    System.out.println("Enter : ID, NationalCode, Name, Age, Sex, DigitalWallet  to Update information");
                    adminManagement.updatePeople(input.nextInt(), input.nextInt(), input.next(), input.nextInt(), input.next(), input.nextInt());
                    break;

                case "3"://delete
                    System.out.println("Enter : ID for delete");
                    adminManagement.deletePeople(input.nextInt());
                    break;

                case "4"://load
                    System.out.println("Enter : NationalCode  to show information");
                    adminManagement.loadPeople(input.nextInt());
                    break;

                case "5":
                    again = false;
                    break;

                default:
                    System.out.println("Enter carefully!");
                    break;
            }
        }
    }
}
