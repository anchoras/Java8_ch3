/*
    program demonstrates demo of FOR operator
    complex condition ant iteration
*/

class ForDemo {
    public static void main (String args[]) 
        throws java.io.IOException {
        
        // version 1
        //float i, j;
        //for (i = 0.27f, j = 112.4f; i < j; i = i + 1.18f, j = j - 12.53f) {
        //    System.out.println(i + "\t" + j);
        //}


        // version 2
        //int i, iter = 1;
        //char ch = 'S';
        //System.out.println("For stop press " + ch);
        //for (i = 1; (char) System.in.read() != ch; i++) {
        //    if (((i-1) % 3) == 0) {
        //        System.out.println("Iteration number " + (((i-1)/3) + 1) + " is done");
        //        iter++;
        //    }   
        //}
        //System.out.println("\nFinal number of iterations is " + iter);

        
        // version 3
        int i;
        for (i = 0; i < 10; ) {
            System.out.println("Iteration " + (i+1));
            i++;
        }
        for ( ; i > 0; ) {
            System.out.println("\tIteration " + i);
            i--;
        }
        
        int sum = 0;
        for (i = 0; i <=5; sum += i++);
        System.out.println("Final sum is " + sum);
    }
}