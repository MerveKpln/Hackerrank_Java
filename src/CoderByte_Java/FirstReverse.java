package CoderByte_Java;
import java.util.*;
import java.io.*;
public class FirstReverse {
    public static String FirstReverse(String str) {
        // code goes here
       str = String.valueOf(new StringBuffer(str).reverse());

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }
}
