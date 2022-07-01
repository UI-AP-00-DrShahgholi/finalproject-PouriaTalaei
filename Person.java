public class Person {
    private int nationalCode;
    private String name;
    private int age;
    private String sex;
    private int wallet;

    public Person() {
    }

    public Person(int nationalCode, String name, int age, String sex, int wallet) {
        this.nationalCode = nationalCode;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.wallet = wallet;
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

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
