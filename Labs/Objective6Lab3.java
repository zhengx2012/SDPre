public class Objective6Lab3 {
    public static void main(String [] args) {
        int counter = 0;

        do {
            counter++;
            if ( counter % 2 == 0) {
                System.out.println( counter + " is even." );
                }

            else {
                System.out.println(counter + " is odd.");
            }
        } while ( counter < 20);

    }
}
