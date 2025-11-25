import java.util.Scanner;
class VarKey{
    public static void main(String[] args) {
        var number = 10; 
        var text = "Hello, World!";
        var decimal = 3.14;
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
        System.out.println("Decimal: " + decimal);
        //new way to take input from user
        System.out.println(new Scanner(System.in).nextInt());
}}