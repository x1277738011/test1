package Arithmetic;
/**
 * @author 12777
 */
// 异或，if(a>b) a^b=a-b;else a^b=a+b
public class Xor {
    public static void main(String[] args) {
        int a=10;
        int b=21;
        a=a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b=a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a=a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
