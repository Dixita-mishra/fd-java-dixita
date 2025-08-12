import java.util.Scanner;
public class UserInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("enter a number: ");
         int a=sc.nextInt();
         System.out.println(a);
         //sum of two numbers
         System.out.println("Now let's see the sum of two nums using scanner");
         System.out.println("enter the first number :");
         int num1=sc.nextInt();
         System.out.println("enter the second number :");
         int num2=sc.nextInt();
         int sum = num1+num2;
         System.out.println("Sum of numbers = "+sum);
      //for float values
      System.out.println("enter two float values:");
      float f= sc.nextFloat();
      float f1=sc.nextFloat();
      float sum1=f+f1;
      System.out.println(sum1);

    }
}