import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt(), n2=scn.nextInt();
        int data1[]=new int[n1], data2[]=new int[n2];

        for (int i=0;i<n1;i++){
            data1[i]=scn.nextInt();
        }
        for (int i=0;i<n2;i++){
            data2[i]=scn.nextInt();
        }

        cleansame(data1);

        int count=0;

        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                if(data1[i]==data2[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
    public static void cleansame(int data1[]){
        for (int i=0;i<data1.length;i++){
            for (int j=i+1;j<data1.length;j++) {
                if (data1[i]==data1[j]){
                    data1[j]=' ';
                }
            }
        }
    }
}
