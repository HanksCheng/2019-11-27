import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String idstr = scn.next();
        int data[]={10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};
        int v1 = data[idstr.charAt(0)-'A'];
        int p=(v1/10)+(9*(v1%10));
        int j=1;
        for (int i=8;i>=1;i--){
            p+=i*Integer.parseInt(idstr.substring(j,j+1));
            j++;
        }
        p+=Integer.parseInt(idstr.substring(9,10));
        if (p%10==0){
            System.out.println("CORRECT!!!");
        }else{
            System.out.println("WRONG!!!");
        }
    }
}