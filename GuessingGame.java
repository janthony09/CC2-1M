import java.util.*;
public class GuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int numberGuess = rand.nextInt(100) + 1;
        int tries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
	    System.out.println(numberGuess);
            System.out.println("Guess the number between 1 to 100");
            System.out.println("You have 5 tries to guess the number");      
        while(win == false){

            guess = input.nextInt();
            tries++;
            
            if(guess == numberGuess){
                win = true;
                System.out.println("You Win");
                System.out.println("The Number was " + numberGuess);
                System.out.println("It Took You " + tries + " Tries before you guess the number");
            }
            else if(guess<numberGuess){
                System.out.println("Too low try Higher");
            }
            else if(guess>numberGuess){
                System.out.println("Too high try Lower");
            }
            if(guess != numberGuess && tries == 5){
                System.out.println("You lose");
                break;
            }
        }   
    }
}

