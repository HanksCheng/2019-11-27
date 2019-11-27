import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String strdata[] = scn.nextLine().split(" ");
        int data[] = new int[strdata.length];
        for (int i = 0; i < strdata.length; i++) {
            data[i] = Integer.parseInt(strdata[i]);
        }
        fun(data);
    }

    public static void fun(int[]data) {
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]*data[i]+"\t");
        }
    }
}