
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[][]=new int[n][n];
        int x=0,i=1,j=1,k=i,p=j;
        data[0][0]=1;
        while (x<=n*n){
            data[i][j]=x;
            if (i-1>=0){
                if (j+1==n) {
                    i = n - 1;
                    j = p;
                    p++;
                }else{
                    i--;
                    j++;
                }
            }else{
                if (j+1==n){
                    i=n-1;
                    j=p;
                    p++;
                }else{
                    i=k;
                    j=0;
                    k++;
                }
            }
            x++;
        }
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
    }
}