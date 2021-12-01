package Work;
import java.util.*;
public class Example8_4_6 {
    public static void main(String[] args) {
        String str="数学87分，物理76分，英语96分";
        String regex="[^0123456789.]+";
        str=str.replaceAll(regex," ");
        StringTokenizer fenxi=new StringTokenizer(str," ");
        int amount= fenxi.countTokens();
        int sum=0;
        while (fenxi.hasMoreTokens()){
            String i=fenxi.nextToken();
            int score= Integer.parseInt(i);
            sum=sum+score;
        }
        System.out.println("总成绩为"+sum);
        int average=sum/amount;
        System.out.println("平均成绩为:"+average);
    }
}
