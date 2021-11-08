package Work;

/**
 * @author 12777
 */
public class GreekLetters {
    public static void main(String[] args){
        System.out.println("希腊字母");
        System.out.print("大写：");
        for(int i=913;i<=937;i++){
            if(i==930){
                continue;
            }
            System.out.print(" "+(char)i);
        }
        System.out.print("\n小写：");
        for(int j=945;j<=969;j++){
            if(j==962){
                continue;
            }
            System.out.print(" "+(char)j);
        }
    }
}
