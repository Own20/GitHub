// package Week6;/

import java.util.Scanner;
import java.text.DecimalFormat;

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

public class MachineProblem3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);               //declare scanner library named num

        System.out.print("Enter the number of students: "); //print direction

        int numStudents = num.nextInt();                    //declare numStudents to be inputed from num scanner
        int [] grades = new int[numStudents];               //declare grades array with the size of numStudents

        for(int i = 0; i < numStudents; i++) {
            int count = i + 1;                              //declare count for the order of students
            System.out.print("Enter the grade for student " + count + ": ");    //print direction
            grades[i] = num.nextInt();                      //reading array elements from the user
        }

        float sum = 0;                                      //declare sum
        for (int i = 0; i < numStudents; i++) {
            sum += grades[i];                               //add all elements in the array to sum
        }

        float average = sum / numStudents;                  //declare average with the calculation sum divided by numStudents
        DecimalFormat roundAverage = new DecimalFormat("##.00");    //rounding average to two decimal places

        System.out.println("The average is: " + roundAverage.format(average));  //print roundAverage result

        int gradeMin = grades[0];                           //declare gradeMin to be the first element
        int gradeMax = grades[0];                           //declare gradeMax to be the first element

        for (int i = 1; i < numStudents; i++) {
            gradeMin = Math.min(gradeMin, grades[i]);       //use Math.min function to search the minimum grade
            gradeMax = Math.max(gradeMax, grades[i]);       //use Math.min function to search the maximum grade
        }

        System.out.println("The minimum is: " + gradeMin);  //print gradeMin result
        System.out.println("The maximum is: " + gradeMax);  //print gradeMax result
    }
}
