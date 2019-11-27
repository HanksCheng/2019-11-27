import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        long seed = scn.nextLong();
        int data[]=new int[6];
        Random rnd=new Random();
        rnd.setSeed(seed);
        int n=0;
        boolean flag=true;

        while (n<6){
            data[n]=rnd.nextInt(42)+1;
            flag=true;
            for(int i=0;i<n;i++){
                if(data[n]==data[i]){
                    flag=false;
                }
            }
            if (flag==true){
                n++;
            }
        }
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        }
        System.out.println();
    }

}