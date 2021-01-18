/*
    program for finding dividers for numbers from 2 till 100
    (except next dividers: 1, 2, number itself)
*/

class FindDividers {
    public static void main (String args[]) {
        for (int i=2; i <= 100; i++) {
        //stopLesDiv: {
            int lessiestDivider = 2;
            System.out.print("Dividers of " + i + ":  ");
            for (int j=2; j <= (i/lessiestDivider); j++) {
                if ((i%j) == 0) {
                    lessiestDivider = j;
                    break;
                }
            }
            //if (lessiestDivider > i*i) break stopLesDiv;
            if (lessiestDivider > i*i) continue;
            
            for (int k=lessiestDivider; k <= (i/lessiestDivider); k++) {
                if ((i%k) == 0) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}