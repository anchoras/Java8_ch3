/*
    program for demonstrating SWITCH operator
*/

class SwitchDemo {
    public static void main (String args[]) {
        int i;

        for (i = 0; i<6; i++) {
        switch(i) {
            case 0:
                System.out.println("i is lesser than one");
            case 1:
                System.out.println("i is lesser than two");
            case 2:
                System.out.println("i is lesser than three");
                break;
            case 3:
                System.out.println("i is lesser than four");
            case 4:
                System.out.println("i is lesser than five");
        }
        System.out.println("******" + '\n');
        }
    }
}