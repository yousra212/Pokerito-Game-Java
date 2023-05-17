import java.util.Scanner;
public class Pokerito {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println(" - There are two players, you and the computer.");
        System.out.println(" - The dealer will give each player one card.");
        System.out.println(" - Then, the dealer will draw five cards (the river)");
        System.out.println(" - The player with the most river matches wins!");
        System.out.println(" - If the matches are equal, everyone's a winner!\n");
        System.out.println(" - Ready? Type anything if you are.");
        scan.nextLine();

        String yourCard = randomCard();
        String computerCard = randomCard();

        System.out.println("\nYour card is:");
        System.out.println(yourCard);
        System.out.println("\n");
        System.out.println("\nThe computer's card is:");
        System.out.println(computerCard);

        int yourMatches = 0;
        int computerMatches = 0;

        System.out.println("\nNow, the dealer will draw five cards. Press enter to continue.");
        for (int i = 1; i <= 5; i++) {
            scan.nextLine();
            String draw = randomCard();
            System.out.println("Card " + i);
            System.out.println(draw);

            if (draw.equals(yourCard)) {
                yourMatches++;
            }
            if (draw.equals(computerCard)) {
                computerMatches++;
            }
        }

        System.out.println("\nYou had " + yourMatches + " matches.");
        System.out.println("The computer had " + computerMatches + " matches.");

        if (yourMatches > computerMatches) {
            System.out.println("You win!");
        } else if (yourMatches < computerMatches) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("It's a tie!");
        }

    }

    public static String randomCard () {
        double randomNumber = Math.random() * 13;  // 0.0 to 12.999999999999
        randomNumber += 1;  // 1.0 to 13.999999999999
        int randomInt = (int) randomNumber;   // 1 to 13

        switch (randomInt) {
            case 1:
                return  "   _____\n" +
                        "  |A _  |\n"+
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n";
            case 2:
                return  "   _____\n"+
                        "  |2    |\n"+
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";
            case 3:
                return  "   _____\n" +
                        "  |3    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____E|\n";
            case 4:
                return  "   _____\n" +
                        "  |4    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  | o o |\n"+
                        "  |____h|\n";
            case 5:
                return  "   _____\n" +
                        "  |5    |\n"+
                        "  | o o |\n"+
                        "  |  o  |\n"+
                        "  | o o |\n"+
                        "  |____S|\n";
            case 6:
                return  "   _____\n" +
                        "  |6    |\n"+
                        "  | o o |\n"+
                        "  | o o |\n"+
                        "  | o o |\n"+
                        "  |____b|\n";
            case 7:
                return  "   _____\n" +
                        "  |7    |\n"+
                        "  | o o |\n"+
                        "  | o o |\n"+
                        "  | o o |\n"+
                        "  |____L|\n";
            case 8:
                return  "   _____\n" +
                        "  |8    |\n"+
                        "  | o o |\n"+
                        "  | o o |\n"+
                        "  | o o |\n"+
                        "  |____8|\n";
            case 9:
                return  "   _____\n" +
                        "  |9    |\n"+
                        "  | o o |\n"+
                        "  | o o |\n"+
                        "  | o o |\n"+
                        "  |____6|\n";
            case 10:
                return  "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n"+
                        "  | o {)|\n"+
                        "  |o o% |\n"+
                        "  | | % |\n"+
                        "  |__%%[|\n";
            case 12:
                return  "   _____\n" +
                        "  |Q  ww|\n"+
                        "  | o {)|\n"+
                        "  |o o% |\n"+
                        "  | | % |\n"+
                        "  |__%%[|\n";
            case 13:
                return  "   _____\n" +
                        "  |K  ww|\n"+
                        "  | o {)|\n"+
                        "  |o o% |\n"+
                        "  | | % |\n"+
                        "  |__%%[|\n";
            default:
                return "Error";
        }

    }
}
