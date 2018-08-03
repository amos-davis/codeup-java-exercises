package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer>grades;


//    ---constructor: "Student" below equals the class name &
// the "this" keyword refers to the property of "this" class,
// and that = the variable argument/parameter.---

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
//        return name or
        return this.name;
    }


    public void addGrade (int grade) {
        grades.add(grade);
    }

    public int getGradeAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }


}
