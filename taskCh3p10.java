/*
    program for final task 10 for chapter 3
    input symbols from keyboard until '.' is inputed
    number of letters with changed registers is shown in the end of the program
*/

class taskCh3p10 {
    public static void main(String args[])
        throws java.io.IOException {
            char charInput, ignore;
            int countUppertoLower = 0, countLowertoUpper = 0;
            int intInput;

            do {
                charInput = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                intInput = (int) charInput;
                
                if ((intInput >= 65) & (intInput <= 90)) {
                    intInput += 32;
                    charInput = (char) intInput;
                    countUppertoLower++;
                }
                else if ((intInput >= 97) & (intInput <= 122)) {
                    intInput -= 32;
                    charInput = (char) intInput;
                    countLowertoUpper++;
                }

                System.out.println("Your inputted symbol was (maybe with some interpretation): " + charInput);
            } while (charInput != '.');
            System.out.println("Final number of casts 'Upper to Lower case' is: " + countUppertoLower);
            System.out.println("Final number of casts 'Lower to Upper case' is: " + countLowertoUpper);
    }
}