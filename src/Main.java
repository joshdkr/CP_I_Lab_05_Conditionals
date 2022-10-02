import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        String player1;
        String player2;
        String yesNo;
        boolean shouldContinue = true;

        while(shouldContinue)
        {



                System.out.println("Enter player 1's move [R][P][S]: ");
                player1 = kb.nextLine();

                while(!"R".equalsIgnoreCase(player1) && !"P".equalsIgnoreCase(player1)  && !"S".equalsIgnoreCase(player1))
                {
                    System.out.println("Please enter a valid selection [R][P][S]:");
                    player1 = kb.nextLine();
                }

                System.out.println("Enter player 2's move [R][P][S]: ");
                player2 = kb.nextLine();

                while(!"R".equalsIgnoreCase(player2) && !"P".equalsIgnoreCase(player2)  && !"S".equalsIgnoreCase(player2))
                {
                    System.out.println("Please enter a valid selection [R][P][S]:");
                    player2 = kb.nextLine();
                }



                if (player1.equalsIgnoreCase("R")) {
                    if (player2.equalsIgnoreCase("R")) {
                        System.out.println("It's a tie.");
                    }
                    if (player2.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers rock.\nPlayer 2 wins.");
                    }
                    if (player2.equalsIgnoreCase("S")) {
                        System.out.println("Rock breaks scissors.\nPlayer 1 wins.");
                    }
                }
                else if (player1.equalsIgnoreCase("P")) {
                    if (player2.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers rock.\nPlayer 1 wins.");
                    }
                    else if (player2.equalsIgnoreCase("P")) {
                        System.out.println("It's a tie.");
                    }
                    else if (player2.equalsIgnoreCase("S")) {
                        System.out.println("Scissors cut paper.\nPlayer 2 wins.");
                    }
                }
                else if (player1.equalsIgnoreCase("S")) {
                    if (player2.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks scissors.\nPlayer 2 wins.");
                    }
                    else if (player2.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cut paper.\nPlayer 1 wins.");
                    }
                    else if (player2.equalsIgnoreCase("S")) {
                        System.out.println("It's a tie.");
                    }
                }

                System.out.println("Would you like to play again?[Y][N]:");
                yesNo = kb.nextLine();
                if (yesNo.equalsIgnoreCase("Y"))
                {
                    shouldContinue = true;
                } else {
                    System.out.println("Thanks for playing.");
                    shouldContinue = false;
                }
        }
    }
}