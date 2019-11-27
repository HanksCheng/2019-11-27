import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int data[]=new int[n];
        for (int i=0;i<n;i++){
            data[i]=scn.nextInt();
        }
        sum0(data);
    }
    public static void sum0(int data[]){
        int val=0;
        String str="";
        for (int i=0;i<data.length;i++){

            val=data[i];
            str=Integer.toString(data[i])+" ";

            for (int j=i+1;j<data.length;j++){

                val=val+data[j];
                str=str+Integer.toString(data[j])+" ";

                if (val==0){
                    System.out.println(str);
                }
            }
        }
    }
}
