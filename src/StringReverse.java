import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder reverse = new StringBuilder(A);


        if (reverse.reverse().toString().equals(A)){
            System.out.println("Yes");
        }
        else System.out.println("No");
        //2nd way
//        int length= A.length();
//        for (int i = 0; i < length / 2; i++) {
//            if (A.charAt(i) != A.charAt(length - i - 1)) {
//                System.out.println("No");
//
//            }
//        }
//        System.out.println("Yes");
    }




}

