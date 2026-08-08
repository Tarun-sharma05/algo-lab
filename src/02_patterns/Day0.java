public class Day0 {
    public static void main(String[] args) {
        System.out.println("Mirrored Right Angle Triangle");
        mirroredRightAngleTriangle(4);

        System.out.println("\nRight Angle Triangle");
        rightAngleTriangle(5);

        System.out.println("\nInverted Right Angle Triangle");
        invertedRightAngleTriangle(5);

        System.out.println("\nPyramid");
        Pyramid(5);
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
                for (int row  = 1; row <= n; row++ ) {

                }
    }
}








