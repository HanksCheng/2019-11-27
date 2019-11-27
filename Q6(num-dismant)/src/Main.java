import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String n=scn.next();
        for (int i=0;i<n.length();i++){
            System.out.print(n.charAt(i)+" ");
        }
        System.out.println();
    }

}
