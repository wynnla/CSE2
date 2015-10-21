/* Winston La
homework 8
this program determines whether the string, or a specified numbers of of the string are letters
*/
import java.util.Scanner;
//this is the class
public class StringAnalysis{ 
    
    //the main method is here
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);     //declared scanner for use
        System.out.print("Please enter a String: ");//print out the instructions
        String item = input.next();                 //read user input
        
        boolean goodresponse = false; //used to check if the next response is good
        String choice = "0";            //declare the user input comparison variable
        
        //forcing user to make right choice
        while (!goodresponse){          //repeated force the user to put in a valid input
            System.out.print("do you want to analyze all of the string (y/n): ");
             choice = input.next();
            if (choice.equals("y")||choice.equals("n")){  //choice must be valid
                goodresponse = true;
            }   
            else {
                System.out.println("please enter a valid response"); //or else they do it again
            }//end of else statement
        }//end of while good response loop    
        
        
        String yes  = "y";  //delcare comparison variables
        String no   = "n";  //these might have been unnessasary but they were in the beginning so Im going to leave them here
        boolean valid = true; //the boolean that will undergo change through the methods
        
        if (choice.equals(yes)){
           valid= analyze(item); //indicates that user wants to check entire string
        }
        else if (choice.equals(no)){    //indicates that user wants only a certain number checked
            boolean goodnum = false;    
            int number = 0;
            System.out.print("Enter the number of characters you want to check. Note we will check from the left most to right most. "); //prompt user for number
            while (!goodnum){ //check to make sure number is an int
                if (input.hasNextInt() ){
                    number = input.nextInt();
                    goodnum = true; //if number is an int end loop
                }
                else{
                    System.out.println("ERROR: Need an Integer");
                    System.out.print("Try Again. Input your Integer: ");
                    input.next(); //if not an int. repeat
                }//end of else
            valid= analyze(item, number); //method to determine if there are numbers
            }
        }//end of else if for choice = no
        
        
        //print results
        if (valid == false){
            System.out.println("There is a number in this String");
        }
        else{
             System.out.println("There are no numbers in this String");
        }
        
    }//main method
    
    //method to analyze entire string
    public static boolean analyze(String s){
        int i;
        for (i=0; i < (s.length())-1; i++){ //analyze every character in the string
            char n = s.charAt(i);           //extract character at designated index
            boolean letter = Character.isLetter(n); //determine if it is a letter
            if (letter == false){
                return false;       //if there is a number here, break and return
                
            }
            
        }//end of for loop 
        //after the loop is done and everything is checked.
        return true;
    }//end of all method
    
    //method to analyze some parts of the string
    public static boolean analyze(String s, int limit){ //take in additional value
        int i;
        if (limit > s.length()-1){              //the purpose of this is to make sure that 
            for (i=0; i < (s.length())-1; i++){ //if the user put in a number greater than the string legnth, the program will default to string legnth
                char n = s.charAt(i);
                boolean letter = Character.isLetter(n);
                if (letter == false){
                    return false;
                
                }//end if 
            
            }//end of for loop 
            return true;
        }//end of initial if statement
        
        else{                               //otherwise the string will only be evaluated up to the limit
            for (i=0; i < limit; i++){
                char n = s.charAt(i);
                boolean letter = Character.isLetter(n);
                if (letter == false){
                    return false;
                
                }//end if 
            
            }//end of for loop 
            return true;
        }
        
        
    }//end of some method
    
}//end of class