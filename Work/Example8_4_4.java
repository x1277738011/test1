package Work;
import java.math.*;
public class Example8_4_4 {
    public static void main(String[] args) {

        double a,b;
        b=3;
        a=-1;
        System.out.println(Math.abs(a));//返回a的绝对值
        System.out.println(Math.max(a,b));//返回a，b的最大值
        System.out.println(Math.min(a,b));//返回a，b的最小值
        System.out.println(Math.random());//产生一个0~1随机数
        System.out.println(Math.pow(b,a));//返回b的a次幂
        System.out.println(Math.sqrt(a));//返回a的平方根
        System.out.println(Math.log(b));//返回b的对数
        System.out.println(Math.sin(a));//返回a的正弦值
        System.out.println(Math.asin(a));//返回a的反正弦值
        System.out.println(Math.ceil(b));//返回大于b的最小整数
        System.out.println(Math.floor(b));//返回小于b的最小整数
        System.out.println(Math.round(b));//四舍五入
    }
}
