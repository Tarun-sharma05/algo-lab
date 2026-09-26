package com.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);
//              int[] arr = new int[5];
//
//              int n = arr.length;
//
//              for(int i = 0; i<= n-1; i++){
//                  arr[i] = sc.nextInt();
//              }
//
//              for(int i =0; i<= n-1; i++){
//                  System.out.println(arr[i]);
//              }
//
//              sc.close();

//        int[] arr = {1,2,4,5,5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        ///////// Max no. of Array ////////////////
//        int[] arr = {12, 0, -2, 21, 32, 4};
//        maxOfArray(arr);
//        System.out.println("The maximum number is " + maxOfArray(arr));

        //////// Min no. of Array /////////////////
//        int[] arr = {12, 0, -2, 21, 32, 4};
//        minOfArray(arr);
//        System.out.println("The minimum value is " + minOfArray(arr));



        /////////// Basic 2D Array Impl //////////////
//         int[][] arr = {
//                 {1,2}, {3,4}, {5,6}
//         };
//         twoDArray(arr);

        /////////// Reverse Array ///////////////
        int[] arr = {12, -4, 23, 3, 2, 1};
        reverseArray(arr);

    }



    ///////////////// Methods /////////////////////


    /// ////////////// Max no. in a Array ///////////////////
    static int maxOfArray(int[] arr){
        int max = arr[0];
        for(int i = 0; i<= arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    /////////////// Min of Array //////////////
    static int minOfArray(int[] arr){
        int min = arr[0];

        for(int i = 0; i<= arr.length-1; i++){
              if (arr[i] < min) {
                    min = arr[i];
            }

        }
        return min;

    }

    ///////// Basic 2D Array Impl /////////
    static void twoDArray(int[][] arr){

        for(int i =0; i <= arr.length-1; i++){
            for(int j =0; j <= arr[0].length-1; j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    ////////////  Jaged 2d array ///////////////////
//    static int zagedTwoDArray(int[][] arr){
//        int rowIndex = arr.length-1;
//        int colIndex = arr[0].length-1;
//
//        for (int i =0; i<= rowIndex; i++){
//            int colLength = arr[i].length;
//        }
//    }


    /////// Reverse Array ////////////////
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int i = 0; i <= arr.length-1; i++){
            System.out.println(arr[i]+ "");
        }
//        System.out.println("Reversed array: " + Arrays(arr));
    }
}
