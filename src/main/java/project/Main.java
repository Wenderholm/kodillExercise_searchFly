package project;

public class Main {
    public static void main(String[] args) {

//        isDivided(4, 18);
//        reverseMethod(5,-2);

        FlyDatabase fldb = new FlyDatabase();

        fldb.checkIfFlightExists("Paris", "Berlin");

    }

//    private static void isDivided(int start, int end) {
//        for (int i = start; i < end; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Number:" + i + " is divided by 3");
//                continue;
//            }
//            if (i % 5 == 0) {
//                System.out.println("Number:" + i + " is divided by 5");
//            }
//        }
//    }
//
//    private static void reverseMethod(int start, int end) {
//        for (int i = start; i >= end ; i--) {
//            System.out.print(i + " , ");
//        }
//    }
}