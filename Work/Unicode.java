package Work;
import java.util.Scanner;
/**
 * @author 12777
 */
public class Unicode {
    public static void main(String[] args){
        while(true) {
            Scanner in = new Scanner(System.in);
            /*先读取String，再转化为char*/
            System.out.println("请输入一个汉字：");
            String x = in.next();
            char y = x.charAt(0);
            System.out.println("该字的位置为："+(int) y);
        }
    }

}
