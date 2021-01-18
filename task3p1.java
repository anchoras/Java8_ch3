/*
    input symbols from keyboard until '.' is inputed
    number of spaces is shown in the end of the program
*/

class task3p1 {
    public static void main (String args[]) 
        throws java.io.IOException {
            char chInput, ignore;
            int countSpaces = 0;

            do {
                chInput = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                if (chInput == ' ') {
                    countSpaces++;
                }
            } while (chInput != '.');

            System.out.println("Number of spaces in the input is: " + countSpaces);
    }
}