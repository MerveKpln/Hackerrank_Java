import java.io.*;
import java.text.NumberFormat;
import java.util.*;
public class CurrencyFormatter {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        double payment = input.nextDouble();

        input.close();



        String paymentUS = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String paymentIN = NumberFormat.getCurrencyInstance(new Locale("EN","IN")).format(payment);

        String paymentFR = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String paymentCH = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);





        System.out.println("US: "+ paymentUS );
        System.out.println("India: "+ paymentIN );
        System.out.println("France: "+ paymentFR );
        System.out.println("China: "+ paymentCH );


    }

}