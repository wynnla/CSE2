//check digit

import java.util.Scanner;
    public class CheckDigit{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            
            long barcode = input.nextLong();
            
                long digitvalue = (long)((barcode/10));//gets rid of the last digit since that will be our check
                long sum = (digitvalue%10)*(2);
            
                //System.out.println(digitvalue); testing code
            
                for(int i = 2; i < 10; i++){
                    digitvalue = ((digitvalue/10)); // take 1234567891. We will be moving from right to left.
                                                                //so that the first digit should be 9, 8, 7, 6, 5..... 
                                                                //the digitvalue will add to sum everytime it goes through the loop.
                    //System.out.println(digitvalue);test code
                    sum += (digitvalue%10)*(i+1); //this is the section that will add to the sum.
                
                    //System.out.println(sum);
                }
                long checksum = sum % 11;
                long lastdigit = ((long)(barcode % 10));
                if (checksum == lastdigit){
                    System.out.println("This is a valid ISBN code!");
                }
                else{
                    System.out.println("The correct ISBN should be "+ checksum);
                }
                
                //System.out.println(sum); //testing code
                //System.out.println(checksum);
                //System.out.println(lastdigit);
            
            
            
                
            }//end main method
        
        }//end class
        
        