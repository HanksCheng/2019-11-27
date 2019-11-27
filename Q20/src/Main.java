import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int lgth=str.length();
        int hlfl=lgth/2;
        boolean b1=true;
        for (int i=0;i<hlfl;i++){
            char a=str.charAt(i), b=str.charAt(lgth-1-i);
            if(a!=b){
                b1=false;
                break;
            }
        }
        System.out.println(b1? "YES":"NO");
    }
}
