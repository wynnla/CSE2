//lab07
//Winston La
//program requests user to input 5 doubles from smallest to largest.
//assume user always puts in a double
//compute the mean of 5 doubles
//compute median of 5 doubles
// print out mean and median

import java.util.Scanner;
public class Stats{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int i;
        double a,b,c,d,e;
        //request user input for five doubles
        System.out.println("Enter five doubles from smallest to largest");
        System.out.print("Input a double ");
        a = input.nextDouble();
        System.out.print("Input a double ");
        b = input.nextDouble();
            while ( a >b){
            System.out.print("Enter a number greater than the last one ");
            b = input.nextDouble();
        }
        System.out.print("Input a double ");
        c = input.nextDouble();
            while ( b > c){
                System.out.print("Enter a number greater than the last one ");
            c = input.nextDouble();
            }//end of while condition
        System.out.print("Input a double ");
        d = input.nextDouble();
            while ( c > d){
                System.out.print("Enter a number greater than the last one ");
                d = input.nextDouble();
            }//end of while condition
        System.out.print("Input a double ");
        e = input.nextDouble();
        while ( d > e){
            System.out.print("Enter a number greater than the last one ");
            e = input.nextDouble();
            }//end of while condition
        double mean = findMean(a,b,c,d,e);
        double median = findMedian(a,b,c,d,e);
        prinInfo(mean, median);
        
    }//end of main method
    
    public static double findMean(double num1, double num2, double num3, double num4, double num5){
        return (num1+num2+num3+num4+num5)/5.0;  
    }//end of findMean method
    public static void prinInfo(double x, double l){
        System.out.println("The Mean/Average is: " + x);
        System.out.println("The Median is: " + l);
    }//end of printinfo method
    
    public static double findMedian(double v, double w,double f,double y,double z){
        
        return f;
        
        
    }//end of findMedian Method
    
    
    
    
    
    
    
    
}//end of class

