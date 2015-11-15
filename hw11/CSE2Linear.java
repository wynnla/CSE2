/*Winston La
Homework 11
Assignment: Write a program called CSE2Linear.java that prompts the user to enter 15 ints 
for students’ final grades in CSE2. Check that the user only enters ints, and print an error 
message if the user enters anything other than an int.  Print a different error message for 
an int that is out of the range from 0-100, and finally a third error message if the int is 
not greater than or equal to the last int.  Print the final input array.  Next, prompt the 
user to enter a grade to be searched for. Use linear search to find the entered grade. 
Indicate if the grade was found or not, and print out the number of iterations used. 

Next, scramble the sorted array randomly, and print out the scrambled array. 
Prompt the user again to enter an int to be searched for, and use linear search
to find the grade. Indicate if the grade was found or not, and how many iterations it took. 
*/
    
    
    
    import java.util.Scanner;  
    public class CSE2Linear{
        
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] studentGrade;
        studentGrade = new int[15];
            
        //make sure the user enters an integer    
		int grade = 0;
		for (int i=0; i < 15; i++){
		    //Make sure the user enters an integer for the variable grade
		    boolean acceptableGrade = false; //valid condition for the user
	    	while (!acceptableGrade){
		        System.out.print("Enter the student's Grade: ");
		            if (input.hasNextInt()){ // if it is a number continue
		                grade = input.nextInt();
		                acceptableGrade = true;
	                    if (grade < 0 || grade > 100){   
	                        acceptableGrade = false; 
	                        System.out.println("    ERROR: must be an integer between 0 and 100");
	                    }
		         
		            }
		            else{
		                System.out.println("   ERROR: need a integer");
                        System.out.print("Input your integer: ");
                        input.next();
		            }
		    }//ends while validation
		    studentGrade[i] = grade;
		}//ends array value assignment
		selectionSort(studentGrade); //sort the grades from lowest to highest
		System.out.println("Sorted:");
		printArray(studentGrade);
		
		System.out.print("Enter a grade to search for: ");
		int theNum= input.nextInt();
		binarySearch(studentGrade, theNum);
		scramble(studentGrade);
		System.out.println("Scrambled");
		printArray(studentGrade);
		System.out.print("Enter a grade to search for: ");
		theNum= input.nextInt();
		linearSearch(studentGrade, theNum);
		
		
        }//end main method
    
    public static void selectionSort(int[] list){
        for(int i = 0; i <list.length - 1; i++){
            //find the minimim of the list
            int currentMin = list[i];
            int currentMinIndex = i;
            
            for (int j = i+1; j < list.length; j++){ //inner loop with the intention of making sure what you have is really the smallest number in the array
                if (currentMin > list[j]){          //if there are any numbers which are less than your "minimum"
                    currentMin =list[j];            //replace your minimum and index value
                    currentMinIndex = j;
                }
            }//end of inner loop
             //swapping time
             if (currentMinIndex != i){             //if the minimum value was changed- a new minimum was found
                 list[currentMinIndex] = list[i];   //the index of the found minimum value now holds the value in list[i] 
                 list[i] = currentMin;              //but the current index now holds a new value
             }   
            
        }//end of for loop
       // printArray(list);
    }//end of slecection sorting method
        
    public static void linearSearch(int array[], int key){
        for(int i= 0; i < array.length; i++){
            if (array[i] == key){
            System.out.println(key + " is found within "+ i + " iterations.");
            return;
            }
        }
        System.out.println("The number "+ key+ " is not found.");
    }
    
    public static void scramble(int[] array){
            for (int i = 0; i < array.length; i ++){            //inner loop to scramble
                int index = (int)(Math.random()*array.length);  //create a random number for the array length
                int temp = array[i];                            //store the value at the current index in temp
                array[i] = array[index];                        //give the value of the current index the value of another index
                array[index] = temp;                            //meanwhile, the value of the other index is given the value of the previous
            }                                                   //this is to prevent duplication and overwriting of indexes.
            
        }//end of Shuffle
    
    public static int binarySearch(int[] array, int key){
        //initialize all the lower values to be used
        int low = 0;                                            //this will keep track of the lower bound
        int high = array.length -1;                             // this will keep track of the upper bound
        int mid =0;                                             // this will find the middle of the bounds
        int count = 0;                                                      //iterations    
        while (high >= low){                                    //while the upper limit is greater than or equal to the lower limit
            mid = (low + high)/2;                               //we have yet to cover everything. locate the middle.
            if (key < array[mid]){                              //if the number you are searching for is less. the number is in the lower half
                high = mid -1;                                  //adjust your upper bound accordingly
            }   
            else if (key == array[mid]){                        //if you found it. GOOD.
                System.out.println("Found in "+ count + " iterations");
                return array[mid];
            }
            else{                                               //if not either of the prior situations, it must be in the upper half. 
                low = mid + 1;
            }
        count++   ;     //increment your iterations
        }
        
        System.out.println("Number not Found. Surrounding numbers are: " + array[mid+1] +" and "+ array[mid-1]); //print out the two numbers surrounding it if not found.
        return -1;
    }
    
    
    
    
    
    public static void printArray(int[] S){
           int i =0;
            for(i = 0; i < S.length; i ++){
               System.out.print(S[i] + " ");
            }
            System.out.println();
    }//end of printy array method
        
    }//end class