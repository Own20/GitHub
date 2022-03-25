import java.util.Scanner;

public class Week4 {
    public static void main(String[] args) {
        // 3 programming structures:
            // Sequential
            // Conditional [if and switch]
            // Repetitive [while, do..while, for]

        // relational operators
            // >, <, <=, >=, !=, ==
        
        // logical operators
            // and (&& / &), or (|| / |), not (!)

        // boolean a = true, b = false;
        // boolean r1, r2, r3, r4;
        // r1 = a && b;    // short circuit evaluation: check a, no point check b
        // r2 = a & b;     // bit-wise operator: check a and also b
        // r3 = a || b;
        // r4 = a | b;

        // // write a program that reads in a character, if the character is lowercase, conver it to uppercase then display it, otherwise, just display the character (use bit-wise operator)
        // char ch = 'a';
        // int upCase;
        // if (ch >= 'a' && ch <= 'z') {   // (ch >= 97 && ch <= 122)
        //     upCase = ch - 32;
        //     // System.out.println("the character is " + upCase);
        //     System.out.printf("The character is %c", upCase);
        // } else {
        //     System.out.println("the character is " + ch);
        // }

        // the ggeky way of solving the problem - use bitwise operator
        // to set bits use an or, to clear bits use an and
        // 'A' = 65 = 0100 0001 = 0x0^7 + 0x2^6 + ... + 1x2^0
        // 0x41 = hexa
        // System.out.println("\u0041");

        // cartesian plane
        // ask the user

        // sample output1:
        // Enter value for x : 0
        // Enter value for y : 10
        // 0, 10 is in the y-axis

        // sample output 2
        // Enter value for x : 30
        // Enter value for y : 10
        // 0, 10 is in the first quadrant

        // sample output 3
        // Enter value for x : -30
        // Enter value for y : 10
        // 0, 10 is in the second quadrant

        // Scanner num = new Scanner(System.in);
        // System.out.print("Input x point: ");
        // int x = num.nextInt();

        // System.out.print("Input y point: ");
        // int y = num.nextInt();
        
        // if (x > 0 && y > 0) {
        //     System.out.println("Q1");
        // } else if (x < 0 && y > 0) {
        //     System.out.println("Q2");
        // } else if (x < 0 && y < 0) {
        //     System.out.println("Q3");
        // } else if (x > 0 && y < 0 ) {
        //     System.out.println("Q4");
        // } else if (x == 0) {
        //     System.out.println("Y - Axis");
        // } else if (y == 0) {
        //     System.out.println("X - Axis");
        // }

        // int value = 1;
        // switch(value) {
        //     case 1:
        //         System.out.println("one");
        //         break;
        //     case 2:
        //         System.out.println("two");
        //         break;
        //     case 3:
        //         System.out.println("three");
        //         break;
        //     default:
        //         System.out.println("Terserah");
        // }
        // System.out.println("Bye!!");

        // loops (while, do..while, for)
            // 1. loop control variable
            // 2. a condition (true or false)
            // 3. body (statements)
            // 4. change of state
        
        // display numbers 1..10
        // int num = 1;
        // while(num <= 10) {
        //     System.out.print(num + " ");
        //     num++;
        // }
        // int num = 1;
        // do {                // pre-test
        //     System.out.println(num + " ");
        //     num++;
        // } while(num <= 10); // post-test
        // // count-controlled loop
        // for(int num = 1; num <= 10; num++) {
        //     System.out.println(num + " ");
        // }
    }
}