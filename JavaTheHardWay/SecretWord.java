import java.util.Scanner;

public class SecretWord {
    public static void main(String [] args) {
     Scanner input = new Scanner(System.in);
     String secret = "please", guess;

     System.out.print( "What's the secret word? " );
     guess = input.next();

     if ( guess.equals(secret) ) {
         System.out.println( "That's correct!" );
     }
     if ( guess.equals(secret) || guess.equals("happy")) {
         System.out.print( "That works!" );
        }
     else {
         System.out.println( "No, the secret word isn't \"" + guess + "\"." );
     }
    }
}
