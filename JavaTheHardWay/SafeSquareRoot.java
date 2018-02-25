import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        double x, y;
        String ready, reply;

        System.out.print( "Give me a number, and I'll find it's square root." );
        System.out.print( " (No negatives, please.)" );
        x = keyboard.nextDouble();

        ready = "YES!";

        System.out.print( "Are you ready?!?" );
        System.out.print( " (Please reply YES! or NO!)" );
        reply = keyboard.next();

        while ( !reply.equals(ready)) {
            System.out.print("Are you ready?!?");
            reply = keyboard.next();
        }

        while ( x < 0 ) {
            System.out.println( "I won't take the square root of negative." );
            System.out.print( "\nNew number: " );
            x = keyboard.nextDouble();
        }

        y = Math.sqrt(x);

        System.out.println( "The square root of "+x+" is "+y );
    }
}
