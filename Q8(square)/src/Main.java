import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String arr[]=scn.nextLine().split(" ");
        int data[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            data[i]=Integer.parseInt(arr[i]);
        }
        square(data);
    }
    public static void square(int data[]){
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]*data[i]+"\t");
        }
    }

}
