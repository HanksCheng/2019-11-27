import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
	    int data[][]=new int[5][7];
	    for (int i=0;i<5;i++){
	        for (int j=0;j<7;j++) {
                data[i][j]=scn.nextInt();
            }
        }
        for (int i=0;i<7;i++){
            for (int j=0;j<5;j++) {
                System.out.print(data[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
