// input prompt for expenses each day of the week.
//expenses can have decimals
//print simple bar of * chars



import java.util.Scanner;



public class BarGraph{
    //declaration of class
    public static void main(String args[]){ //declare main method
        double Mon, Tue, Wed, Thu, Fri, Sat, Sun; //initialize everythings
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the expenses for Monday ");
            Mon = input.nextDouble();
        System.out.print("Enter the expenses for Tuesday ");
            Tue = input.nextDouble();
        System.out.print("Enter the expenses for Wednesday ");
            Wed = input.nextDouble();
        System.out.print("Enter the expenses for Thursday ");
            Thu = input.nextDouble();
        System.out.print("Enter the expenses for Friday ");
            Fri = input.nextDouble();
        System.out.print("Enter the expenses for Saturday ");
            Sat = input.nextDouble();
        System.out.print("Enter the expenses for Sunday ");
            Sun = input.nextDouble();
        
            
        System.out.print("Expenses for Monday:      " );
            int count = 1;
        for(count = 1; count <= Mon; count++){
            System.out.print("*");
        }
        
        if (Mon - (int)Mon >= 0.5){ //check if the number needs to be rounded
                System.out.print("*");//up. If yes, print out extra star
            } 
        System.out.println();
        
        
        
        
        //print bar grpah for Tuesday
        System.out.print("Expenses for Tuesday:     " );
        count=1;
        for(count = 1; count <= Tue; count++){
            System.out.print("*");
        }
        if (Tue - (int)Tue >= 0.5){ //check if the number needs to be rounded
                System.out.print("*");//up. If yes, print out extra star
            } 
        System.out.println();
        
        
            
            //Bar Graph for wednesday
        System.out.print("Expenses for Wednesday:   " );
            count=1;
        for(count = 1; count <= Wed; count++){
            System.out.print("*");
        }
            if (Wed - (int)Wed >= 0.5){ //check if the number needs to be rounded
                System.out.print("*");//up. If yes, print out extra star
            } 
            System.out.println();
        
        
        
        
        //thursday
         System.out.print("Expenses for Thursday:    " );
            count=1;
        for(count = 1; count <= Thu; count++){
            System.out.print("*");
        }
        if (Thu - (int)Thu >= 0.5){ //check if the number needs to be rounded
                System.out.print("*");//up. If yes, print out extra star
            }     
        System.out.println();
            
            
            
      
        //friday
        System.out.print("Expenses for Friday:      " );
            count=1;
        for(count = 1; count <= Fri; count++){
            System.out.print("*");
        }
        if (Fri - (int)Fri >= 0.5){ //check if the number needs to be rounded
                System.out.print("*");//up. If yes, print out extra star
            }     
        System.out.println();
            
            
            
      //Saturday
        System.out.print("Expenses for Saturday:    " );
            count=1;
        for(count = 1; count <= Sat; count++){
            System.out.print("*");
        }
        if (Sat - (int)Sat >= 0.5){ //check if the number needs to be rounded
                System.out.print("*");//up. If yes, print out extra star
            } 
        System.out.println();
            
            
            
      //Sunday
        System.out.print("Expenses for Sunday:      " );
            count=1;
        for(count = 1; count <= Sun; count++){
            System.out.print("*");
        }
        if (Sun - (int)Sun >= 0.5){ //check if the number needs to be rounded
                System.out.print("*");//up. If yes, print out extra star
            } 
        System.out.println();
        
        double average = (Mon + Tue + Wed + Thu + Fri + Sat + Sun) / 7; 
        System.out.println("Your average weekly expenses are: "+ average);
        
        //calculate estimated expenditures over 4 years
        //expenses typically fluctuate 20% up or down
        double prediction = 0; //prediction of expense after 4 years
        double avgexpense = 0; //weekly predicted average expenses
        int week = 1;
        double percent = 0;
        while(week < 220){
            percent = (((int)(Math.random()*40)-20)/100.0);//(((((int)Math.random()*40))/ - 20)/100);
            avgexpense = (average * percent)+ average;
            prediction = prediction + avgexpense;
            week++;
        }
        
        
        //Test Code:
        //System.out.println(prediction);
        //System.out.println(percent);
        //System.out.println(week);
        
        System.out.printf("your predicted average expense after 4 years is : %.2f%n", prediction);
        
    
            
            
            
            
            
            
            
    }//end main method

} //end class