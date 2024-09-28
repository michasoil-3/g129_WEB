package second_module.generics;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class StudentList<T extends Student> {
    private List<T> students = new ArrayList<>();

    public StudentList() {
    }

    public StudentList(List<T> students) {
        this.students = students;
    }

    public List<T> getStudents() {
        return students;
    }

    public void setStudents(List<T> students) {
        this.students = students;
    }

    void addStudent(T student) {
        this.students.add(student);
    }

    void removeStudent(T student) {
        this.students.remove(student);
    }

    T getHighestGpaStudent() {
        T student = this.students.getFirst();
        for (T current: students) {
            if (current.getGpa() > student.getGpa()) {
                student = current;
            }
        }
        return student;
    }

    void sortByLastName() {
        this.students.sort(new Comparator<T>() {
            @Override
            public int compare(T t1, T t2) {
                return t1.getLastName().compareTo(t2.getLastName());
            }
        });
    }

    void swap(int index1, int index2) {
        T temp = this.students.get(index1);
        this.students.set(index1, this.students.get(index2));
        this.students.set(index2, temp);

    }
}
