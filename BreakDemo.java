/*
    BreakDeomo

    demo program
    showing break operator inside cycle
*/

/* class BreakDemo {
    public static void main(String args[]) {
        int num = 100;

        for (int i = 0;  i < num; i++) {
            if (i*i >= num) break;
            System.out.println(i + " ");
        }
        System.out.println("cycle is over");
    }
} */

/* class BreakDemo {
    public static void main (String args[])
        throws java.io.IOException {
            char ch;

            for ( ; ; ) {
                ch = (char) System.in.read();
                if (ch == 'q') break;
            }
            System.out.println("You pressed 'q'");
    }
} */
/* 
class BreakDemo {
    public static void main (String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer cycle counter: " + i);
            System.out.println("Inner cycle counter: ");

            int j = 0;
            while (j < 100) {
                if (j == 10) break;
                    System.out.print(j + " ");
                    j++;
            }
            System.out.println();
        }
        System.out.println("cycles are over");
    }
} */

/* class BreakDemo {
    public static void main(String args[]) {
        int i;
        for (i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("\ni is equal to " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        System.out.println("This line wouldn't be shown");
                    }
                    System.out.println("After block named 'Three'");
                }
                System.out.println("After block named 'Two'");
            }
            System.out.println("After block named 'One'");
        }
        System.out.println("After end of the cycle");
    }
} */

class BreakDemo {
    public static void main (String args[]) {

        done: for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        System.out.println(k + " ");
                        if (k == 5) break done;
                    }
                    System.out.println("After cycle by k");
                }
                System.out.println("After cycle by j");
            }
            System.out.println("After cycle by i");
        
        System.out.println("After block 'done'");
    }
}