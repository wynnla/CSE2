import java.util.Scanner;
public class  Twisty{ //declares class
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		boolean acceptableWidth = false; //valid condition for the user
		boolean acceptableLength = false; //validify condition for user
		int width = 0;
		int length =0;
		
		//width
		while (!acceptableWidth){
		    System.out.print("Please enter the width "); //the size of each individual X
		    
		        if (input.hasNextInt()){ // if it is a number continue
		         width = input.nextInt();
	                acceptableWidth = true; 
	                if (width >= 80){   //cannot be greater than 80
	                    acceptableWidth = false; //but if the number is greater than 80 repeat
	                    System.out.println("    ERROR: cannot be greater than 80");
	                    //System.out.print("input your integer: ");
	                    //input.next();
	                }
		         
		        }
		        else{
		            System.out.println("   ERROR: need a integer");
                    System.out.print("Input your integer: ");
                    input.next();
		        }
		}//ends while validation
		
		
		//length
		while (!acceptableLength){
		    System.out.print("Enter the length "); // the length of the printout
		    
		    if (input.hasNextInt()){
		        length = (input.nextInt());
		            if( length >= width){//check condition 2;
		                
		                if (length <= 80){ //check condition 3
		                    acceptableLength = true;
		                }
		                else{
	                        acceptableWidth = false; //but if the number is greater than 80 repeat
	                        System.out.println("    ERROR: cannot be greater than 80");
	                        //System.out.print("input your integer: ");
	                        //input.next();
	                        
	                    }//ends the over 80 condition
		            
	                    
		            }//ends the greater than width condition
		            else{
		                System.out.println("    ERROR: length must be greater than or equal to width");
		               
		            }
		            
		            
		            
		    }//ends numerical condition
		    
		    
		    else{ //if it is not a number
		        System.out.println("   ERROR: need a integer");
                System.out.print("Input your integer: ");
                input.next();
		    }
	
		}//ends while validation
		int i,j;
		boolean a = true; //alternaters. a variable will determine whether # or \ will be printed.
		boolean b = true;// b variable will switch whether / or # will be printed
		

		for (i = 0; i <= width; i++){//determines the length of the code as a whole.
			a = true;//must reset to true at each line because they all begin
		    b = true;//with the same pattern
			
			for (j = 0; j <= length; j++ ){ // begin printing out inner loop
				 
				if(j%width == i && a==true) { //if the remainder is the same as i
                    System.out.print("#");//then that means that a character must be printed
                    a = false;              //the first one is #. switch to \ on next X
                        
                }
                else if(j%width == i && a==false) {
                    System.out.print("\\");     //print out \ character due to previous switch
                    a = true;               //switch back to # for next X
                        
                }
                else if (j%width == (width - i -1) && b==true){ //print out the other / portion of the X
                    System.out.print("/");  //begin with / pattern 
                    b=false;    //switch to # pattern for next X
                }
                else if (j%width == (width - i -1) && b==false){
                    System.out.print("#"); //print out # pattern on / part of X due to prior switch
                    b=true;             //switch back so you print / on the next X.
                }
            
                
                else{
                System.out.print(" "); //everything else is a space.
                }

			}// ends j loop
			System.out.println(""); //make sure to line feed and carriage return on a new line.
		}//ends i loop
		
	}

}