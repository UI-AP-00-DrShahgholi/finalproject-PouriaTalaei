import java.util.Scanner;

public class BankSystemPanel {
    public void bankPanel() throws Exception {
        Scanner input = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        boolean again = true;
        while (again) {
            System.out.println(
                    "1.Open Account\n" +
                            "2.Deposit\n" +
                            "3.Withdraw\n" +
                            "4.Transfer\n" +
                            "5.Sell Estate\n" +
                            "6.Get CreditCard\n" +
                            "7.Get CheckBook\n" +
                            "8.Back");

            switch (input.next()) {
                case "1"://insert
                    System.out.println("1.CurrentAccount 2.");
                    System.out.println("Enter :  AccountNumber, OwnerNationalCode, Balance, DateOfOpeningAccount ");
                    userManagement.insertAccounts(input.next(),input.next(),input.nextInt(),input.next());
                    break;

                case "2":

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":

                    break;

                case "6":

                    break;

                case "7":

                    break;
                case "8":
                    break;

            }
        }
    }
}