//here we have to first take a number then convert it into string then execute

import java.util.Scanner;

public class QNSumOfDIgitsRecursion{
public static int sumofdigits(String n)
{
    if(n.equals(""))
    return 0;
    
int result=Character.getNumericValue(n.charAt(0)+sumofdigits(n.substring(1)));
return result;
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(sumofdigits(Integer.toString(n)));
 }   
}
