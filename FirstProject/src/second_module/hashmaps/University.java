package second_module.hashmaps;

import java.util.HashMap;

public class University {
    private HashMap<String, Integer> studentList = new HashMap<>();

    public HashMap<String, Integer> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.put(student.getName(), student.getGrade());
    }
}
