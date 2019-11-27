import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int data[]=new int[n];
        int maxval=Integer.MIN_VALUE,v=1;
        for (int i=0;i<n;i++){
            data[i]=scn.nextInt();
        }
        for (int i=0;i<n;i++){
            v=data[i];
            for (int j=i+1;j<n;j++){
                v=v*data[j];
                if (v>maxval){
                    maxval=v;
                }
            }
        }
        System.out.println(maxval);
    }
}
