public class StringExercise {
    public static void main(String[] args) {
        String message = "We don't need no ";
//        System.out.println(message.concat("education"));
//
//        System.out.println(message.concat("thought control"));
//             System.out.println();
//
//        System.out.println("Check \"this\" out!, \"s inside of \"s!");
//            System.out.println();
//
//        System.out.println("In windows, the main drive is usually C:\\");
//            System.out.println();
//
//        System.out.println("I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!");


//        -----Doing the all of the above with only 1 print statement---
        System.out.println(message.concat("education\n") + message.concat("thought control\n\n") + "Check \"this\" out!, \"s inside of \"s!\n\n" + "In windows, the main drive is usually C:\\\n\n" + "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!");
    }
}

