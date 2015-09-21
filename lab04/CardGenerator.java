/* Winston La
lab04
You are a magician and you need to practice your card tricks before your big 
show in Las Vegas. Since you donâ��t want to reveal your secrets, you need to
write a program that will pick a random card from the deck so you can practice 
your tricks alone. Use a random number generator to select a 
number from 1 to 52 (inclusive).  Each number represents one card, and the 
suits are grouped:  Cards 1-13 represent the diamonds, 14-26 represent the clubs
then hearts, then spades.  In all suits, card identities ascend in step with the 
card number: 14 is the ace of clubs, 15 is the 2 of clubs, and 26 is the king
of clubs.
*/

        public class CardGenerator{
            public static void main(String[] args) {
                //random number from 1-52
                int card = (int)(Math.random()*52)+1;
                String suit = "0";
                
                if (card <= 13){ //define the cards by their suit sets.
                    suit = "Diamonds";
                }
                else if (card <=26){
                    suit = "Clubs";
                }
                else if (card <= 39) {
                    suit = "Hearts";
                    
                }
                else {
                    suit = "Spades";
                }
                
                String value = "0";
                
                switch (card%13) { //defines the card value based on the remainder 13/13 = 0 meaning 13th card = KING
                    case 1: value = "Ace"; break;
                    case 2: value = "2"; break;
                    case 3: value = "3"; break;
                    case 4: value = "4"; break;
                    case 5: value = "5"; break;
                    case 6: value = "6"; break;
                    case 7: value = "7"; break;
                    case 8: value = "8"; break;
                    case 9: value = "9"; break;
                    case 10: value = "10"; break;
                    case 11: value = "Jack"; break;
                    case 12: value = "Queen"; break;
                    case 0: value = "King"; break;
                }
                //print out your card
                System.out.println("You have picked the " + value + " of " + suit);
                    
                    
                
                }
                
            }
        