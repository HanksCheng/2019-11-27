import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char data[] =scn.nextLine().toCharArray();
        char f=scn.next().charAt(0);
        int count = 0,r=0,i=0;
        while (count <2){
                if (data[i]==f){
                    count++;
                }
                System.out.print(data[i]);
                i++;
        }

    }
}
