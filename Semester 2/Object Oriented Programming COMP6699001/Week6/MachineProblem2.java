// package Week6;

import java.util.Scanner;

/*
Machine Problem 2.
Write a program called printArrayInStars which prompts user for the number of items in an array (a non-negative integer) and saves it in an int variable called NUM_ITEMS. It then prompts user for the values of all the items (non-negative integers) and saves them in an int array called items. The program shall then print the contents of the array in a graphical form, with the array index and values represented by number of stars.

Sample:
Enter the number of items: 5
Enter the value of all items (separated by space): 7 4 3 0 7
0: *******(7)
1: ****(4)
2: ***(3)
3: (0)
4: *******(7)
*/

public class MachineProblem2 {
    public static void main(String[] args) {
        Scanner printArrayInStars = new Scanner(System.in); //declare scanner library named printArrayInStars

        System.out.print("Enter the number of items: ");    //print direction

        int NUM_ITEMS = printArrayInStars.nextInt();        //declare NUM_ITEMS to be inputed from PrintArray scanner
        int [] items = new int[NUM_ITEMS];                  //declare items array with the size of NUM_ITEMS

        System.out.print("Enter the value of all items (separated by space): ");    //print direction

        for(int i = 0; i < NUM_ITEMS; i++) {
            items[i] = printArrayInStars.nextInt();         //reading array elements from the user
            String x = "*".repeat(items[i]);                //multiply "*" with the element number in the array, convert into string
            System.out.println(i + ": " + x + "(" + items[i] + ")");  //print result format
        }
    }
}
