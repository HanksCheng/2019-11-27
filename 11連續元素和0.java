import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(),v=0;
        String str="";
        int data[]=new int[n];
        for (int i=0;i<n;i++){
            data[i]=scn.nextInt();
        }
        for (int i=0;i<n;i++){
            v=data[i];
            str=Integer.toString(data[i])+" ";
            for (int j=i+1;j<n;j++){
                v=v+data[j];
                str=str+Integer.toString(data[j])+" ";
                if (v==0){
                    System.out.println(str);
                }
            }
        }
    }
}
