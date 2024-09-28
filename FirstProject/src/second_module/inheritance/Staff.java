package second_module.inheritance;

public class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
        this.salary = -1;
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        this.subjects[this.indexOfSubject] = subject;
        this.indexOfSubject++;
    }

    @Override
    public void getData() {
        System.out.println("ID: " + this.id + ". FULL NAME: " + this.name + " " + this.surname + ". LOGIN: " +
                this.login + ". PASSWORD: " + this.password + ". SALARY: " + this.salary + "\nSUBJECTS:");
        for (int i = 0; i < this.indexOfSubject; i++) {
            System.out.println(this.subjects[i]);
        }
    }
}
