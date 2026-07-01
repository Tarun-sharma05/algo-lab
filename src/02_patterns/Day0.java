public class Day0{
    public static void main(String[] args){

         pattern6(  4);
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
