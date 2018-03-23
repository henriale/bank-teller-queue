public class Client {
    public static final int SENIORITY_START_AGE = 65;

    private int age;
    private String name;

    public Client(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
