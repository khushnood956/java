
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
    System.out.println("Welcome to Random Number Guessing game");
    int Ran_Number = (int)(Math.random()*100);
    Scanner sc = new Scanner(System.in);
    int Guessed = sc.nextInt();
    if (Ran_Number == Guessed )
    System.out.println("You Guessed Correctly");
    else if (Ran_Number > Guessed) {

        System.out.println("The number you have guessed is smaller.");
        System.out.print("Correct number is ");
        System.out.println(Ran_Number);
    }
    else  {
        System.out.println("The number you have guessed is greater.");
        System.out.print("Correct number is ");
        System.out.println(Ran_Number);



    }

    }


}
