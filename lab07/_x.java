//lab 07
import java.util.Scanner;

public class _x{
    public static void main(String args[]){
        Scanner userin = new Scanner(System.in);
        boolean a = true;
        int input =0;//declare. value will change.
        while (a == true){ //to repear
        System.out.println("Please Enter an Int between 0 and 100 ");
        input = userin.nextInt(); //user input
        if (input < 100 && input > 0){ //valid condition
            break; //ends while loop
        }
        System.out.println("Invalid input");
        }//end input loop
        
        
        //begin print
        int i, j;
        for (i= 0; i <= input; i ++){ //determines the number of lines
            for (j=0; j <= input; j ++){//determines what is in each line
                if(i == j || i == (input - j)){
                    System.out.print(" ");
                }
                else{
                System.out.print("*");
                }
            }//end of j loop
            System.out.println("");
        }//end of i for loop
        
        
        
    }//end main method
    
}//end class