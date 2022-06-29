public final class Admin {
    private static Admin instance;



    private Admin() {
    }

    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }
}



    /*
public final class Singleton {
    private static Singleton Instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Instance == null) {
            Instance = new Singleton();
        }
        return Instance;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();




    final class Watchman extends Employee {
        ArrayList<EntryExitOfEmployees> entryExitOfEmployees = new ArrayList<>();

        private static Watchman instance;

        private Watchman() {
            super();
            this.setName("Hares");
            this.setFamily("Pasdar");
            this.setUsername("Watchman");
            this.setPassword("Watchman");
            this.setPhoneNumber("09033366606");
            this.setEmail("talaei.pouria06@gmail.com");
            this.setPersonalNumber("123456");
        }

        public static Watchman getInstance(){
            if (instance == null)
                instance = new Watchman();
            return instance;
        }

        @Override
        public void getPaid() {

        }

        @Override
        public void showListOfDayWork() {

        }
    }

}
*/