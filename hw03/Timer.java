/* Winston La
Homework 3 for CSE2 with Brian Chen
The Objective: practice in writing code that enables the user to input data and 
gives you practice in performing arithmetic operations.

The assignment today:The user has made plans to go to dinner 
with friends at a certain time. Write a program that prompts the user 
for the current time and dinner time and calculates the amount of time
remaining until they eat dinner. Assume that the user uses military time 
(0 - 23 hours) and input is in the form of an int (HHMM)
where the first two digits represent the hour and the second two
digits represent the minutes. Dont worry about the time being on different days.
*/


//import Scanner before declaring class
import java.util.Scanner;
//declare the class

        public class Timer{
            // main method is declared
            public static void main(String[] args){
                Scanner input = new Scanner( System.in ); //declared scanner variable as input
                
               //scanner finds out information before dinner
                System.out.print("Esteem customer, Please enter the time in form of HHMM in"+
                " military time ");
                int nowTime = input.nextInt(); //promts and ask user for Time.
               
                System.out.print("Esteem customer, this servant requests the time of your meal ");
                int mealTime = input.nextInt(); // promts user for dinner time
               
                int hours =(int) ((mealTime-nowTime) / 100); // converts military times given to hours remaining
                double timeDifference = (((mealTime-nowTime)- (hours*100))); // Stores value for "MM"
                double minutes = timeDifference - 40; //adjustment to correct the time since an hour has only 60 minutes 
               
                //ex. take nowTime as 1250 and mealTime as 1600. the hour difference should be 3:10 but without 
                //adjustment, it will display 3:50. On the other hand if nowTime =1200 and mealTime = 1600 then
                //with the adjustment we get 4:-40 which is also incorrect. Thus....
                
                if (minutes < 0) { 
                minutes += 40; //if minutes is ever negative, that meant that the adjustment was not needed,
                // hence the adjustment is negated
                System.out.println("Esteem customer, you have " +
                hours +" hours and "+ minutes+ " minutes till your meal."); } //Prints out results
                else {
                
                System.out.println("Esteem customer, you have " +
                hours +" hours and "+  minutes +" minutes till your meal"); //print out adjusted value.
                    
                }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            }
        }