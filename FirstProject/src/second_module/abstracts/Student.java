package second_module.abstracts;

public class Student extends User {
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    String getUserData() {
        // "ID: 1. LOGIN: zhansaya@mail.ru. PASSWORD: qwerty. NAME: Zhansaya. SURNAME: Kulbaeva. GROUP: IT1-2015. GPA: 4.0"
        return "ID: " + this.getId() + ". LOGIN: " + this.getLogin() + ". PASSWORD: " + this.getPassword() + ". NAME: " + this.name +
                ". SURNAME: " + this.surname + ". GROUP: " + this.group + ". GPA: " + this.gpa;
    }
}
