import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String arr[]=scn.nextLine().split(" ");
        int data[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            data[i]=Integer.parseInt(arr[i]);
        }
        bubble(data);
    }
    public static void bubble(int data[]){
        for (int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if (data[i]>data[j]){
                    int tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
        }
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
