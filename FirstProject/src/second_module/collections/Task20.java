package second_module.collections;

import java.util.Set;

class Student {
    private String name;
    private Set<String> courses;

    public Student() {
    }

    public Student(String name, Set<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    void addCourse(String course) {
        this.courses.add(course);
    }

    void removeCourse(String course) {
        this.courses.remove(course);
    }

    void listCourses() {
        for (String c: this.courses) {
            System.out.println(c);
        }
    }
}
