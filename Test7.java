import java.util.Scanner;
/**
 * @author 12777
 */
public class Test7 {
    public static void main(String[] args){
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.print("请输入两整数：");
        x= in.nextInt();
        y= in.nextInt();
        new Request(x,y);
    }
}
class Request{
    public Request(int x,int y){
        int i = Math.max(x, y);
        while (true){
            if (i%x==0&&i%y==0){
                System.out.println(x+"和"+y+"的最小公倍数为："+i);
                break;
            }
            i++;
        }
        i = Math.min(x, y);
        while (true){
            if (x%i==0&&y%i==0){
                System.out.println(x+"和"+y+"的最大公约数为"+i);
                break;
            }
            i--;
        }
    }
}