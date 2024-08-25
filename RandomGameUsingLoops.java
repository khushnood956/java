import java.util.Scanner;

public class RandomGameUsingLoops {
    public static void main(String[] args) {
        System.out.println("Welcome to RANDOM NUMBER GUESSING GAME");
        int Random = (int)(Math.random()*100);

        int Number = 0;

       do {
            System.out.print("Please Input your number:");
            Scanner sc = new Scanner(System.in);
            Number = sc.nextInt();
            System.out.print("Please Input your number:");
            // System.out.println(Number);
            if (Random == Number)
            System.out.println("Congrats! You Guessed Correctly :)");
            else if (Number > Random)
            System.out.println("The Number you have guessed is higher! Please Try Again.");
            else if (Number < Random)
            System.out.println("The Number you have guessed is lower! Please Try Again.");
            
        }   while (Number != Random);
        System.out.println("Thanks for Playing!!");
        System.out.println("Good Bye!!");

    }
    
}
