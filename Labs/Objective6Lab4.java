public class Objective6Lab4 {
    public static void main(String [] args) {
        int counter = 1, currentSumTotal = 1;

        do {
            counter++;
            currentSumTotal += counter;

        } while (counter <20 );
        System.out.println( currentSumTotal );
    }
}
