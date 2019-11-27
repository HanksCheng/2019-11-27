import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char data[]=scn.next().toCharArray();
        for (int i=data.length-1;i>=0;i--){
            System.out.print(data[i]);
        }
        System.out.println();
    }
}
