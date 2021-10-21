package Work;

/**
 * @author 12777
 */
public class OutputN {
    public static void main(String[] args){
        int sum=0;
        for(int n=1;;n++){
            sum=sum+n;
            if(sum>8888){
                System.out.print("最大整数n="+(n-1));
                break;
            }
        }
    }
}
