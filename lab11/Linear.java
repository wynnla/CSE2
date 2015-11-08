/*Create two integer arrays (array1 and array2) of size 5000.
Fill array1 with random integers between 0 and 100000
Use linear search to print out the minimum and maximum values of array1.
Add increasing random numbers to array2. (How you do this is an intentional puzzle).
Print out the minimum and maximum values of array2. (hint you can do this without serious effort at search)
Prompt the user to enter an int >= 0, and exit the program if they do not enter an int >= 0.
Use binary search to search the array for the inputted value.
Say if the number was found or not found.
If the number was not found, print out the numbers below and above the searched for number (or if there are none, state “none”)
*/
import java.util.Scanner;
public class Linear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int minimum = 0;
        int maximum = 0;
        int i =0;
        int array1[];
        array1 = new int[5000] ;
        //fill the array
        for( i=0; i < 5000; i++ ){
            int arrayFill = (int)(Math.random()*100000);    
            array1[i] = arrayFill;
        }
        
        
        //search for minimum and maximum in array 1
        for(int l =0; l< 5000; l++ ){
            minimum = array1[0];
            maximum = array1[0];
            if (array1[l] < minimum){
                minimum = array1[l];
            }
            if (array1[l] > maximum){
                maximum = array1[l];
            }
        }
        
        System.out.println("minimum of Array1: "+ minimum);
        System.out.println("maximumof Array1: "+ maximum);
        
        
        
        int array2[];
        array2 = new int[5000];
        int arrayFill2 = 0;
        for( i=0; i < 5000; i++ ){
            arrayFill2 = (int)(Math.random()*100000);    
            array2[i] = arrayFill2;
        }
        
        selectionSort(array2);
        
        
         //search for minimum and maximum in array 2
        int minimum2 = array2[0];//begin by assuming that the first index value is your minimum
        int maximum2 = array2[0];
        for( i =0; i< 5000; i++ ){ //go through every number
            
            if (array2[i] < minimum2){ //if you happen to find a number smaller than your minimum, take it as your new min
                minimum2 = array2[i];
            }
            if (array2[i] > maximum2){ // if you gind a number bigger than your maximum
                maximum2 = array2[i];   //take it as your new max
            }
        }
        
        System.out.println("minimum of Array2: "+ minimum2);
        System.out.println("maximumof Array2: "+ maximum2);
        
        
        boolean acceptableInt = false; //valid condition for the user
		int userinput = 0;
		
		//Make sure the user enters an integer
		while (!acceptableInt){
		    System.out.print("Enter an integer: ");
		        if (input.hasNextInt()){ // if it is a number continue
		            userinput = input.nextInt();
		            acceptableInt = true;
	                if (userinput < 0){   
	                    acceptableInt = false; 
	                    System.out.println("    ERROR: must be a positive int");
	                }
		         
		        }
		        else{
		            System.out.println("   ERROR: need a integer");
                    System.out.print("Input your integer: ");
                    input.next();
		        }
		}//ends while validation
		       
		      /* int low = 0;
		       int high = array2.length -1;
		       boolean foundnum = false;
		       int upperlimit = 0;
		       int lowerlimit = 0;
		       while (high >= low){
		           int mid = (low + high)/2;
		           if (userinput < array2[mid]){
		               high = mid -1;
		           }
		           else if (userinput == array2[mid]){
		               System.out.println("Found Number: " + userinput + " At Index "+ mid);
		               foundnum = true;
		               break;
		           }
		           else{
		               low = mid + 1;
		           }
		       }//ends binary search
		       
		       if (foundnum == false){
		           
		           System.out.println("Number not found");
		       }*/
		       
		       binarySearch(array2, userinput);
		       
		        
    }//end of main
    
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length -1;
        int mid =0;
        while(high >= low) {
            mid = (low + high)/2;
            if (key < list[mid]){
                high = mid -1;
            }
            else if (key == list[mid]){
                System.out.println(key+ " Number Found at Index: " + mid);
                return mid;
            }
            else{
                low = mid + 1;
            }
            
        }
        System.out.println("Number not found");
        System.out.println(list[mid+1] + " is the number above and the number below is " + list[mid-1]);
        
        return -low -1;
    }
    
    
    
    
    
    
    
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
    }//end of slecection
    
    public static void printArray(int[] S){
           int i =0;
            for(i = 0; i < S.length; i ++){
               System.out.print(S[i] + " ");
            }
        }//end of printy array
    
    
}//end of class