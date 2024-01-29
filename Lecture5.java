import java.util.*;

class Lecture5 {
    public static void main(String ar[]) {
        int x = 12;
        int y = 18;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);

        byte b = 10;
        System.out.println("b = "+b);
        //Typecasting

        byte c = (byte) 200;
        System.out.println("c = "+c);

        int i = c;
        System.out.println("i = "+i);

        float f = (float) 8.21;
        System.out.println("f = "+f);

        // Increment and Decrement operators
        int m = 10;
        int n = ++m;
        System.out.println("n value is = "+n);

        int p = 10;
        int q = ++p;
        System.out.println("q value is = "+q);
    }
}
