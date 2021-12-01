package Work;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class Example8_4_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入日期：");
        LocalDate i= LocalDate.of(in.nextInt(), in.nextInt(),in.nextInt());
        System.out.println("请输入日期：");
        LocalDate j= LocalDate.of(in.nextInt(), in.nextInt(),in.nextInt());
        long days=i.until(j, ChronoUnit.DAYS);
        System.out.println("两个日期相距"+days+"天");
    }
}
