package Work;
import java.util.Scanner;
public class Example8_4_5 {
    public static void main(String[] args) {
        String str;
        System.out.println("请输入要转换的字符：");
        Scanner in=new Scanner(System.in);
        str=in.next();
        String a="";
        for(int i=0;i<str.length();i++){
            if((int)'0'<=(int)str.charAt(i)&&(int)'9'>=(int)str.charAt(i)){
                a+=str.charAt(i);
            }
        }
        System.out.println(a);
    }
}
