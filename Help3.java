/*
    program for task 3.3
    program with information about syntax of operators

    version 1.2:
    added operators BREAK, CONTINUE
    version 1.1:
    added operators FOR, WHILE, DO-WHILE
    version 1.0:
    added operators IF, SWITCH
*/

class Help3 {
    public static void main (String args[]) 
        throws java.io.IOException {
            char choice, ignore;

            stopQ: for ( ; ; ) {
                do {
                    System.out.println("Help:");
                    System.out.println(" 1. if");
                    System.out.println(" 2. switch");
                    System.out.println(" 3. for");
                    System.out.println(" 4. while");
                    System.out.println(" 5. do-while");
                    System.out.println(" 6. break");
                    System.out.println(" 5. continue");
                    System.out.println("Choose from 1-7 (q -- exit program)");

                    choice = (char) System.in.read();
                
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');

                    System.out.println("\n");
                } while ( choice < '1' | choice > '7' & choice != 'q');
                if (choice == 'q') break stopQ;

                switch (choice) {
                    case '1':
                        System.out.println("Operator if:\n");
                        System.out.println("if (condition) {");
                        System.out.println("  operators sequence;");
                        System.out.println("}");
                        System.out.println("else {");
                        System.out.println("  operators sequence;");
                        System.out.println("}");
                        System.out.println("\n");
                        break;
                    case '2':
                        System.out.println("Operator switch:\n");
                        System.out.println("switch (statement) {");
                        System.out.println("  case constant");
                        System.out.println("  operators sequence;");
                        System.out.println("  break");
                        System.out.println("  // ...");
                        System.out.println("}");
                        System.out.println("\n");
                        break;
                    case '3':
                        System.out.println("Operator for:\n");
                        System.out.println("for (initialisation; condition; iteration) {");
                        System.out.println("  operators sequence;");
                        System.out.println("}");
                        System.out.println("\n");
                        break;
                    case '4':
                        System.out.println("Operator while:\n");
                        System.out.println("while (condition) {");
                        System.out.println("  operators sequence;");
                        System.out.println("}");
                        System.out.println("\n");
                        break;
                    case '5':
                        System.out.println("Operator do-while:\n");
                        System.out.println("do {");
                        System.out.println("  operators sequence;");
                        System.out.println("} while (condition);");
                        System.out.println("\n");
                        break;
                    case '6':
                        System.out.println("Operator break:\n");
                        System.out.println("break;");
                        System.out.println(" OR");
                        System.out.println("break label;");
                        System.out.println("\n");
                        break;
                    case '7':
                        System.out.println("Operator break:\n");
                        System.out.println("continue;");
                        System.out.println(" OR");
                        System.out.println("continue label;");
                        System.out.println("\n");
                        break;
                    //default:
                    //System.out.println("Incorrect input (couldn't find asked number");
                }
            }
        }
}