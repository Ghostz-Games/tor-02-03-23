import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
    private static int rnd_number;
    private static Random random = new Random();
    
    public static void main(String[] args) {
        // pick a random number
        
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        // Create a Scanner object       
        // Read user input
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.println("Here! Take a guess:");

        
        if(scan.hasNextDouble()){
            double guess = scan.nextDouble();
            if(guess == rnd_number){
                System.out.println("You guessed it!");
                System.out.println("Wanna try again?");
                System.out.println("[1] Yes");
                System.out.println("[2] No");

                input = scan.nextInt();
                
                switch(input){
                case 1:
                    rnd_number = random.nextInt(100)+1;
                    makeAGuess();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
                }

                
            }else {
                System.out.println("Wrong!");
                if(guess > rnd_number){
                    System.out.println("The number I'm thinking of is lower than your guess! Try again!");
                    makeAGuess();
                }else if (guess < rnd_number){
                    System.out.println("The number I'm thinking of is higher thank your guess! Try again!");
                    makeAGuess();
                }
            }

        }else {
            System.out.println("The input wasn't a number. Try again!");
            makeAGuess();
        }


        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   

}