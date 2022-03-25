// package Week6;//

import java.util.Scanner;

/*
Machine Problem 1.
Write a program called PrintArray which prompts user for the number of items in an array (a non-negative integer) and saves it in an int variable called NUM_ITEMS. It then prompts user for the values of all the items and saves them in an int array called items. The program shall then print the contents of the array in the form of [x1, x2, ..., xn].

Sample:
Enter the number of items: 5
Enter the value of all items (separated by space): 3 2 5 6 9
The values are: [3, 2, 5, 6, 9]
*/

public class MachineProblem1 {
    public static void main(String[] args) {
        Scanner PrintArray = new Scanner(System.in);    //declare scanner library named PrintArray

        System.out.print("Enter the number of items: ");//print direction

        int NUM_ITEMS = PrintArray.nextInt();           //declare NUM_ITEMS to be inputed from PrintArray scanner
        int [] items = new int[NUM_ITEMS];              //declare items array with the size of NUM_ITEMS

        System.out.print("Enter the value of all items (separated by space): ");    //print direction

        for(int i = 0; i < NUM_ITEMS; i++) {
            items[i] = PrintArray.nextInt();            //reading array elements from the user
        }

        System.out.print("The values are: [");          //print result opening

        for (int i = 0; i < NUM_ITEMS - 1; i++) {
            System.out.print(items[i] + ", ");          //print elements with "," except last element
        }
        for (int i = NUM_ITEMS - 1; i == NUM_ITEMS - 1; i++) {
            System.out.print(items[i]);                 // print last element without ","
        }

        System.out.print("]");                          //print result closing
    }
}
