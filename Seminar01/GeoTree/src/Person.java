public class Person {
    private String fullName;
    private int age;
    private String sex;

    public Person(String fullName, int age, String sex) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "[" + fullName + ", " + age + ", " + sex + "]";
    }

}