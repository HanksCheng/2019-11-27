import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String strdata[]=scn.nextLine().split(" ");
        int data[]=new int[strdata.length];
        for (int i=0;i<strdata.length;i++){
            data[i]=Integer.parseInt(strdata[i]);
        }
        bubble(data,data.length);
        for (int i=0;i<strdata.length;i++){
            System.out.print(data[i]+"\t");
        }
        System.out.println();
    }
    public static void bubble(int data[],int n){
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
