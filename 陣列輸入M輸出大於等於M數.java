import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int data[]={1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<10;i++){
            if (data[i]>=m){
                System.out.println(data[i]);
            }
        }
    }
}
