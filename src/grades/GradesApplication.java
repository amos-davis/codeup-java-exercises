package grades;

import grades.Student;

import java.util.HashMap;
import java.util.Scanner;

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


        students.put("username@1stSpot", miniStudent1);
        students.put("username@2ndSpot", miniStudent2);
        students.put("username@3rdSpot", miniStudent3);
        students.put("username@4thSpot", miniStudent4);
        students.put("username@5thSpot", miniStudent5);

//        System.out.println(miniStudent1.getGradeAverage());
//        System.out.println(miniStudent5.getName());


//       ------Exercise 3 ------



        System.out.println("Welcome!\n");
        System.out.println("Here are the github usernames of our students:\n");
        String output = "";
        boolean keepGoing = true;

        for (String ministudent : students.keySet()) {
            output += "|" + ministudent + "| ";
        }
        System.out.println(output);

        do {
        System.out.println("\nWhat student would you like to see more information on?");

        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();

        for (String ministudent : students.keySet()) {
            if(output.equals(userChoice)) {
                System.out.println();
            }
            output += "|" + ministudent + "| ";
        }
        if(output.contains(userChoice)) {
            System.out.println("Name; " + students.get(userChoice).getName() + " - Github Username: " + userChoice);
            System.out.println("Current Average: " + students.get(userChoice).getGradeAverage());
        }

        System.out.println("Would you like to see another student? (yes/no)");
        Scanner sc2 = new Scanner(System.in);
        String userResponse = sc2.next();

        if (userResponse.equals("no")) {
            System.out.println("Thank for your inquiry. Good-Bye!");
            keepGoing = false;
        }
        } while (keepGoing);
        //loop

    }





//        return output.trim();
//        --since we need a return statement for returnWelcomeMessage(), we can use the below.---

}
