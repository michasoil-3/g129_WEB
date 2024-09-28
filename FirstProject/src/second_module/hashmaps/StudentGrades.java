package second_module.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Integer> grades = new HashMap<>();

    public void addStudent(String name, int grade) {
        grades.put(name, grade);
    }
    public void printStudentsAboveGrade(int threshold) {
        for (String student: grades.keySet()) {
            if (grades.get(student) > threshold) {
                System.out.println(student + ": " + grades.get(student));
            }
        }

    }
}
