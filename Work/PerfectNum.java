package Work;

/**
 * @author 12777
 */
public class PerfectNum {
    public static void main(String[] args){
        System.out.println("1000以内的完数有:");
        for(int i=1000;i>1;i--){
            int sum=0;
            for(int j=i-1;j>=1;j--){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
