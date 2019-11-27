import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        long n=scn.nextLong();

        fun(n);
    }
    public static void fun(long n){
        String str=Long.toString(n);
        for (int i=0;i<str.length();i++){

            if(i==str.length()-1){
                System.out.print(str.charAt(i));
            }else {
                System.out.print(str.charAt(i)+" ");
            }
        }
        System.out.println();
    }
}