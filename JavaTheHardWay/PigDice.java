import java.util.Scanner;

public class PigDice {
    public static void main(String [] args) {
        // Human Input
        Scanner keys = new Scanner(System.in);
        // Variables personTotal = person total, computersTotal = computer total
        int roll, personTotal, computersTotal, turnTotal;
        String choice = "";
        //Inital Game Values
        personTotal = 0;
        computersTotal =0;

        do {
            // Initializes the turn total
            turnTotal = 0;
            System.out.println( "You have " + personTotal + " points." );

            do {
                roll = 1 +(int)(Math.random()*6);
                System.out.println( "\tYou rolled a " + roll + "." );
                // If the roll is 1 the turn ends and no points are given
                if ( roll == 1) {
                    System.out.println( "\tThat ends your turn." );
                    turnTotal = 0;
                }
                // User able to roll for higher or end turn and keep points
                else {
                    turnTotal += roll;
                    System.out.print( "\tYou have " + turnTotal + " points" );
                    System.out.print( " so far this round.\n" );
                    System.out.print( "\tWould you like to \"roll\" again" );
                    System.out.print( " or \"hold\"? " );
                    choice = keys.next();
                }
                // If the dice hits one the turn ends otherwise continue to roll
            } while ( roll != 1 && choice.equals("roll"));
            // Adds the turn total to the Users total score
            personTotal += turnTotal;
            System.out.println( "\tYou end the round with " + personTotal + " points." );
            // If the person has not won the computer can continue to play
            if ( personTotal < 100 ) {
                turnTotal = 0;
                System.out.println( "Computer has " + computersTotal + " points." );

                do {
                    roll = 1 + (int) (Math.random()*6);
                    System.out.println( "\tComputer rolled a " + roll + "." );
                    if ( roll == 1 ) {
                        System.out.println( "\tThat ends the turn." );
                        turnTotal = 0;
                    }
                    else {
                        turnTotal += roll;
                        System.out.print( "\tComputer has " + turnTotal );
                        System.out.print( " points so far this round. \n" );
                        if ( turnTotal <= 20 || (computersTotal + turnTotal) >= 100 ){
                            System.out.println( "\tComputer will not roll again." );
                        }
                    }
                } while (roll != 1 && turnTotal <20 );
                computersTotal += turnTotal;
                System.out.print( "\tComputer ends the round with " );
                System.out.print( computersTotal + " points.\n" );
            }
        // The game continues until either the person or computer reach 100 or more
        } while ( personTotal < 100 && computersTotal < 100 );
        if ( personTotal > computersTotal ) {
            System.out.println( "Humanity wins!" );
        }
        else {
            System.out.println( "The computer wins." );
        }

    }

}
