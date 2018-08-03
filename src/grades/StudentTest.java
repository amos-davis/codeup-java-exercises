package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {


//         -----Crazy examples with objects and HashMap----
              Student student = new Student("Carl");
                student.addGrade(80);
                student.addGrade(90);
                student.addGrade(65);
                student.addGrade(73);
//              Student miniStudent2 = new Student("Kit", 99.34);
//              Student miniStudent3 = new Student("Larry", 95);
//              Student miniStudent4 = new Student("Skye", 66.36);
//              Student miniStudent5 = new Student("Brenda", 78);
//              Student miniStudent6 = new Student("Jim", 89);

        System.out.println(student.getGradeAverage());


        








////    ----This example uses an ArrayList---
////        ---elements of ArrayList must be of same type---
//        ArrayList<String> students = new ArrayList<>();
//
//            students.add("Will");
//            students.add("Sam");
//            students.add("Kelly");
//            students.add("Pam");
//
//            System.out.println(students);
////            ---If set up correctly, "students." will show drop-down of all available properties try {
////            to use. If not set up correctly, students will not have a drop-down list.----
//
//        System.out.println(students.contains("Pam"));
//        System.out.println(students.contains("Lucy"));
//        System.out.println(students.isEmpty());
//        
//
//
////            ----This example uses HashMap----
//        //  ---elements of HashMap must also be of same type---
//
//            HashMap<String, String> userNames = new HashMap();
//
//            userNames.put("Dave", "daverogers");
//            userNames.put("Clark", "clarkkent");
//            userNames.put("Bruce", "brucewayne");
//
////        System.out.println("Bruce's username is : " + userNames.get("Bruce"));
////        System.out.println(userNames.getOrDefault("Josh", "Sorry, he's not listed."));
////        // (since structured as key: value pair ----.keys() gets the "keys" of the "userName" HashMap---
////        System.out.println(userNames.keySet());
//////      ----(since structured as key: value pair -----.values() gets the values of the "userName" HashMap---
////        System.out.println(userNames.values());
////
////
//
////       The loop below says: for each variable that I am calling "name", get the keySet of the userNames HashMap.
////      That's how it knows exactly what to get. Variable name, in this case, is irrelevant.---
//        for (String name: userNames.keySet()) {
//            System.out.println("Names are: " + name + ", that's it!");
//        }
////         -----The same thing applies in this case----
//        for (String email: userNames.values()) {
//            System.out.println("Emails are: " + email + ", that's it!");
//      }








    }
}
