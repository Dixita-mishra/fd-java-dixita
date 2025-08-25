import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        // reverse of a number
        Scanner sc = new Scanner(System.in);
        int num, reverse = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int check=num;
        while(num!=0){
            reverse=reverse*10+ num % 10;
            num/=10;
        }
        System.out.println("Reverse of the number is: " + reverse);
        //check pallindrome
        if(check==reverse){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        
    }}