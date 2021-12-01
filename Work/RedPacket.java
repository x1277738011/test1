package Work;
import java.util.*;


public class RedPacket {
    public static void main(String[] args) {
        int i=1;
        double sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入红包总金额：");
        double M= in.nextDouble();
        System.out.println("请输入红包个数：");
        int N= in.nextInt();
        while (N>1){
            double j=RedPacket.Red(M,N);
            System.out.printf("\n第%d个人抢到了%.2f",i,j);
            i++;
            N--;
            M=M-j;
            sum=sum+j;
        }
        System.out.printf("\n第%d个人抢到了%.2f\n",i,M);
        sum=sum+M;
        System.out.printf("共计%.2f",sum);
    }


    public static double Red(double M, int N) {
        Random random=new Random();
        return random.nextDouble()*(M/N*2)+0.01;
    }
}