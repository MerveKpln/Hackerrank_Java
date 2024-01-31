package Hackerrank_Java;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
       // He is a very very good boy, isn't he?

        s=s.trim();
        String[] tokens= s.split("['!?,._@ ]+");

       if (s.length()==0) {
           System.out.println(0);
       }
       else{
           System.out.println(tokens.length);
           for (String word:tokens) {
               System.out.println(word);
           }
       }



        scan.close();
    }
}
