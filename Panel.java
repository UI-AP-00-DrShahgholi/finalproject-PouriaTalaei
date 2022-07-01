import java.util.Scanner;

public class Panel {
    public static void printPanel() throws Exception {
        Scanner input = new Scanner(System.in);
        Admin admin = Admin.getInstance();
        AdminManagement adminManagement = new AdminManagement();
        RegistrationSystemEstatePanel estatePanel = new RegistrationSystemEstatePanel();
        RegistrationSystemPeoplePanel peoplePanel = new RegistrationSystemPeoplePanel();
        //boolean login;
        boolean exit = false;
        while (!exit) {
            // login = false;
//            System.out.println("Login: 1.as admin  2.as doctor  3.as patient 4.as orderly 5.as watchman \n6.Enrol patient  7.eXit");
            System.out.println("1.RegistrationSystem(People)  2.RegistrationSystem(Estate)  3.BankSystem");

            switch (input.next()) {
                case "1"://people
                    peoplePanel.peoplePanel(adminManagement);
                    break;

                case "2":
                    estatePanel.estatePanel(adminManagement);
                    break;
                     /*   System.out.println("Enter username & password");
                        if (manager.adminLogin(input.next(), input.next())) {
                            System.out.println("Login Successfully ");
                            login = true;
                            adminPanel.adminPanel(manager, manager.orderly, orderlyManagement);
                        } else System.out.println("username or password is incorrect! try again");

                    break;

                case "2":
                    while (!login) {
                        System.out.println("Enter username & password");
                        String username = input.next();
                        String password = input.next();
                        if (doctorManagement.doctorLogin(username, password, manager)) {
                            System.out.println("Login Successfully ");
                            login = true;
                            EntryExitOfEmployees entryExitOfEmployeesOfDoctor = new EntryExitOfEmployees();
                            doctorManagement.setEntryTime(entryExitOfEmployeesOfDoctor, username);
                            doctorPanel.doctorPanel(username, patientManagement, doctorManagement, manager, entryExitOfEmployeesOfDoctor);
                        } else System.out.println("username or password is incorrect! try again");
                    }
                    break;

                case "3":
                    while (!login) {
                        System.out.println("Enter username & password");
                        String username = input.next();
                        String password = input.next();
                        if (patientManagement.patientLogin(username, password)) {
                            System.out.println("Login Successfully ");
                            login = true;
                            patientPanel.patientPanel(username, patientManagement, doctorManagement, manager);
                        } else System.out.println("username or password is incorrect! try again");
                    }
                    break;

                case "4":
                    System.out.println("Enter username & password");
                    if (orderlyManagement.orderlyLogin(input.next(), input.next())) {
                        System.out.println("Login Successfully ");
                        login = true;
                        orderlyPanel.orderlyPanel(orderlyManagement, manager.orderly);
                    } else System.out.println("username or password is incorrect! try again");
                    break;


                case "5":
                    System.out.println("Enter username & password");
                    if (watchmanManagement.watchmanLogin(input.next(), input.next())) {
                        System.out.println("Login Successfully ");
                        login = true;
                        watchmanPanel.watchmanPanel(watchmanManagement);
                    } else System.out.println("username or password is incorrect! try again");
                    break;


                case "6":
                    System.out.println("Enter Name & Family & Username & Password & PhoneNumber & Email");
                    patientManagement.enrolPatient(input.next(), input.next(), input.next(), input.next(), input.next(), input.next());
                    System.out.println("Enrol Successfully");
                    break;

                case "7":
                    exit = true;
                    break;
            }
        }
    }

*/
            }
        }
    }
}
