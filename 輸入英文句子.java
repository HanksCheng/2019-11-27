import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char data[] =scn.nextLine().toCharArray();
        char f=scn.next().charAt(0);
        int count = 0,r=0;
        while (count <2){
            for (int i=0;i<data.length;i++){
                if (data[i]==f){
                    count++;
                    r=i;
                }
            }
        }
        for (int i=0;i<=r;i++){
            System.out.print(data[i]);
        }
    }
}
