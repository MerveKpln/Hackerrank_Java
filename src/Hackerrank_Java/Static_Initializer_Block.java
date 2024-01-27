package Hackerrank_Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Static_Initializer_Block {

     static boolean flag;
     static int B,H;


static {
    Scanner input= new Scanner(System.in);
    B= input.nextInt();
    H= input.nextInt();
    input.close();

    if(B>0 && B<=100 && H>0 && H<100 ) flag=true;
    else  System.out.println("java.lang.Exception: Breadth and height must be positive");;
}

    //2nd way
//    flag=true;
//    static{
//        Scanner input= new Scanner(System.in);
//        B= input.nextInt();
//        H= input.nextInt();
//        input.close();
//        try {
//            if(B<=0 || H<=0){
//                flag=false;
//                throw  new Exception("java.lang.Exception: Breadth and height must be positive");
//            }
//
//        }catch (Exception e){
//            System.exit(0);
//        }
//    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

