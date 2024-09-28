package second_module.inheritance;

public class Sportsman {
    protected String fullName;
    protected int age;
    protected String country;

    public Sportsman() {
        this.fullName = "John Doe";
        this.age = -1;
        this.country = "Wakanda";
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String play() {
        return "Sportsman " + this.fullName + " from " + this.country + " " + this.age + " years old is playing.";
    }
}
