//Lab03
//Winston La
//Learning about the scanner
/*The user has gone out to dinner with friends. 
After they receive the bill, they decide to split the check evenly.
Write a program that uses the Scanner class to obtain from the user the original cost of the check, 
the percentage tip they wish to pay, and the number of ways the check will be split.
Then determine how much each person in the group needs to spend in order to pay the check.
 */
 import java.util.Scanner;
 
 // define public class
    public class Check{
        //declare main method
        public static void main(String[] args) {
            Scanner input = new Scanner( System.in );
            System.out.print("Enter the original cost of the check in the form xx.xx: ");
            double checkCost = input.nextDouble();
            
            System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):" );
            double tipPercent = input.nextDouble();
            tipPercent /= 100; //We want to convert the percentage into a decimal value
            
            System.out.print("Enter the number of people who went out to dinner: ");
            int numPeople = input.nextInt();
            double totalCost;
            
            //Print out the receipt
            double costPerPerson; // initialize
            int dollars,   //whole dollar amount of cost 
            dimes, pennies; //for storing digits
            //to the right of the decimal point 
            //for the cost$ 
            totalCost = checkCost * (1 + tipPercent); // combine cost with tip
            costPerPerson = totalCost / numPeople;
            //get the whole amount, dropping decimal fraction
            dollars=(int)costPerPerson;
            //get dimes amount, e.g., 
            // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
            //  where the % (mod) operator returns the remainder
            //  after the division:   583%100 -> 83, 27%5 -> 2 
            dimes=(int)(costPerPerson * 10) % 10;
            pennies=(int)(costPerPerson * 100) % 10;
            System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies); //prints out your bill
            

        }  //end of main method   
  	} //end of class

