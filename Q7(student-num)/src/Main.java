import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        long data[]=new long[n];

        for (int i=0;i<n;i++){
            data[i]=scn.nextLong();
        }

        bubble(n,data);
        for (int i=0;i<n;i++){
            System.out.println(data[i]+" ");
        }
    }
    public static void bubble(int n,long data[]){
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(data[i]>data[j]){
                    long tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
        }
    }

}
