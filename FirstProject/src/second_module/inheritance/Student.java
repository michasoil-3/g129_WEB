package second_module.inheritance;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourse = 0;

    public Student() {
        this.gpa = 999.9;
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addCourse(String course) {
        this.courses[this.indexOfCourse] = course;
        this.indexOfCourse++;
    }

    @Override
    public void getData() {
        System.out.println("ID: " + this.id + ". FULL NAME: " + this.name + " " + this.surname + ". LOGIN: " +
                this.login + ". PASSWORD: " + this.password + ". GPA: " + this.gpa + "\nCOURSES:");
        for (int i = 0; i < this.indexOfCourse; i++) {
            System.out.println(this.courses[i]);
        }
    }
}
