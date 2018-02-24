public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, age, age1;
        double seconds, e, checking, time;
        String firstName, lastName, title, date;

        x = 10;
        y = 400;
        age = 39;
        age1 = 5;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        time = 99.99;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";
        date = "today";



        System.out.println( "The variable x contains " + x );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + " " + lastName );
        System.out.println( "The date " + date + " is my son's birthday." );
        System.out.println( "He is about " + time + "% sure he's gonna get ice cream." );

    }
}