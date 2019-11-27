import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(),m=scn.nextInt(),count=0;
        int f[]=new int[n],g[]=new int[m];
        for (int i=0;i<f.length;i++){
            f[i]=scn.nextInt();
        }
        fun(f);
        for (int i=0;i<g.length;i++){
            g[i]=scn.nextInt();
        }
        for (int i=0;i<f.length;i++){
            for (int j=0;j<g.length;j++){
                if (f[i]==g[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    public static  void fun(int f[]){
        for (int i=0;i<f.length;i++){
            for (int j=i+1;j<f.length;j++){
                if (f[i]==f[j]) {
                    f[j]=' ';
                }
            }
        }
    }
}
