//Winston La
//
//Homework 12
// the assignment this time is to create a two dimensional array in the form of a matrix
//the matrix will have randomly generated numbers from -10 to 10 
//the height and width of the matrix is determined by the user
//once generated transpose the entire matrix.
import java.util.Scanner;   //do I even have to?
    
    //class
    public class Transpose{
        
        public static int[][] randomMatrix(int width, int height){          //this method will generate the matrix, given width and height.
            int[][] array = new int[width][height];                         //create an array. declare and allot it space.
            for(int i=0; i< width; i++){                                    //this creates the outer array members or the "height" of the matrix
                for (int j =0; j< height; j++){                             //this creates the inner array members or the "width " of the matrix
                    int randomNum = (int)(Math.random()*-20)+10;            //this generates a random number between -10 and 10 to be assigned to the array pair.
                    array[i][j]=randomNum;                                  //assigned
                }
            }
            return array;                                                   //return the array
            
        }//end matrix making
        
        public static void printArray(int[][] array){                       //this prints out the two dimensional array
            for (int i = 0; i < array.length; i++){                         //outer layer
                for(int j=0; j <array[i].length; j++){                      //inner layer
                    System.out.print(array[i][j] + "\t");                   //start printing
                }//end inner for
                System.out.println("");                                     //indent when ready to go to the next line
            }//end otuer for
        }//end print
        
        //this is the transpose part. Essentially you will be flipping the width and height values
        public static int[][] transposeMatrix(int[][] array, int oldWidth, int oldHeight){  
            int[][] transposeArray = new int[oldHeight][oldWidth];  //create a new array call transposed array
            for (int i=0; i< oldHeight; i++){                       //same format 
                for(int j=0; j<oldWidth; j++){                      //yup just make the array
                    transposeArray[i][j] = array[j][i];             //now here is the key part:  the value in the [j][i] of the old array
                                                                    //is given to the position of [i][j] in the new array
                }                                                   //so if in the old array [1][6] = 9, in the new array the position of  [6][1] will have the value 9.
            }
            return transposeArray;
        }
        
        public static void main(String args[]){                     //main method. BOO YA
            
            Scanner input = new Scanner(System.in);                 //scanner, blah blah blah
            boolean goodNum = false;                                //check to see if user put in a good number
            int height = 0;                                         //declare
            int width = 0;                                          //declare
            while (!goodNum){                                       //no good? lets find a good one
                System.out.print("Enter the height: ");             
                if (input.hasNextInt()){                            //is it an integer?    
                    height = input.nextInt();                       //yes (?)
                    goodNum = true;                                 //good to go
                    if (height < 0){                                //but WAIT!  get back here. Is it a positive?
                        goodNum = false;                            //No? Do it again dingnut
                        System.out.println("    ERROR: Enter a positive Integer."); 
                    }//end of positive check
                }//end of integer check
                else{                                               //okay this part only runs if it wasn't an integer
                    System.out.println("    ERROR: Enter an Integer."); 
                    input.next();
                }//end of error integer condition
                
            }//end of while
            goodNum = false;                                    //round two
            while(!goodNum){                                    //sseriously no difference from the previous one other than the fact that it is checking another int
                System.out.print("Enter the width: ");
                if (input.hasNextInt()){
                    width = input.nextInt();
                    goodNum = true;
                    if(width < 0){
                        goodNum = false;
                        System.out.println("    ERROR: Enter a positive Integer.");
                    }//end of positive check
                }//end of integer check
                else{
                    System.out.println("    ERROR: Enter an Integer.");
                    input.next();
                }//end of error integer condition
            }//end of while
            
            
            int[][] array = randomMatrix(height,width);                     //create your new matrix by calling method
            printArray(array);                                              //print it
            System.out.println("");                                     
            System.out.println("Transposed:");                                  
            int[][] newArray = transposeMatrix(array, height, width);       //get the transposed method
            printArray(newArray);                                           //print it.
            
        }//end main method
        
    }//end class