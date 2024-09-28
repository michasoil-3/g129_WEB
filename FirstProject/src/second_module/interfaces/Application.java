package second_module.interfaces;

public class Application implements EmployeeInterface {
    Employee[] employees = new Employee[1000];
    int count = 0;

    @Override
    public Employee search(String fullName) {
        Employee e = new Employee();
        for (int i = 0; i < this.count; i++) {
            if (fullName.equals(this.employees[i].getFullName())) {
                return this.employees[i];
            }
        }
        return e;
    }

    @Override
    public Employee oldestEmployee() {
        Employee e = this.employees[0];
        for (int i = 0; i < this.count; i++) {
            if (this.employees[i].getAge() > e.getAge()) {
                e = this.employees[i];
            }
        }
        return e;
    }

    @Override
    public Employee smallestEmployee() {
        Employee e = this.employees[0];
        for (int i = 0; i < this.count; i++) {
            if (this.employees[i].getAge() < e.getAge()) {
                e = this.employees[i];
            }
        }
        return e;
    }

    @Override
    public void addEmployee(Employee e) {
        this.employees[this.count++] = e;
    }

    @Override
    public void deleteEmployee(int index) {
        this.employees[index] = null;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < this.count; i++) {
            if (this.employees[i] != null) {
                System.out.println(this.employees[i]);
            }
        }
    }
}
