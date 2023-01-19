import java.util.ArrayList;

class Child extends Family {
    private String name;
    private int grade;
    private int age;

    private ArrayList<Hobby> hobbies;

    public Child(String familyName, String houseAddress, String name, int grade, int age) {
        super(familyName, houseAddress);
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addHobby(String name, String type) {
        hobbies.add(new Hobby(name, type));
    }

    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }
}
