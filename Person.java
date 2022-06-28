public class Person {
    private int nationalCode;
    private String name;
    //private String family;
    private int age;
    private String sex;
    private int digitalWallet;


    public Person() {
    }

    public Person(int nationalCode, String name, int age, String sex, int digitalWallet) {
        this.nationalCode = nationalCode;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.digitalWallet = digitalWallet;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDigitalWallet() {
        return digitalWallet;
    }

    public void setDigitalWallet(int digitalWallet) {
        this.digitalWallet = digitalWallet;
    }
}
