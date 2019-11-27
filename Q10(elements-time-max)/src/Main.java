import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int data[]=new int[n];
        for (int i=0;i<n;i++){
            data[i]=scn.nextInt();
        }
        findmax(data);
    }
    public static void findmax(int data[]){
        int max=Integer.MIN_VALUE;
        int sum=1;
        for (int i=0;i<data.length;i++){
            sum=data[i];
            for (int j=i+1;j<data.length;j++){
                sum=sum*data[j];
                if (sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
