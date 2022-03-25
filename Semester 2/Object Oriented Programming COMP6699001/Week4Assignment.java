import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.print.DocFlavor.STRING;

public class Week4Assignment {
    public static void displayMenu() {
        System.out.println("Robby Instructions");
        System.out.println("1. Move");
        System.out.println("2. Location");
        System.out.println("3. Reset");
        System.out.println("4. Quit");
    }
    public static void main(String[] args) {
        // Robby is a path finding robot. He could move (N, E, W, S) and a distance (units). Write a program that simulates this scenario
        // // Robby Instructions
        // 1. Move
        // 2. Location
        // 3. Reset
        // 4. Quit
        // Choice >> 1
        // Enter direction (N, E, W, S) >> N
        // Enter distance (> 0) >> 10
        // Robby moved North, 10 units
        // // Robby Instructions
        // 1. Move
        // 2. Location
        // 3. Reset
        // 4. Quit
        // Choice >> 2
        // Robby is currently at (0, 10)
        // // Robby Instructions
        // 1. Move
        // 2. Location
        // 3. Reset
        // 4. Quit
        // Choice >> 1
        // Enter direction (N, E, W, S) >> E
        // Enter distance (> 0) >> 10
        // Robby moved East, 10 units
        // // Robby Instructions
        // 1. Move
        // 2. Location
        // 3. Reset
        // 4. Quit
        // Choice >> 2
        // Robby is currently at (10, 10)
        // // Robby Instructions
        // 1. Move
        // 2. Location
        // 3. Reset
        // 4. Quit
        // Choice >> 3
        // Robby reset at 0, 0
        // // Robby Instructions
        // 1. Move
        // 2. Location
        // 3. Reset
        // 4. Quit
        // Choice >> 2
        // Robby is in the origin
        // // Robby Instructions
        // 1. Move
        // 2. Location
        // 3. Reset
        // 4. Quit
        // Choice >> 4
        // Goodbye!!

        Week4Public pub = new Week4Public();

        boolean a = true;

        while(a) {
            displayMenu();
            
            Scanner num = new Scanner(System.in);
            System.out.print("Choice: ");
            int numIns = num.nextInt();

            switch(numIns) {
                case 1:     // Move
                    Scanner chr = new Scanner(System.in);
                    System.out.print("Enter direction (N, E, W, S): ");
                    pub.dir = chr.nextLine();

                    switch(pub.dir) {
                        case "N":
                            while(a) {
                                Scanner dis0 = new Scanner(System.in);
                                System.out.print("Enter distance (> 0): ");
                                pub.disN = dis0.nextInt();
                                if (pub.disN > 0) {
                                    System.out.println("Robby moved North, " + pub.disN + " units");
                                    pub.y += pub.disN;
                                    a = false;
                                } else {
                                    System.out.println("Invalid Input!");
                                }
                                dis0.close();
                            }
                            a = true;
                            break;
                        case "E":
                            while(a) {
                                Scanner dis1 = new Scanner(System.in);
                                System.out.print("Enter distance (> 0): ");
                                pub.disE = dis1.nextInt();
                                if (pub.disN > 0) {
                                    System.out.println("Robby moved East, " + pub.disE + " units");
                                    pub.x += pub.disE;
                                    a = false;
                                } else {
                                    System.out.println("Invalid Input!");
                                }
                                dis1.close();
                            }
                            a = true;
                            break;
                        case "W":
                            while(a) {
                                Scanner dis2 = new Scanner(System.in);
                                System.out.print("Enter distance (> 0): ");
                                pub.disW = dis2.nextInt();
                                if (pub.disN > 0) {
                                    System.out.println("Robby moved West, " + pub.disW + " units");
                                    pub.x -= pub.disW;
                                    a = false;
                                } else {
                                    System.out.println("Invalid Input!");
                                }
                                dis2.close();
                            }
                            a = true;
                            break;
                        case "S":
                            while(a) {
                                Scanner dis3 = new Scanner(System.in);
                                System.out.print("Enter distance (> 0): ");
                                pub.disS = dis3.nextInt();
                                if (pub.disS > 0) {
                                    System.out.println("Robby moved South, " + pub.disS + " units");
                                    pub.y -= pub.disS;
                                    a = false;
                                } else {
                                    System.out.println("Invalid Input!");
                                }
                                dis3.close();
                            }
                            a = true;
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            continue;
                    }
                    break;
                case 2:     // Location
                    // pub.y += pub.disN;
                    // pub.x += pub.disE;
                    // pub.x -= pub.disW;
                    // pub.y -= pub.disS;
                    // if (pub.dir == "N") {
                    //     pub.y += pub.disN;
                    // } else if (pub.dir == "E") {
                    //     pub.x += pub.disE;
                    // } else if (pub.dir == "W") {
                    //     pub.x -= pub.disW;
                    // } else if (pub.dir == "S") {
                    //     pub.y -= pub.disS;
                    // }
                    System.out.println("Robby is currently at (" + pub.x + ", " + pub.y + ")");
                    break;
                case 3:     // Reset
                    pub.x = 0;
                    pub.y = 0;
                    System.out.println("Robby reset at (" + pub.x + ", " + pub.y + ")");
                    break;
                case 4:     // Quit
                    System.out.println("Goodbye!!");
                    num.close();
                    a = false;
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }
    }
}