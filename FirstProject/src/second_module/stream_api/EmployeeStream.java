package second_module.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void printUniqueLastNames(List<Employee> employees) {
        employees.sort((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));
        employees.stream().map(Employee::getLastName).distinct().forEach(System.out::println);
    }

    public static double calculateAverageSalaryOfEmployeesYoungerThan30(List<Employee> employees) {
        return employees.stream().filter(e -> e.getAge() < 30).mapToDouble(Employee::getSalary).average().orElseThrow();
    }

    public static double findMaximumSalaryOfEmployeesOlderThan50(List<Employee> employees) {
        return employees.stream().filter(e -> e.getAge() > 50).mapToDouble(Employee::getSalary).max().orElseThrow();
    }

    public static void printAverageSalaryByAge(List<Employee> employees) {
        // используй groupingBy и сохрани в map объект, найди average
        List<Integer> ages = employees.stream().map(Employee::getAge).distinct().collect(Collectors.toList());
        for (int age: ages) {
            double average = employees.stream().filter(e -> e.getAge() == age).mapToDouble(Employee::getSalary).average().orElseThrow();
            System.out.println("Average salary for age " + age + ": " + average);
        }
    }
}
