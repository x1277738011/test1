import java.util.Scanner;
public class test5 {
    public static void main(String[] args){
        int x;
        Scanner in=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        x=in.nextInt();
        new PrimeSplit(x);
    }
}
class  PrimeSplit{
    int k=2;
    public PrimeSplit(int x){
        if(x<=1){
            System.out.println(x+"是无效的被分解数");
        }
        else if (x==2){
            System.out.println(x+"分解后的质因数为：1*"+x);
        }
        else {
            System.out.print(x+"分解后的质因数为：1");
            while (k<=x) {
                if (x % k == 0) {
                    System.out.print("*" + k);
                    x = x / k;
                }
                else {
                    k++;
                }
            }
        }
    }
}
