public class test4 {
    public static void main(String[] args){
        int i,j,k;//水仙花数的百位数，十位数，个位数
        for(int s=100;s<1000;s++){
            i=s/100;
            j=s%100/10;
            k=s%100%10;
            if(i*i*i+j*j*j+k*k*k==s)System.out.println(s);
        }
    }
}
