/*
    demo program with "guess game" included
    user trying to guess letter, using console
*/

class Guess {
    public static void main (String args[])
        throws java.io.IOException {
            char ch, ignore, answer = 'S';
            System.out.println("The letter belongs to A-Z");
            do {
                System.out.println("Let's guess which letter is the answer");

                ch = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

                if (ch == answer) {
                    System.out.println("** You are right! **");
                }
                else {
                    System.out.println("Sorry, you was wrong");
                if (ch < answer) {
                    System.out.println("The letter is closer to alphabet's end");
                }
                else {
                    System.out.println("The letter is closer to alphabet's begin");
                }
                System.out.print("\n\n");
            }
            } while (ch != answer);
            
        }
}