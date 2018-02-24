import java.util.Scanner;

public class Squencing {
    public static void main(String [] args) {


        Scanner input = new Scanner(System.in);
        double price = 0, salesTax, total;


        System.out.print( "How much is the purchase price?");
        price = input.nextDouble();

        salesTax = price * 0.0825;
        total = price + salesTax;

        System.out.println( "Item:\t" + price );
        System.out.println( "Sales tax:\t" + salesTax);
        System.out.println( "Total cost:\t" + total);

        input.close();

    }
}
