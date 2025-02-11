public class SumOfArrayRecursion {

    public static int sumarr(int[] arr,int i)
    {
        if (i==arr.length) {
            return 0;
        }
        int result=arr[i]+sumarr(arr,i+1);
        return result;

    }
    public static void main(String[] args)
    {
        int[] arr={3,1,4,3};
        System.out.println(sumarr(arr,0));
    }
}