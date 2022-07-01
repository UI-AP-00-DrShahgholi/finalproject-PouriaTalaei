import java.util.Scanner;

public class RegistrationSystemEstatePanel {
    public void estatePanel(AdminManagement adminManagement) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean again = true;
        while (again) {
            System.out.println(
                    "1.Add estate\n" +
                            "2.Edit\n" +
                            "3.Delete\n" +
                            "4.Load Information\n" +
                            "5.Back");
            switch (input.next()) {
                case "1"://insert
                    System.out.println("Enter : DocumentRegistrationCode, OwnerNationalCode, Address, PurchaseDate, Cost ");
                    adminManagement.insertEstate(input.nextInt(), input.nextInt(), input.next(), input.next(), input.nextInt());
                    break;

                case "2"://update
                    System.out.println("Enter : ID, DocumentRegistrationCode, OwnerNationalCode, Address, PurchaseDate, Cost   to Update information");
                    adminManagement.updateEstate(input.nextInt(), input.nextInt(), input.nextInt(), input.next(), input.next(), input.nextInt());
                    break;

                case "3"://delete
                    System.out.println("Enter : ID for delete");
                    adminManagement.deleteEstate(input.nextInt());
                    break;

                case "4"://load
                    System.out.println("Enter : ID  to show information");
                    adminManagement.loadEstate(input.nextInt());
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
