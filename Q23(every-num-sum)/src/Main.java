import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int data[]=new int[n];
        int sum[]=new int[n];
        int tmp;
        for (int i=0;i<n;i++){
            data[i]=scn.nextInt();
        }

        for (int i=0;i<n;i++){
            tmp=data[i];
            while (tmp!=0){
               sum[i]+=tmp%10;
               tmp=tmp/10;
            }
        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (sum[i]>sum[j]){
                    tmp=sum[i];
                    sum[i]=sum[j];
                    sum[j]=tmp;
                    tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(data[i]+"\t");
        }
    }
}
