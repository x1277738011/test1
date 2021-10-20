import java.util.Scanner;
/**
 * @author 12777
 */
public class Test6 {
    public static void main(String[] args){
        int x;
        Scanner in=new Scanner(System.in);
        System.out.print("请输入学生成绩：");
        x=in.nextInt();
        new Estate(x);
    }
}
class Estate{
    public Estate(int x) {
        if (x >= 90) {
            System.out.println("A");
        } else if (x >= 60) {
            System.out.println("b");
        } else {System.out.println("C");
        }
    }
}
