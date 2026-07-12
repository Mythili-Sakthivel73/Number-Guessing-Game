package NumberGuessingGame;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playAgain;
        do{
        System.out.println("Welcome to the Number Guessing Game. You will be given 5 chances to guess the correct number");
        System.out.println("Please choose the difficulty level. Easy/Medium/Tough");
        String difficultyLevel = sc.nextLine().toLowerCase();
        int guess;
        int random = switch(difficultyLevel){
            case "easy":
                System.out.println("Good start. Please guess a number from 1 - 10.");
                yield (int)(Math.random()*10)+1;
            case "medium":
                System.out.println("Nice choice. Please guess a number from 1 - 100.");
                yield (int)(Math.random()*100)+1;
            case "tough":
                System.out.println("Great. Please guess a number from 1 - 1000.");
                yield (int)(Math.random()*1000)+1;
            default:
                System.out.println("Invalid difficulty level. Defaulting to Easy. Please guess a number from 1 - 10.");
                    yield (int)(Math.random()*10)+1;
        };

        int turns =5;
        
        while(turns>0){
            System.out.println("Please enter your guess :");
            guess = sc.nextInt();
            if(guess==random){
                System.out.println("Congrats, you got it right.");
                break;
            }
            else if(guess>random){
                System.out.println("Too high. Guess a little low");
            }
            else{
                System.out.println("Too Low. Guess a little high");
            }
            turns--;
            System.out.println("Turns left: " + turns);
        }
            if(turns==0){
                System.out.println("Sorry you are out of turns. The correct number was "+random);
            }
            while(true){
        playAgain = sc.nextLine().toLowerCase();
        if(playAgain.equals("yes") || playAgain.equals("no")){
            break; 
        } else {
            System.out.println("Invalid input. Please type 'yes' or 'no'.");
        }
    }
        }while(playAgain.equals("yes"));
        System.out.println(" Well played! Good bye.");
        sc.close();

    }
}
