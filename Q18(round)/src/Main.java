import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double n=scn.nextDouble();
        System.out.println((int)f(n));
    }
    public static double f(double n){
        if (n==0||n==1){
            return n+1;
        }
        else {
            return f(n-1)+f((Math.floor(n/2d)));
        }
    }
}
