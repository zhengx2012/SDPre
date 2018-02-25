import java.util.Scanner;

public class EnterPIN {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        String password, enteredPassword;
        int pin, entry;

        password = "gnome";
        pin = 12345;

        System.out.println( "WELCOME TO THE BANK OF JAVA." );
        System.out.print( "ENTER YOUR PASSWORD: " );
        enteredPassword = keyboard.next();

        while ( !enteredPassword.equals(password) ) {
            System.out.println( "\nINCORRECT PASSWORD. TRY AGAIN." );
            System.out.print( "ENTER YOUR PASSWORD: " );
            enteredPassword = keyboard.next();
        }

        System.out.print( "ENTER YOUR PIN: " );
        entry = keyboard.nextInt();

        while ( entry != pin ) {
            System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
            System.out.print( "ENTER YOUR PIN: " );
            entry = keyboard.nextInt();
        }
        System.out.println( "\nPASSWORD AND PIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17" );
    }
}
