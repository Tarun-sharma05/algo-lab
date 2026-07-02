public class Day0{
    public static void main(String[] args){

         pattern1(  4);
    }


    static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //self
    static void pattern6(int n){
        for(int row = 1; row <=n; row++){
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= row; str++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
