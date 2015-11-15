/*Winston La 
Lab 12

*/

    public class twoArray{
        //creates the member arrays of a ragged array
        public static int[][] raggedArray(){
           
           
           int randomSize = (int)(Math.random()*10)+10;
           
           int[][] array = new int[randomSize][];
           int number;
           for (int i= 0; i < randomSize;i++){
               int raggedSize = (int)(Math.random()*10)+10;
               array[i] = new int[raggedSize];
               for (int j =0; j < array[i].length; j++){
                    number =(int)(Math.random()*-2000)+1000;
                    array[i][j] = number;
               }
           }
           return array;
          
        }
        public static void printArray(int[][] m){
            for(int i=0; i< m.length; i++){
                for (int j=0; j <m[i].length; j++){
                    System.out.print(m[i][j]+" ");
                    
                }
                System.out.println("");
            }//end for
        }//end print arry
        public static void printArray(int[] m){
            for(int i=0; i< m.length; i++){
                
                System.out.print(m[i]+" ");
                    
            }
            
        }//end print arry
        
        public static void main(String args[]){
            int[][] array = raggedArray();
            printArray(array);
            
        }
    }//end class