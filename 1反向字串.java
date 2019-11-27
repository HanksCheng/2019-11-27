import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        fun(str);
    }
    public static void fun(String str) {
        char data[] = str.toCharArray();
        for (int i=data.length-1;i>=0;i--){
            System.out.print(data[i]);
        }
        System.out.println();
    }
}