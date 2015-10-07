/*Develop an ISBN validator. Prompt the user to enter
a 10 digit number and using a loop, verify if the number
meets the criteria to be a valid ISBN. If the number is not a 
valid ISBN, determine a check digit that would make the number
a valid ISBN. Since numbers divided by 11 can have a remainder 
of 10, but the check digit can only be a single digit number, 
use the letter X (the Roman numeral 10) to represent a check digit
of 10. */

import java.util.Scanner;

public class CheckDigit{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 10-digit barcode: ");
        char X = 10;
        int barcode = input.nextInt();
        int digit1 = (int)(barcode/1000000000.0);
        int digit2 = (int)((int)(barcode%1000000000.0)/100000000.0);
        int digit3 = (int)((int)(barcode%100000000.0)/10000000.0);
        int digit4 = (int)((int)(barcode%10000000.0)/1000000.0);
        int digit5 = (int)((int)(barcode%1000000.0)/100000.0);
        int digit6 = (int)((int)(barcode%100000.0)/10000.0);
        int digit7 = (int)((int)(barcode%10000.0)/1000.0);
        int digit8 = (int)((int)(barcode%1000.0)/100.0);
        int digit9 = (int)((int)(barcode%100.0)/10.0);
        int digitX = ((int)(barcode%10.0));
        
        
        System.out.println(digit1 + " "+ digit2 + " "+ digit3);
        System.out.println(digit4 + " "+ digit5 + " "+ digit6);
        System.out.println(digit7 + " "+ digit8 + " "+ digit9 +" "+ digitX);
        
        
        
        
        
        
    }//end main method
}//end class
