import java.util.Scanner;

import javax.swing.text.FlowView.FlowStrategy;

public class Week5 {
    public static void main(String[] args) {
        // // multi-dimensional arrays
        // <dtype> <arrayName> [] []
        int [] tic = new int[4]; // list
        int [][] ticTac = new int[3][3]; // table
        int [][][] ticTacTo = new int[3][4][5]; // cube
        int [][][][] ticTacFor = new int [3][4][5][6]; // matrix
        int counter = 1;

        // fill contents of ticTac with values from 1-9;
        for(int i = 0; i < ticTac.length; i++) {
            for(int j = 0; j < ticTac[i].length; j++) {
                ticTac[i][j] = counter++;
            }
        }
        for(int i = 0; i < ticTac.length; i++) {
            for(int j = 0; j < ticTac[i].length; j++) {
                System.out.print(ticTac[i][j] + " ");
            }
        }

        // <dtype> <arrayName> [];
        // int numInts[] = new int[10];
        // // print contents of an array
        // float numFloats[] = {1.1f, 2.5f, 3.3f, 4.5f};
        // for(int i = 0; i < numFloats.length; i++) {
        //     System.out.println(numFloats[i]);
        // }
        // // enhanced for-loop
        // for(float item : numFloats) {
        //     System.out.println(item);
        // }

        // System.out.println(numFloats[4]);                   // left to right
        // System.out.println(numFloats[numFloats.length-1]);  // right to left
        
        // default values --> int = 0, float/double = 0.0, boolean = false
        // string / other classes -> initialized to Null
        // <dtype>[] <arrayName>;
        
        // int[] numInts2;
        // int x;
        // System.out.println(x);

        // String s1 = "hi";                    // s1 points to memory location of hi
        // String s2 = "hi";                    // s2 points to the same memory location as s1
        // String s3 = s1;                      // s3 points to the same memory location as s1
        // String s4 = new String("hi");        // new object
        // System.out.println(s1==s4);          // compare the address
        // System.out.println(s1.equals(s4));   // compare the contents


        /*
        1. Find the mean and standard deviation of numbers kept in an array with size 10
        a. Ask the user to input the values for the array
        b. Compute for the mean and standard deviation
        c. Displat the contents of the array
        d. Display the mean and standard deviation
        */

        int arrayLength;
        double sum = 0.0;
        double mean = 0;
        double stdDev = 0;

        Scanner num = new Scanner(System.in);  
       
        int[] array = new int[10];          // creates an array in the memory of length 10  
        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the elements of the array: ");

            array[i] = num.nextInt();       //reading array elements from the user
            sum = sum + num;
        }

        mean = sum / n;

        for(int i = 0; i < arrayLength; i++) {  
            stdDev += Math.pow(n - mean, 2);
        }
        
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {  
            System.out.println(array[i]);
        }

        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDev);

        // homework
        // look into the "magic square"
        // odd magic square
    }
}