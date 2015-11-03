/*  Winston La
    Generate the cards through a series of arrays.
    shuffle them
    randomly pick them out.
    The method printArray(list) takes an array of Strings and prints out each element, separated by a space “ “
    The method shuffle(list) shuffles the elements of the list by continuously randomize an index number of list
    (that is not zero) and swaps the element at that index with th
    
    e first element (at index 0). Swap however many times you like, 
    but choose > 50 times since you want the deck of 52 cards well shuffled.
    The method randomizeHand(list) very self-explanatory, pick out 5 Strings of array list 
    and return them as an array of 5 Strings.
*/
import java.util.Scanner;
public class Shuffling{
        
        public static void shuffle(String[] deck){
            for (int i = 0; i < 52; i ++){
                int index = (int)(Math.random()*52);
                String temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
            
        }//end of Shuffle
        
        public static void printArray(String[] S){
           int i =0;
            for(i = 0; i < S.length; i ++){
               System.out.print(S[i] + " ");
               if (i == 12 || i == 25 || i == 38){
                   
                   System.out.println("");
               }
            }//end of print loop
            if (i >= S.length){
                System.out.println("");
            }
        }//end of printy array
        
        public static String[] randomizeHand(String[] S){
            String handCard[];
            handCard = new String[5];
            for (int i =0; i < 5; i ++){
                int randomNum = (int)(Math.random()*52);   
                handCard[i] = S[randomNum];
            }
            return handCard;
            
        }//randomizedhand
    
        public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        
        //assigns the cards with their suits. 
        for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
        //System.out.print(cards[i]+" ");
        }//end of the for loop
        System.out.println("");
        System.out.println("Deck of Cards");
        
        printArray(cards);
        shuffle(cards);
        System.out.println("");
        System.out.println("Shuffled!");
        printArray(cards);
        hand = randomizeHand(cards);
        System.out.println("");
        System.out.println("Random Hand!");
        printArray(hand);
        }//end the main method
}