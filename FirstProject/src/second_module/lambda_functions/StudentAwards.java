package second_module.lambda_functions;

import java.util.ArrayList;

public class StudentAwards {
    public Student theMostGPA(ArrayList<Student> students) {
        BestStudent lambda = (arraylist) -> {
            Student highest = arraylist.get(0);
            for (Student student : students) {
                if (student.getGpa() > highest.getGpa()) {
                    highest = student;
                }
            }
            return highest;
        };
        return lambda.theBest(students);
    }

    public Student theMostAge(ArrayList<Student> students) {
        BestStudent lambda = (arraylist) -> {
            Student oldest = arraylist.get(0);
            for (Student student : students) {
                if (student.getAge() > oldest.getAge()) {
                    oldest = student;
                }
            }
            return oldest;
        };
        return lambda.theBest(students);
    }

    public Student theLongestFullName(ArrayList<Student> students) {
        BestStudent lambda = (arraylist) -> {
            Student longestName = students.get(0);
            for (Student student : students) {
                if (student.getFullName().length() > longestName.getFullName().length()) {
                    longestName = student;
                }
            }
            return longestName;
        };
        return lambda.theBest(students);
    }

    public Student theHighest(ArrayList<Student> students) {
        BestStudent lambda = (arraylist) -> {
            Student highest = students.get(0);
            for (Student student : students) {
                if (student.getHeight() > highest.getHeight()) {
                    highest = student;
                }
            }
            return highest;
        };
        return lambda.theBest(students);
    }
}
