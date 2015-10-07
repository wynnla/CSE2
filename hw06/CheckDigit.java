//testing out theory

import java.util.Scanner;
    public class CheckDigit{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            int sum = 0; //the sum of the calculations
            int checkdigit =0; //the value that the checksum will ultimately be compared with
            
            String barcode = input.next(); //obtain the goddamned user input as a string
            boolean valid = barcode.length() == 10 && Integer.parseInt(barcode) > 100000000; // if its ten decimal digits and a numerical
            while(valid == true){//do all of the code
            int b = 1;
            
            
            String lastdigit = ""; //get the checkdigit as a string
                for (int i = 0; i < barcode.length(); i++){ //for this is how I'm going to isolate each digit
                    int val = 0; //val is a storage for the integer version of barcode
                    if (i == (barcode.length())-1){
                        //i.e. the last digit
                        
                        char x = barcode.charAt(i); //obtains the last digit as a char
                        lastdigit = String.valueOf(x); // converts that into a String
                    }
                    else {
                        char num = barcode.charAt(i); //identifies each isolated digit
                        val = (Character.getNumericValue(num))*(10-i);
                        //val = Integer.parseInt(num)*(10-i); //multiply each isolated digit based 
                        //on their index location
                        //System.out.println(val); //test code
                    }
                    sum += val; // still in the for loop friends, add whatever val you got to sum
                    //System.out.println(sum);
                    
                }//end for loop
            int checksum = sum%11; //checksum will be compared to the last digit: checkdigit;
                    //System.out.println(checksum); //test code
            
                if (lastdigit.equals("X")){ // check if lastdigit is X
                    checkdigit = 10; //then it stores check value of 10
                }
                else {
                    checkdigit = Integer.parseInt(lastdigit);
                }
            
            if (checkdigit == checksum){
                System.out.println("Valid ISBN!!!");
            }
            else{
                System.out.println("Not valid ISBN. Last Digit should be "+ checksum);
            }
            
             if (b==1){ //and it does
             
                 break; //break out of loop once code is performed once.
                }
            }//the while loop
            if (valid == false){
                System.out.println("enter a valid barcode");
            }
            
        }//end method
    }//end class