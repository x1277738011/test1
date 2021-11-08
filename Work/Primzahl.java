package Work;

/**
 * @author 12777
 */
public class Primzahl {
    public static void main(String[] args){
        System.out.println("100以内的素数有:");
        for(int i=100;i>1;i--) {
            for (int j = i - 1; j >= 1; j--) {
                if(j == 1) {
                    System.out.print(" "+i);
                }
                if(i%j==0){
                    break;
                }
            }
        }
    }
}
