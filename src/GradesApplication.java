import grades.Student;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student miniStudent1 = new Student("Sally");
        miniStudent1.addGrade(69);
        miniStudent1.addGrade(89);
        miniStudent1.addGrade(97);
        miniStudent1.addGrade(100);

        Student miniStudent2 = new Student("Bill");
        miniStudent2.addGrade(77);
        miniStudent2.addGrade(57);
        miniStudent2.addGrade(98);
        miniStudent2.addGrade(74);

        Student miniStudent3 = new Student("Bart");
        miniStudent3.addGrade(69);
        miniStudent3.addGrade(96);
        miniStudent3.addGrade(45);
        miniStudent3.addGrade(93);

        Student miniStudent4= new Student("Jana");
        miniStudent4.addGrade(85);
        miniStudent4.addGrade(100);
        miniStudent4.addGrade(50);
        miniStudent4.addGrade(75);


        Student miniStudent5 = new Student("Michelle");
        miniStudent5.addGrade(87);
        miniStudent5.addGrade(99);
        miniStudent5.addGrade(97);
        miniStudent5.addGrade(78);


        students.put("1stSpot", miniStudent1);
        students.put("2ndSpot", miniStudent2);
        students.put("3rdSpot", miniStudent3);
        students.put("4thSpot", miniStudent4);
        students.put("5thSpot", miniStudent5);

        System.out.println(miniStudent1.getGradeAverage());
        System.out.println(miniStudent5.getName());







    }
}
