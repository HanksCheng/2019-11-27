import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int data[]=new int[n];
        for (int i=0;i<data.length;i++){
            data[i]=scn.nextInt();
        }
        bubble(data.length,data);
        for (int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
    public static void bubble(int n,int data[]){
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (data[i]>data[j]){
                    int tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
        }
    }
}