import java.util.Scanner;
public class Pattern_arrow {
    public static void main(String[] args) {
        //pattern printing
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern:");
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=0; i<n/2;++i){
            System.out.print("*");
            for(int j=0;j<n+2;++j){
                System.out.print(" ");
            }for(int k=0;k<i+1;++k){
                System.out.print("*");
            }
            System.out.println();
        //for middle portion
        }for(int i=0;i<n+3;++i){
            System.out.print("*");
        }for(int j=0;j<(n/2)+1;++j){
            System.out.print("*");
        }   System.out.println();
        //for lower portion     
        for(int i=n/2;i>0;--i){
            System.out.print("*");
            for(int j=0;j<n+2;++j){
                System.out.print(" ");
            }for(int k=0;k<i;++k){
                System.out.print("*");
            }
            System.out.println();
        }}}