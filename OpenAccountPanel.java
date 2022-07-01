import java.util.Scanner;

public class OpenAccountPanel {
    public void openAccountPanel() throws Exception {
        Scanner input = new Scanner(System.in);
        OpeningAccount openingAccount = new OpeningAccount();
        DepositAccountPanel depositAccountPanel = new DepositAccountPanel();
        boolean again = true;
        while (again) {
            System.out.println("1.DepositAccount\n" +
                    "2.CurrentAccount\n" +
                    "3.FreeLoanAccount\n" +
                    "4.Back ");
            switch (input.next()) {
                case "1"://insert
                    depositAccountPanel.depositAccountPanel();
                    break;

                case "2":
                    System.out.println("Enter : AccountNumber, OwnerNationalCode, Balance, DateOfOpeningAccount, OwnerName, CardNumber, CVV2, ExpirationDate, CheckNumber, Page");
                    openingAccount.openCurrentAccount(input.next(), input.next(), input.nextInt(), input.next(), input.next(), input.next(), input.nextInt(), input.next(), input.nextInt(), input.nextInt());
                    break;

                case "3":
                    System.out.println("Enter : AccountNumber, OwnerNationalCode, Balance, DateOfOpeningAccount, OwnerName, CardNumber, CVV2, ExpirationDate");
                    openingAccount.openFreeLoanAccount(input.next(), input.next(), input.nextInt(), input.next(), input.next(), input.next(), input.nextInt(), input.next());
                    break;

                case "4":
                    again = false;
                    break;

                default:
                    System.out.println("Enter carefully!");
                    break;
            }
        }
    }
}
