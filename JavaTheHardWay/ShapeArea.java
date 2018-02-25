import java.util.Scanner;

public class ShapeArea {
    public static void main(String [] args) {
        Scanner keys = new Scanner(System.in);
        int choice;
        double area = 0;
        String tai = "The area is ";
        
        System.out.print( "Shape Area Calculator version 0.1" );
        System.out.println( " (c) 2015 LJtHW Sample Output, Inc." );
        
        do {
            System.out.println( "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
            System.out.println( "1) Triangle" );
            System.out.println( "2) Circle" );
            System.out.println( "3) Rectangle" );
            System.out.println( "4) Square: ");
            System.out.println( "5) Quit" );
            System.out.print( "> " );
            choice = keys.nextInt();
            
            if ( choice ==1 ) {
                System.out.print( "\n Base: " );
                int b = keys.nextInt();
                System.out.print( "Height: " );
                int h = keys.nextInt();
                area = triangleArea(b, h);
                System.out.println( tai + area );
            }
            else if ( choice == 2 ) {
                System.out.print( "\nRadius: " );
                int radius = keys.nextInt();
                area = circleArea(radius);
                System.out.println( tai + area );
            }
            else if ( choice == 3 ) {
                System.out.print( "\nLength: " );
                int l = keys.nextInt();
                System.out.print( "Width: " );
                int w = keys.nextInt();
                System.out.println( tai + rectangleArea(l, w) );
            }
            else if ( choice == 4 ) {
                System.out.print( "\nSides: " );
                int s = keys.nextInt();
                System.out.println( tai + squareArea(s) );
            }
            else if (choice !=5 ) {
                System.out.println( "ERROR." );
            }

        } while ( choice !=5 );
                
    }

    public static double triangleArea( int base, int height ) {
        double A;
        A = 0.5 * base * height;
        return A;
    }

    public static double circleArea( int radius ) {
        double A;
        A = Math.PI * radius * radius;
        return A;
    }

    public static int rectangleArea( int length, int width ) {
        return ( length * width );
    }

    public static int squareArea( int side ) {
        return ( side * side );
    }
}
