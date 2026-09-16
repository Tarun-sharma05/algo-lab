public class Day0 {
    public static void main(String[] args) {
        System.out.println("Mirrored Right Angle Triangle");
        mirroredRightAngleTriangle(4);

        System.out.println("\nRight Angle Triangle");
        rightAngleTriangle(5);

        System.out.println("\nInverted Right Angle Triangle");
        invertedRightAngleTriangle(5);

        System.out.println("\nInverted Mirrored Right Angle Triangle");
        invertedMirroredRightAngleTriangle(5);

        System.out.println("\nPyramid");
        Pyramid(5);

        System.out.println("\nInverted Pyramid");
        invertedPyramid(5);

        System.out.println("\nHollow Square");
        hollowSquare(5);

        System.out.println("\nSolid Rombus");
        solidRombus(5);
        System.out.println("\nHollow Rectangle");
        hollowRectangle(4);

        System.out.println("\nHollow Right Angle Triangle ");
        hollowRightAnlgeTrianlge(5);
    }


    static void square(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //self
    static void mirroredRightAngleTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= row; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedMirroredRightAngleTriangle(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= row; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void rightAngleTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void invertedRightAngleTriangle(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //       *
    //      ***
    //     *****
    //    *******
    //   *********
    //
   static void Pyramid(int n){
       for (int row = 1; row <= n; row++) {
           for (int col = 1; col <= n - row; col++) {
               System.out.print(" ");
           }
           for (int frst_half_str = 1; frst_half_str <= row; frst_half_str++) {
               System.out.print("*");
           }
           for (int second_half_str = 2; second_half_str <= row; second_half_str++){
               System.out.print("*");

           }
           System.out.println();
       }
   }

   //*********
   // *******
   //  *****
   //   ***
   //    *

    static void invertedPyramid(int n){
//        for (int row = n; row >= 1; row--) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print(" ");
//            }
//            for (int frst_half_str = 1; frst_half_str <= row; frst_half_str++) {
//                System.out.print("*");
//            }
//            for (int second_half_str = 2; second_half_str <= row; second_half_str++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

        for(int row = 1; row <=n; row++){
            for (int spc = 1; spc <= row -1; spc++){
                System.out.print("  ");
            }
            /// No. of star = 2N - row - no. of space | no. of spce  = row -1
            for (int str = 1; str <=  2 * n - row - row-1; str++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollowSquare(int n){
        for (int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if (row == 1 || row == 5 || col == 1 || col == 5){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Solid Robus
    /*
            * * * * * *
          * * * * * *
        * * * * * *
       * * * * *
     * * * * *

    * * */

    static void solidRombus(int n){

        for(int row = 1; row <= n; row++){
            // Spaces
            for(int sp = 1; sp <= n - row; sp++){
                System.out.print("  ");
            }
            for(int str = 1; str <= n; str++){
            System.out.print("* ");
            }
            System.out.println();

        }
    }


    ///////// Hollow Rectangle ////////////////
    static void hollowRectangle(int n){

        for (int row = 1; row <= n; row++){
            for(int col = 1; col <= 6; col++){
                if(row == 1 || row == n || col == 1 || col == 6){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    ///////////////// Hollow RIght Angle Triangle ///////////////
    static void hollowRightAnlgeTrianlge(int n){
        for (int row = 1; row <= n; row++){
            if(row == 1 || row == 2 || row == n) {
                for (int col = 1; col <=row; col++) {
                    System.out.print("* ");
                }
            }else {
                System.out.print("* ");

                for (int sp = 1; sp <= row -2; sp++) {
                    System.out.print("  ");
                }
                System.out.print("* ");

                }
            System.out.println();

        }
    }
}








