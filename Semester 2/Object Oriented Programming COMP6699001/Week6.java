import java.util.Scanner;

/*
Machine Problem 1.
Write a program called PrintArray which prompts user for the number of items in an array (a non-negative integer) and saves it in an int variable called NUM_ITEMS. It then prompts user for the values of all the items and saves them in an int array called items. The program shall then print the contents of the array in the form of [x1, x2, ..., xn].

Sample:
Enter the number of items: 5
Enter the value of all items (separated by space): 3 2 5 6 9
The values are: [3, 2, 5, 6, 9]
*/

public class Week6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);   //declare scanner library

        System.out.print("Enter the number of items: ");    //print direction

        int PrintArray = num.nextInt();         //declare PrintArray to be inputed

        int [] NUM_ITEMS = new int[PrintArray]; //declare NUM_ITEMS array with the size of PrintArray

        System.out.print("Enter the value of all items (separated by space): ");    //print direction

        for(int i = 0; i < PrintArray; i++) {
            NUM_ITEMS[i] = num.nextInt();       //reading array elements from the user
        }

        System.out.print("The values are: [");  //print result opening

        for (int i = 0; i < PrintArray - 1; i++) {
            System.out.print(NUM_ITEMS[i] + ", ");          //print elements with "," except last element
        }
        for (int i = PrintArray - 1; i == PrintArray - 1; i++) {
            System.out.print(NUM_ITEMS[i]);                 // print last element without ","
        }

        System.out.print("]");                  //print result closing
    }
}

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



/*
Machine Problem 3.
Write a program which prompts user for the number of students in a class (a non-negative integer) and saves it in an int variable called numStudents. It then prompts user for the grade of each of the students (integer between 0 to 100) and saves them in an int array called grades. The program shall then compute and print the average (in double rounded to 2 decimal places) and minimum/maximum (in int).

Sample:
Enter the number of students: 5
Enter the grade for student 1: 98
Enter the grade for student 2: 78
Enter the grade for student 3: 78
Enter the grade for student 4: 87
Enter the grade for student 5: 76

The average is: 83.40
The minimum is: 76
The maximum is: 98
*/

