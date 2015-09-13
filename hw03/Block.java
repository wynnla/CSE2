/*Winston La
CSE 2 Homework 2. Part 2.
Write a program that prompts the user for the length, width, 
and height of a block. The program will calculate the volume of 
the block and the surface area. The measurements should be of type double. */

//import Scanner before declaring class
import java.util.Scanner;
//declare the class

        public class Block{
            // declared main method
            public static void main(String[] args){
                Scanner input = new Scanner( System.in ); //declared scanner variable as input
                
                //declare the variables
                double length; // defines length in double
                double width; //defines width in doubles
                double height; //define height in double
                
                // ask user for measurement length, width and height 
                //measurement and return volume and surface area.
                System.out.print("Enter the length "); //promts user
                length = input.nextDouble(); // take in user inputs
                System.out.print("Enter the width "); //prompts user for width in meter
                width = input.nextDouble();// takes in input
                System.out.print("Enter the height ");// promts for height
                height = input.nextDouble(); //stores height value
                
                //calculate volume
                double volume = length * width * height; 
                //calculate surface area
                double SA = (2*width*length) + (2*height*length)+ (2*width*height);
                
                // Print out length and height
                System.out.print("The volume of your block with dimensions " + length + " X "); 
                System.out.print( width + " X "); // displays dimenstions first and then volume
                System.out.print( height + " X ");
                System.out.println( " is " + volume); // Seperated for a nicer view. everything is one the same line
                System.out.println("The Surface Area of your block is " + SA); // your surface area
    
                
                
                
            }
}