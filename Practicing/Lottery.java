import java.util.Scanner;

    public class Lottery{ //declare class
        public static void main(String[] args){ //main method
            //generate a lottery number
            int lottery = (int)(Math.random()*100);
            
            //prompts user for  guess
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your guess ");
            int guess = input.nextInt();
            
            //get digits from lottery
            int lotteryDigit1 = lottery / 10;
            int lotteryDigit2 = lottery/ 100;
            
            //get digits from guess
            
            int guessDigit1 = guess/ 10;
            int guessDigit2 = guess/ 100;
            
            System.out.println("the lottery number is " + lottery);
            
            //check guess
            if (guess==lottery) {
                System.out.println("JackPot! You won $10,000");
                
            }
            else if (guessDigit1 == lotteryDigit1
                    ||guessDigit2 == lotteryDigit2
                    ||guessDigit2 == lotteryDigit1
                    || guessDigit1 == lotteryDigit2) {
                System.out.println("you won $1000");
                    }
            else {
                System.out.println("no win");
            }
            
            
            
            
        }// ends static void
    } //ends class