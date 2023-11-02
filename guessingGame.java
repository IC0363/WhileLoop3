import java.util.Scanner;
import java. lang. Math;

public class guessingGame{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        double userInput;
        double rand = (int)(Math.random()*99)+1;
        System.out.println("Guess a number one through 100. ");
        userInput = input.nextInt();
        while(userInput !=rand){
            if(userInput< rand){
                System.out.println("TOO LOW! Try again");
                userInput = input.nextInt();
            }
            if (userInput>rand){
                System.out.println("TOO HIGH! Try again");
                userInput = input.nextInt();
            }
            counter++;
            if(userInput == rand){
                System.out.println("You got the answer in " + counter + " tries");
            }

              
            
        }


    }
    

}