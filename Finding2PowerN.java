public class Finding2PowerN {
    public static double pow(int n){
        double ans=1;
        double base=2;
        while(n>0){
            if(n%2==1){
                ans*=base; 
            }
            base*=base;
            n/=2;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(pow(3));
    }
}
