package Hackerrank_Java;

import java.math.BigInteger;
import java.util.*;
public class BigIntegerr {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner input = new Scanner(System.in);

        BigInteger num1= new  BigInteger(input.nextLine());
        BigInteger num2=new BigInteger(input.nextLine());
        input.close();



        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));


    }
}
