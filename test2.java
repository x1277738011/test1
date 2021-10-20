import java.util.Scanner;
/**
 * @author 12777
*/
public class test2 {
    public static void main(String[] args){
        int a=1;//单数月出生的兔子
        int b=0;//双数月出生的兔子
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月数:");
        int k=sc.nextInt();//月数
        for(int i=1;i<=k;i++){
            System.out.println("第"+i+"个月有"+a+"对兔子");
            b+=a;//b=单数月的兔子
            i++;
            System.out.println("第"+i+"个月有"+b+"对兔子");
            a+=b;//a=双数月的兔子
        }
    }
}
