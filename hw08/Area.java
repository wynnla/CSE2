//Winston LA
//Homework 8
//have user choose rectangle, square, or circle and enter appropriate dimensions and calculate the area

import java.util.Scanner;

    public class Area{ //declared class
        public static void main(String[] args){
            //open up by declaring necessary variables
            Scanner input = new Scanner(System.in); 
            String circle = "circle";
            String rectangle = "rectangle";
            String triangle = "triangle";
            String shape = "0";
            System.out.print(" Which shape do you want (rectangle, circle, or triangle? Please type in your response. ");
            boolean goodresponse = false;
            while (!goodresponse){ //verify that the user inputs a valid shaper or else ask again
                shape = input.next();
                if (shape.equals(circle)|| shape.equals(rectangle)||shape.equals(triangle)){
                    goodresponse = true;
                }
                else{
                    System.out.print("ERROR: Enter a valid response: ");
                }
            }
            
            //Depending on the shape you execute different commands
            if (shape.equals(circle)){
                circleArea();           //shape is circle
            }//end of circle test
            else if (shape.equals(rectangle)){
                rectArea();             //shape is rectangle
            }
            else if (shape.equals(triangle)){
                triArea();              //shape is triangle
            }
            
            
        }//end of main method
        
        public static void circleArea(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the radius of your circle: ");
            double radius = input.nextDouble(); //have user input radius
            double cArea = findcArea(radius);
            printArea(cArea);
        }//end CircleArea
        
        public static double findcArea(double r){
            return Math.PI * Math.pow(r, 2);
        }//end of circle area find
        
        public static void rectArea(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the length of your rectangle: ");
            double length = input.nextDouble(); //have user input radius
            System.out.print("Enter the width of your rectangle: ");
            double width = input.nextDouble();
            double rArea = findrArea(length, width);
            printArea(rArea);
        }
          public static double findrArea(double l, double w){
            return l*w;
        }
        public static void triArea(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the height of your triangle: ");
            double height = input.nextDouble(); //have user input radius
            System.out.print("Enter the base of your triangle: ");
            double base = input.nextDouble();
            double tArea = findtArea(base, height);
            printArea(tArea);
        }//end of triarea
        
        public static double findtArea(double b, double h){
            return (b*h)/2;
            
        }//end of find t area    
        
        
        
        public static void printArea(double a){
            System.out.println("The Area is: "+ a);
        }//end of printarea
        
    } //end of class