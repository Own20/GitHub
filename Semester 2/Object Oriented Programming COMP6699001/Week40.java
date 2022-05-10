package Week4;
public class Week4 {
    /*Conditional and Repetitive Control Structures
       dependent on a certain condition (true or false) - boolean
    
    //relational operators <, >, <=, >=, !=, ==
    //conditional operators and - &&, & ,or - ||, |, not !, xor ^
    &&,& - returns true if both conditions are true, false otherwise
    ||,| - returns true if at least one of the condition is true
    ^ - returns false if both conditions are true or false, true otherwise
    
    t ^ t = f
    t ^ f = t
    f ^ t = t
    f ^ f = f
    
    What is the difference between && and &, and the || and | ???
    &&, || - short-circuit evaluators
    &, | - bitwise operators
    */
    
    public static void main(String[] args){
        char uCh = 'A'; //65
        char sCh = 'a'; //97
        
        //convert uppercase to lowercase
        //use addition (common way)
        int uC2Lc = uCh + 0x20; //32 decimal, 0010 0000
    
        //use bitwise operator (geeky way)
        //create a bitmask - a value used to convert Uch to Lc
        //which bitwise operator to use (&,|,^)
        //binary and hex numbers  (4 binary digits)
        // 'A' = 65 = 0100 0001 = 0x41
        // 'a' = 97 = 0110 0001 = 0x61
        //bitmask =   0010 0000 = 0x20 (|)
        
        int uC2Lc2 = uCh | 0x20;
        
        System.out.println((int)uCh);
        System.out.println((int)sCh);
        System.out.println((char)uC2Lc);
        System.out.println((char)uC2Lc2);
        
        //convert lowercase to uppercase
        //using subraction
        char lCh = 'a';  //97
        int lC2Uc = lCh - 0x20;
          
        //using bitwise operator
        int lc2Uc2 = lCh ^ 0x20;//Ian's solution
        
        // 'a' = 97 = 0110 0001 = 0x61
        // 'A' = 65 = 0100 0001 = 0x41
        //bitmask =   1101 1111 = 0xDF  (&)
        
        int lc2uc3 = lCh & 0xDF; //0xHH = use hex notation
        
        
        System.out.println((char)lc2Uc2);
        System.out.println((char)lc2uc3);
        
        //hex 0..9, A..F
        //1 hex value == 4 binary digits
        //A == 1010 = 10 decimal
        //B == 1011 = 11 decimal
        
        //other java operators - <<,<<<,>>,>>> (bit manipulation)
        
        //challenge
        //convert characters '0' .. '9' to digits
        // '0' - 0, '1' = 1, '2' = 2 ... '9' = 9
        
        char zeroC = '0'; //48 - 0011 0000
        int zeroN = zeroC - 0x30; 
        
        int bitMask = 0xCF ;   //1100 1111
        
        //clue - if you want to clear a bit, use &
        //in &, if you want to preserve the bit, use 1
        //in &, if you want to clear a bit, use 0
        //clue - if you want to set a bit, use |
        //in| - if you want to preserve use 0,
        //in | - if you want to set use, 1
        
        int zeRon = zeroC & bitMask;
        System.out.println((int)zeroC);
        System.out.println((int)zeroN);
        
        //Conditional
        //if, else, switch..case statement
        /* 
        switch(<expr>){ //could only be int or char
            case <val1>:
            case <val2>:
            case <val3>:
            default:
        }
        */
        char value = 'A';
        
        switch(value){
            case 1: System.out.println("one");
                    //break;
            case 2: System.out.println("two");
                    //break;
            case 3: System.out.println("three");
                    break;
            default:System.out.println("None");
        }
        
        //loops (while, do..while, for(;;))
        /*
         1. loop control variable
         2. condition (true or false)
         3. body/statements
         4. change of state (increment or decrement)
        */
        
        //print numbers 1..10
        //while
        int lcv = 1;
        while(lcv < 11){
            System.out.print(lcv + " ");
            lcv++;
        }
        System.out.println();
        
        //do while
        lcv = 1;
        do{
            System.out.print(lcv + " ");
            lcv++;
        }while(lcv <= 10);
        
        System.out.println();
        //for loop
        for(lcv=1;lcv<=10;lcv++){
           System.out.print(lcv + " "); 
        }
    }
    
}
