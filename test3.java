public class test3 {
    public static void main(String[] args){
        int j;
        for (int i=200;i>100;i--){
            for(j=2;j<i;j++){
                if(i%j==0)break;
            }
            if(i==j)System.out.println(i);
        }
    }
}
