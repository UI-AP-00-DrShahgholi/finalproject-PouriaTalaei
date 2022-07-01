import java.util.Scanner;

public class BankSystemPanel {
    public void bankPanel() throws Exception {
        Scanner input = new Scanner(System.in);
        AdminManagement adminManagement = new AdminManagement();
        OpenAccountPanel openAccountPanel = new OpenAccountPanel();
        BankingOperations bankingOperations = new BankingOperations();
        boolean again = true;
        while (again) {
            System.out.println(
                    "1.Open Account\n" +
                            "2.Deposit\n" +
                            "3.Withdraw\n" +
                            "4.Transfer\n" +
                            "5.Sell Estate\n" +
                            "6.Back");

            switch (input.next()) {
                case "1":
                    openAccountPanel.openAccountPanel();
                    break;

                case "2":
                    System.out.println("Enter : OwnerNationalCode, AccountNumber, Money ");
                    bankingOperations.depositProcess(input.next(), input.next(), input.nextInt());
                    break;

                case "3":
                    System.out.println("Enter : OwnerNationalCode, AccountNumber, Money ");
                    bankingOperations.withdrawProcess(input.next(), input.next(), input.nextInt());
                    break;

                case "4":
                    System.out.println("Enter : OriginOwnerNationalCode, OriginAccountNumber, DestinationOwnerNationalCode, DestinationAccountNumber, Money");
                    bankingOperations.moneyTransfer(input.next(), input.next(), input.next(), input.next(), input.nextInt());
                    break;

                case "5":
                    System.out.println("Enter : OwnerNationalCode");
                    adminManagement.deleteEstate(input.nextInt());
                    break;

                case "6":
                    again = false;
                    break;

                default:
                    System.out.println("Enter carefully!");
                    break;            }
        }
    }
}