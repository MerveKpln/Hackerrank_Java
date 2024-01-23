import java.util.*;
import java.io.*;
public class Java_Loops_II
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<n; j++){
                a+= (int)(Math.pow(2,j)*b);
                System.out.print(a+" ");//ln kullanmadik yan yana yazdirmak icin
            }
            System.out.println();//alt satira gecmek icin
        }

        in.close();
    }
}
