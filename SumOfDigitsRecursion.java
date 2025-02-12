import java.util.Scanner;
public class SumOfDigitsRecursion {
    public static int sumofdigits(int n){
        if (n==0) {
            return 0;
        }
            int result=n%10+ sumofdigits(n/10);
            return result;
        
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(sumofdigits(n));
   } 
}
