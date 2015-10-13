//check digit

import java.util.Scanner;
    public class CD{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            //long barcode = 0000000000000000000;//input.nextLong();
            String barcode = input.next(); //;
            int lastdigit = 0;
                if (barcode.length - 1 == "X"){
                lastdigit = 10; //last digit is a ten
                Long.parseLong(barcode); //converts the remaining 9 integers to long
                }
                else{
                    Long.parseLong(barcode); //convert entire string to long
                    lastdigit = (barcode.length-1); //obtain last place index
                    Long.parseLong(lastdigit); //convert string index to long
                    long digitvalue = (long)((barcode/10));//gets rid of the last digit since that will be our check
                }
            
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
                //long lastdigit = ((long)(barcode % 10)); //old code
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
        
        