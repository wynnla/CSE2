//lab 6 getting used to loops

    public class GettingLoopy{
        public static void main(String args[]){
            int a = 1;
            int counter = 0;
            while (counter < 6){
            System.out.print(a++);
            counter++;
            }
            while (counter < 10) {
                System.out.print(a);
                counter++;
            } 
            //if it cannot be divisable by 2, a non prime number 
            //must be divisible by 3 or 5 or 7
            
            //STEP 2
            
          //int
          a= 10;
            while (a>=10 && a<=99){
                a++;
                if (a%2 != 0){
                    if (a%3 != 0){
                        if (a%5 != 0){
                            if (a%7 != 0){
                                System.out.print( " " + a + " " );
                            }
                        }
                    }
                }
            }
            
            for( a=10; a<99; a++){
                if (a%2 != 0){
                    if (a%3 != 0){
                        if (a%5 != 0){
                            if (a%7 != 0){
                                System.out.print( " " + a + " " );
                            }
                        }
                    }
                }
            }
        
           //int 
           a= 10;
            do {
                a++;
                if (a%2 != 0){
                    if (a%3 != 0){
                        if (a%5 != 0){
                            if (a%7 != 0){
                                System.out.print( " " + a + " " );
                            }
                        }
                    }
                }
            }while (a>=10 && a<=99);
            
            int pool = (int)(Math.random()*200 + 5);
            //int begin = 1;
            int count = 0;
            int looptime = 0;
            
            while (count < pool) {
                 System.out.print(":3");
                 count++;
                 //begin++;
                 if (count % 20 == 0){
                     System.out.println();
                      //break;
                    }
            }
            
            
            
            
        }//end main
        
    } //end class