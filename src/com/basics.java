import java.util.Scanner;

public class basics{
    static void main() {
        Scanner sc = new Scanner(System.in);
    ////////Swap two numbers without a temp variable  ///////////////
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter A: ");
//        int a = sc.nextInt();
//        System.out.println("Enter B: ");
//        int b = sc.nextInt();
//
//        swap(a = a, b = b);


        //////////// Odd Even validator /////////////////
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int n = scan.nextInt();
//        oddEven(n);


        ////////////// Find the maximum of 3 numbers  ////////////////////////

//        System.out.print("Enter A : ");
//        int a = sc.nextInt();
//        System.out.print("Enter B : ");
//        int b = sc.nextInt();
//        System.out.print("Enter C : ");
//        int c = sc.nextInt();
//
//        maxNo(a,b,c);


        ////////// Leap year //////////////////////////////
//        System.out.print("Entern year:");
//        int year = sc.nextInt();
//
//        leapYear(year);

        ////////// Reverse Number //////////////////////
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        reverseNumber(num);

        ////////////// Armstrong Number /////////////
//        System.out.println("Enter Number: ");
//        int num = sc.nextInt();
//        armstrongNum(num);

        //////////// Table    //////////////////////
//        System.out.println("Enter number");
//        int num = sc.nextInt();
//        table(num);


        /////////////// Prime Number ///////////////////
//        System.out.println("Enter number");
//        int num = sc.nextInt();
//        primeNumberList(num);

//        System.out.println("Enter starting and ending number: ");
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        System.out.println("Enter devider number: ");
//        int devider = sc.nextInt();
//        perfectlyDivisibleNum(start, end, devider);


        for (int i =1; i <=4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    ////////// Odd Even no. validator method ///////////////////////////
      static void oddEven(int n){

        if(n >1) {
            if (n % 2 == 0) {
                System.out.println(n+" Number is even.");
            }else {
                System.out.println(n+" Number is odd.");
            }
        }

    }


    ///////// swap two no. without using third varialble methods /////////////////
    static void swap(int a, int b){

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Swapping A and B: " + "A = " + a + " and " + "B = " + b);
    }


    /////// Find Max number method ///////////////
    static void maxNo(int a, int b, int c){

        if (a>b && a>c){
            System.out.println("A : "+ a + " is greater than b : "+ b + " and c : "+ c);
        }
        else if (b > a && b > c) {
            System.out.println("B : "+ b + " is greater than a : "+ a + " and c : "+ c);
        }
        else if (c > a && c>b){
            System.out.println("C : "+ c + " is greater than a : "+ a + " and b : "+ b);
        }
    }


    //////// Leap Year method //////////////
    static void leapYear(int year){
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap Year : "+ year);
        }
        else if(year % 100 == 0){
            if(year % 400 == 0) {
                System.out.println("Leap Year : " + year);
            }else {
                System.out.println(year+" is not a leap year");
            }
        }
        else {
            System.out.println(year + " Not Year");
        }

    }



    ////////////// Reverse Numbeer //////////////////////

    static void reverseNumber(int num){
        int originalNum = num;
         int reminder;
         int reversedNumber = 0;
        while (num >= 1){
            reminder = num % 10;
            reversedNumber = reversedNumber * 10 + reminder;

            num = num/10;

        }

        System.out.println("Reversed Number: " + reversedNumber);

    }


    ///////////// Armstrong Number ////////////////////
    static void armstrongNum(int num){

        if(num == 0){
            System.out.println("Armstrong Number "+ num);
            System.out.println("Digit count: 1");
            return;
        }

        int orginalNum = num;
         int digitCount = 0;
        int reminder;
        int armstrongNum = 0;

        int num1 = orginalNum;
        while(num1  > 0){
            digitCount++;

            num1 = num1/10;

        }
        while (num >= 1){
//             digitCount = digitCount + 1;
            reminder = num % 10;


            armstrongNum = (int) (armstrongNum + Math.pow(reminder, digitCount));

            num = num/10;
        }

        if(orginalNum == armstrongNum){
            System.out.println("Armstrong Number: " + armstrongNum);
        }else {
            System.out.println(orginalNum + " Not a armstrong number.");
        }

        System.out.println("Digit Count: " + digitCount);
    }



    ////////////// Multiplication Table ///////////////////

    static void table(int n){
        System.out.println("Table of : "+ n);
        for (int i = 1; i <=10; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }


     ////////////////// Prime No  List ////////////////
    static boolean primeNumber(int n){
         int count = 0;

         for (int i = 1; i <= n; i++){
             if(n % i ==0){
                 count = count+1;
             }
         }

         if(count == 2){
             return true;
             //             System.out.println(n + " is a prime number.");
         }else {
             return false;
//             System.out.println(n + " is not a prime number.");
         }
    }

    static void primeNumberList(int n){
        System.out.println("Prime Numbers from 1 to " + n + " : ");
        for (int i = 1; i <= n; i++){
            if(primeNumber(i)){
                System.out.println(i);
            }
        }
    }


    //////////// Perfectly divisible by 7 //////////////////
    static void perfectlyDivisibleNum(int start, int end, int devider){
        System.out.println("Perfectly divisible by " + devider);
        for (int i = start; i <= end; i++){
            if(i % devider == 0){
                System.out.println(i);
            }
        }
    }



}




