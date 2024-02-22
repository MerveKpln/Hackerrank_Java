package CoderByte_Java;
import java.util.*;
import java.io.*;
import java.util.function.Function;

public class FirstFactorial {
    public static int FirstFactorial(int num) {
        // code goes here
        if (num == 0)
            return 1;
        else
            num=num * FirstFactorial(num-1);


        return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);

        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
    }
}
