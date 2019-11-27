import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        float data[]=new float[n],sum;
        for (int i=0;i<data.length;i++){
            data[i]=scn.nextFloat();
        }
        float l=scn.nextFloat();
        sum=0;
        for (int i=0;i<data.length;i++){
            if (data[i]>=l) {
                System.out.println(data[i]);
                sum += data[i];
            }
        }
        System.out.println(sum);
    }
}
