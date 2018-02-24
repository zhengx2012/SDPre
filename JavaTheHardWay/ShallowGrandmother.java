import java.util.Scanner;

public class ShallowGrandmother {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int age;
        double income, cute, happy;
        boolean allowed;

        System.out.println( "Enter your age: " );
        age = input.nextInt();

        System.out.println( "Enter your yearly income: " );
        income = input.nextDouble();

        System.out.println( "How cute are you, on a scale from 0.0 to 10.0? " );
        cute = input.nextDouble();

        System.out.println( "How happy can you make some one? " );
        happy = input.nextDouble();

        allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 || happy >=7.0 ));

        System.out.println( "Allowed to date my grandchild? " + allowed );
    }
}
