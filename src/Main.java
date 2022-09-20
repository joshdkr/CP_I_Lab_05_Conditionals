import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        String player1;
        String player2;
        String yesNo;
        boolean shouldContinue = true;

        while(shouldContinue == true)
        {
            System.out.println("Enter player 1's move [R][P][S]: ");
            player1 = kb.nextLine();
            System.out.println("Enter player 2's move [R][P][S]: ");
            player2 = kb.nextLine();


            if(Objects.equals(player1, "R"))
            {
                if(Objects.equals(player2, "R"))
                {
                    System.out.println("It's a tie.");
                }
                if(Objects.equals(player2, "P"))
                {
                    System.out.println("Paper covers rock.");
                }
                if(Objects.equals(player2, "S"))
                {
                    System.out.println("Rock breaks scissors.");
                }
            }
            if(Objects.equals(player1, "P"))
            {
                if(Objects.equals(player2, "R"))
                {
                    System.out.println("Paper covers rock.");
                }
                if(Objects.equals(player2, "P"))
                {
                    System.out.println("It's a tie.");
                }
                if(Objects.equals(player2, "S"))
                {
                    System.out.println("Scissors cut paper.");
                }
            }
            if(Objects.equals(player1, "S"))
            {
                if(Objects.equals(player2, "R"))
                {
                    System.out.println("Rock breaks scissors.");
                }
                if(Objects.equals(player2, "P"))
                {
                    System.out.println("Scissors cut paper.");
                }
                if(Objects.equals(player2, "S"))
                {
                    System.out.println("It's a tie.");
                }
            }

            System.out.println("Would you like to play again?");
                yesNo = kb.nextLine();
                    if(Objects.equals(yesNo, "Y"))
                        shouldContinue = true;
                    else
                        System.out.println("Thanks for playing.");
                        shouldContinue = false;
        }
    }
}