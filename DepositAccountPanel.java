import java.util.Scanner;

public class DepositAccountPanel {

    public void depositAccountPanel() throws Exception {
        Scanner input = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        OpeningAccount openingAccount = new OpeningAccount();
        boolean again = true;

        while (again) {
            System.out.println("ShortTerm(sh) " +
                    "LongTerm(lo) " +
                    "Special(sp)\n" +
                    "Back(ba) ");
            String inputMenu = input.next();
            switch (inputMenu) {
                case "sh"://insert
                    System.out.println("Enter : AccountNumber, OwnerNationalCode, Balance, DateOfOpeningAccount ");
                    openingAccount.openShortTermDepositAccount(inputMenu,input.next(),input.next(),input.nextInt(),input.next());
                    break;

                case "lo":
                    System.out.println("Enter : AccountNumber, OwnerNationalCode, Balance, DateOfOpeningAccount ");
                    openingAccount.openLongTermDepositAccount(inputMenu,input.next(),input.next(),input.nextInt(),input.next());

                    break;

                case "sp":
                    System.out.println("Enter : AccountNumber, OwnerNationalCode, Balance, DateOfOpeningAccount ");
                    openingAccount.openSpecialDepositAccount(inputMenu,input.next(),input.next(),input.nextInt(),input.next());
                    break;

                case "ba":
                    again = false;
                    break;

                default:
                    throw new RuntimeException("invalid type");
            }
        }
    }
}
