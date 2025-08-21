public class Bitwise {
    public static void main(String[] args) {
        // binary operators
        int a = 10;
        int b = 20;

        System.out.println("a&b = " + (a & b)); // bitwise AND
        System.out.println("a|b = " + (a | b)); // bitwise OR
        System.out.println("a^b = " + (a ^ b)); // bitwise XOR
        System.out.println("~a = " + (~a)); // bitwise NOT
        System.out.println("a<<2 = " + (a << 2)); // left shift
        System.out.println("a>>2 = " + (a >> 2)); // right shift
    }}