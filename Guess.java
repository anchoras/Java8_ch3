/*
    demo program with "guess game" included
    user trying to guess letter, using console
*/

class Guess {
    public static void mian(String args[])
        throws java.io.IOException {
            char ch, answer = 'S';
            System.out.println("The letter belongs to A-Z");
            System.out.println("Let's guess witch letter is answer");

            ch = (char) System.in.read();
            if (ch == answer) {
                System.out.println("** You are right! **");
            }
        }
}