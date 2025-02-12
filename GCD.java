public class GCD {
    public static int GCD(int a,int b){
        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }public static void main(String[] args) {
        System.out.println(GCD(72,9));
    }

}
