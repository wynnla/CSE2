/* Winston La
hw04
Design a program that can read the type of hand that you have. First
Generate the cards. Then determine the suit and facevalue. 
Then determine the type of hand.

*/
import java.util.Scanner; 

      public class CardGame{
            public static void main(String[] args) {
            
            //this is for testing purposes
                Scanner input = new Scanner(System.in);//declared scanner as a variable input
                System.out.println("the contents of this program is restricted to authorized users ");
                System.out.println("You will be prosecuted by the law if this message is seen but you run the program ");
                System.out.print("enter your card1 in numerical form ");
                int card1 = input.nextInt();
                System.out.print("enter your card2 numerical form ");
                int card2 = input.nextInt();
                System.out.print("enter your card3 numerical form ");
                int card3 = input.nextInt();
                System.out.print("enter your card4 numerical form ");
                int card4 = input.nextInt();
                System.out.print("enter your card5 numerical form ");
                int card5 = input.nextInt();
                
                /*/ /random number from 1-52 for five cards
                int card1 = (int)(Math.random()*52)+1; //first card
                int card2 = (int)(Math.random()*52)+1;//second card
                int card3 = (int)(Math.random()*52)+1; //third card
                int card4 = (int)(Math.random()*52)+1;//fourth card
                int card5 = (int)(Math.random()*52)+1; //fifth card
                */
              //suits for five cards
                String suit1 = "0"; // declare the variable for suits
                String suit2 = "0";
                String suit3 = "0";
                String suit4 = "0";
                String suit5 = "0";
                
                //card1 suit
                if (card1 <= 13){ //define the cards by their suit sets.
                    suit1 = "Diamonds";
                }
                else if (card1 <=26){
                    suit1 = "Clubs";
                }
                else if (card1 <= 39) {
                    suit1 = "Hearts";
                }
                else {
                    suit1 = "Spades";
                }
                    
                 //card 2 suit   
                if (card2 <= 13){ 
                    suit2 = "Diamonds";
                }
                else if (card2 <=26){
                    suit2 = "Clubs";
                }
                else if (card2 <= 39) {
                    suit2 = "Hearts";
                }
                else {
                    suit2 = "Spades";
                } 
                    
                //card 3 suit    
                if (card3 <= 13){ 
                    suit3 = "Diamonds";
                }
                else if (card3 <=26){
                    suit3 = "Clubs";
                }
                else if (card3 <= 39) {
                    suit3 = "Hearts";
                }
                else {
                    suit3 = "Spades";
                }
                    
                //card 4 suit    
                if (card4 <= 13){ 
                    suit4 = "Diamonds";
                }
                else if (card4 <=26){
                    suit4 = "Clubs";
                }
                else if (card4 <= 39) {
                    suit4 = "Hearts";
                }
                else {
                    suit4 = "Spades";
                }
                 
                 //Card5 suit
                if (card5 <= 13){ 
                    suit5 = "Diamonds";
                }
                else if (card5 <=26){
                    suit5 = "Clubs";
                }
                else if (card5 <= 39) {
                    suit5 = "Hearts";
                }
                else {
                    suit5 = "Spades";
                } // this ends the section where the suits are decided
            
                //This is long but here begins Five cards. At the same time
                //A counter will be initiated for each card. There are thirteen counters
                int Ace     = 0;// the Counters
                int Two     = 0;
                int Three   = 0;
                int Four    = 0;
                int Five    = 0;
                int Six     = 0; 
                int Seven   = 0;
                int Eight   = 0;
                int Nine    = 0;
                int Ten     = 0;
                int Jack    = 0;
                int Queen   = 0;
                int King    = 0;
                
                String value1 = "0"; // the declartion of string values 1- 5
                String value2 = "0"; //
                String value3 = "0"; //
                String value4 = "0"; //
                String value5 = "0"; //
                
                //First card
                switch (card1%13) { //defines the card value based on the remainder 13/13 = 0 meaning 13th card = KING
                    case 1: value1 = "Ace"; Ace++;  break;
                    case 2: value1 = "2";   Two++;  break;
                    case 3: value1 = "3";   Three++;break;
                    case 4: value1 = "4";   Four++; break;
                    case 5: value1 = "5";   Five++; break;
                    case 6: value1 = "6";   Six++;  break;
                    case 7: value1 = "7";   Seven++;break;
                    case 8: value1 = "8";   Eight++;break;
                    case 9: value1 = "9";   Nine++; break;
                    case 10: value1 = "10"; Ten++;  break;
                    case 11: value1 = "Jack"; Jack++; break;
                    case 12: value1 = "Queen"; Queen++;break;
                    case 0: value1 = "King"; King++;break;
                }
                
                //second card
                 switch (card2%13) { //defines the card value based on the remainder 13/13 = 0 meaning 13th card = KING
                    case 1: value2 = "Ace"; Ace++;  break;
                    case 2: value2 = "2";   Two++;  break;
                    case 3: value2 = "3";   Three++;break;
                    case 4: value2 = "4";   Four++; break;
                    case 5: value2 = "5";   Five++; break;
                    case 6: value2 = "6";   Six++;  break;
                    case 7: value2 = "7";   Seven++;break;
                    case 8: value2 = "8";   Eight++;break;
                    case 9: value2 = "9";   Nine++; break;
                    case 10: value2 = "10"; Ten++;  break;
                    case 11: value2 = "Jack"; Jack++; break;
                    case 12: value2 = "Queen"; Queen++;break;
                    case 0: value2 = "King"; King++;break;
                }
                
                
                //third card
                 switch (card3%13) { //defines the card value based on the remainder 13/13 = 0 meaning 13th card = KING
                    case 1: value3 = "Ace"; Ace++;  break;
                    case 2: value3 = "2";   Two++;  break;
                    case 3: value3 = "3";   Three++;break;
                    case 4: value3 = "4";   Four++; break;
                    case 5: value3 = "5";   Five++; break;
                    case 6: value3 = "6";   Six++;  break;
                    case 7: value3 = "7";   Seven++;break;
                    case 8: value3 = "8";   Eight++;break;
                    case 9: value3 = "9";   Nine++; break;
                    case 10: value3 = "10"; Ten++;  break;
                    case 11: value3 = "Jack"; Jack++; break;
                    case 12: value3 = "Queen"; Queen++;break;
                    case 0: value3 = "King"; King++;break;
                }
                
                
                //fourth card
                switch (card4%13) { //defines the card value based on the remainder 13/13 = 0 meaning 13th card = KING
                    case 1: value4 = "Ace"; Ace++;  break;
                    case 2: value4 = "2";   Two++;  break;
                    case 3: value4 = "3";   Three++;break;
                    case 4: value4 = "4";   Four++; break;
                    case 5: value4 = "5";   Five++; break;
                    case 6: value4 = "6";   Six++;  break;
                    case 7: value4 = "7";   Seven++;break;
                    case 8: value4 = "8";   Eight++;break;
                    case 9: value4 = "9";   Nine++; break;
                    case 10: value4 = "10"; Ten++;  break;
                    case 11: value4 = "Jack"; Jack++; break;
                    case 12: value4 = "Queen"; Queen++;break;
                    case 0: value4 = "King"; King++;break;
                }
                
                //fifth card
                switch (card5%13) { //defines the card value based on the remainder 13/13 = 0 meaning 13th card = KING
                    case 1: value5 = "Ace"; Ace++;  break;
                    case 2: value5 = "2";   Two++;  break;
                    case 3: value5 = "3";   Three++;break;
                    case 4: value5 = "4";   Four++; break;
                    case 5: value5 = "5";   Five++; break;
                    case 6: value5 = "6";   Six++;  break;
                    case 7: value5 = "7";   Seven++;break;
                    case 8: value5 = "8";   Eight++;break;
                    case 9: value5 = "9";   Nine++; break;
                    case 10: value5 = "10"; Ten++;  break;
                    case 11: value5 = "Jack"; Jack++; break;
                    case 12: value5 = "Queen"; Queen++;break;
                    case 0: value5 = "King"; King++;break;
                }// here ends the sections where the card valuesare determined
                
                String hand = "0"; //declare a storage space for hand type
                
                
                //This will allow me to use else if on three of a kind
               //check for two pairs and one pair
               int pairCount = 0; //count for pairs
               //If the statement holds true, add one to paircount.
                if (Ace == 2){
                    pairCount++; //if there is a pair of ace, ++ to paircounter
                }                   // pair counter never goes above two
                if (Two == 2){
                    pairCount++;
                }
                if (Three == 2){
                    pairCount++;
                }
                if (Four == 2){
                    pairCount++;
                }
                if (Five == 2){
                    pairCount++;
                }
                if (Six == 2){
                    pairCount++;
                }
                if (Seven == 2){
                    pairCount++;
                }
                if (Eight == 2){
                    pairCount++;
                }
                if (Nine == 2){
                    pairCount++;
                }
                if (Ten == 2){
                    pairCount++;
                }
                if (Jack == 2){
                    pairCount++;
                }
                if (Queen == 2){
                    pairCount++;
                }
                if (King == 2){
                    pairCount++;
                }
                
                //determines if you have one pair or two pair 
                //active only if there is a pair or two pair
                if (pairCount > 0){
                    if (pairCount > 1) //if your count is 2, two pairs
                        hand = " Two Pairs!";
                    else { // or else it must be a pair since code only active if pair/pairs
                        hand = " a Pair!";
                    }
                }
                
                
                
                
            //check to see if five of a kind
                if ( Ace==5 || Two==5 || Three == 5 || Four == 5 || Five == 5
                || Six==5  || Seven==5 || Eight==5 || Nine==5 || Ten==5 
                || Jack ==5 || King == 5 || Queen == 5) {
                        hand = " Five of a Kind!";
                        }
                //check four of a kind        
                if ( Ace==4 || Two==4 || Three == 4 || Four == 4 || Five == 4 || Six==4 
                || Seven==4 || Eight==4 || Nine==4 || Ten==4 
                ||Jack ==4 || King == 4 || Queen == 4) {
                        hand = " Four of a Kind!";
                        }
                
                //check to see if it is three of a kind
                
                if ( Ace==3 || Two==3 || Three == 3 || Four == 3 || Five == 3 || Six==3 
                || Seven==3 || Eight==3 || Nine==3 || Ten==3 
                ||Jack ==3 || King == 3 || Queen == 3) {
                        hand = " Three of a Kind!";
                        if (pairCount == 1) {
                            hand = " Full House!" ;
                        }
                        } //end for three of kind
            
                if (suit1.equals(suit2.equals(suit3.equals(suit4.equals(suit5))))){
                    hand = " Flush";
                }
            
                
                if (hand.equals("0")){
                    hand = " a High Card hand!";
                } //hand was initially declared as 0. if hand did not change, it must be a high card.
                
                
                //Print out results
                System.out.println("Your random cards are: ");
                System.out.println("the "+ value1 +" of " + suit1 +",");
                System.out.println("the "+ value2 +" of " + suit2 +",");
                System.out.println("the "+ value3 +" of " + suit3 +",");
                System.out.println("the "+ value4 +" of " + suit4 +",");
                System.out.println("the "+ value5 +" of " + suit5 +",");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("You have " + hand);
                
                
                
                
                
            }//ends main method
      }//ends class