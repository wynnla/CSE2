//Winston La
//Homework 12

import java.util.Scanner;
    
    public class Transpose{
        
        public static int[][] randomMatrix(int width, int height){
            int[][] array = new int[width][height];
            for(int i=0; i< width; i++){
                for (int j =0; j< height; j++){
                    int randomNum = (int)(Math.random()*-20)+10;
                    array[i][j]=randomNum;
                }
            }
            return array;
            
        }//end matrix making
        
        public static void printArray(int[][] array){
            for (int i = 0; i < array.length; i++){
                for(int j=0; j <array[i].length; j++){
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println("");
            }
        }//end print
        
        public static int[][] transposeMatrix(int[][] array, int oldWidth, int oldHeight){
            int[][] transposeArray = new int[oldHeight][oldWidth];
            for (int i=0; i< oldHeight; i++){
                for(int j=0; j<oldWidth; j++){
                    transposeArray[i][j] = array[j][i];
                    
                } 
            }
            return transposeArray;
        }
        
        public static void main(String args[]){
            
            Scanner input = new Scanner(System.in);
            boolean goodNum = false;
            int height = 0;
            int width = 0;
            while (!goodNum){
                System.out.print("Enter the height: ");
                if (input.hasNextInt()){
                    height = input.nextInt();
                    goodNum = true;
                    if (height < 0){
                        goodNum = false;
                        System.out.println("    ERROR: Enter a positive Integer.");
                    }//end of positive check
                }//end of integer check
                else{
                    System.out.println("    ERROR: Enter an Integer.");
                    input.next();
                }//end of error integer condition
                
            }//end of while
            goodNum = false;
            while(!goodNum){
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
            
            
            int[][] array = randomMatrix(height,width);
            printArray(array);
            System.out.println("");
            System.out.println("Transposed:");
            int[][] newArray = transposeMatrix(array, height, width);
            printArray(newArray);
            
        }//end main method
        
    }//end class