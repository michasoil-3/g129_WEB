package second_module.interfaces;

public interface EmployeeInterface {
    Employee search(String fullName);
    Employee oldestEmployee();
    Employee smallestEmployee();
    void addEmployee(Employee e);
    void deleteEmployee(int index);
    void printEmployee();
}
