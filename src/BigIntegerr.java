import java.math.BigInteger;
import java.util.*;
public class BigIntegerr {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        BigInteger num1= input.nextBigInteger();
        BigInteger num2= input.nextBigInteger();
        input.close();



        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));


    }
}
