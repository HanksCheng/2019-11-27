import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int data[]=new int[b],tmp;
        for (int i=0;i<data.length;i++){
            data[i]=scn.nextInt();
        }
        for (int i=0;i<data.length;i++){
            for (int j=i+1;j<b;j++){
                if (data[i]>data[j]){
                    tmp=data[j];
                    data[j]=data[i];
                    data[i]=tmp;
                }
            }
        }
        for (int k=0;k<data.length;k++){
            System.out.println(data[k]);
        }
    }
}
