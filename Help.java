/*
    program for task 3.1
    program with information about syntax of operators

    version 1.0:
    added operators IF and SWITCH
*/

class Help {
    public static void main (String args[]) 
        throws java.io.IOException {
            System.out.println("Help:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println("Choose from 1-2");
            char choice = (char) System.in.read();

            switch (choice) {
                case '1':
                    System.out.println("Operator if:\n");
                    System.out.println("if (condition) {");
                    System.out.println("  operators sequence;");
                    System.out.println("}");
                    System.out.println("else {");
                    System.out.println("  operators sequence;");
                    System.out.println("}");
                    break;
                case '2':
                    System.out.println("Operator switch:\n");
                    System.out.println("switch (statement) {");
                    System.out.println("  case constant");
                    System.out.println("  operators sequence;");
                    System.out.println("  break");
                    System.out.println("  // ...");
                    System.out.println("}");
                    break;
                default:
                System.out.println("Incorrect input (couldn't find asked number");
            }
        }
}