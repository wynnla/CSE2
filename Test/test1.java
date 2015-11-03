/////////////////////////////////////////////////////////////////////////////////////////////////
//Winston La
// a test dummy




import java.util.Scanner;
public class test1{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("Enter an integer: ");
            
            num = input.nextInt();
            if (num < 0){
                System.out.println ("Enter a positive value: ");
            }
            
            } while ( num < 0 );
        }//end of main method
    




    }//end of test1
