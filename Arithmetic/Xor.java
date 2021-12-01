package Arithmetic;
/**
 * @author 12777
 */
// a和b在内存里
public class Xor {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        a=a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b=a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a=a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //数组异或；偶次项异或完为零，奇次项异或完为结果;~取反二进置
        int[] c={5,5,5,5,2,3,2,3,3};
        int eor=0;
        for(int i=0;i<9;i++){
            eor=eor^c[i];
        }
        System.out.println(eor);
    }
}
