import java.util.Scanner;

public class RunningTotal {
    public static void main(String [] args) {
        Scanner keys = new Scanner(System.in);
        int current, total = 0;

        System.out.print( "Type in a bunch of values and I'll add them up. " );
        System.out.println( "I'll stop when you type zero" );

        do {
            System.out.print( "Value: " );
            current = keys.nextInt();
            total += current;
            System.out.println( "The total so far is: "+ total );
        } while ( current !=0 );

        System.out.println( "The final total is: " + total );
    }
}
