//as it is 
//reverse 
public class ArrayElementsInBothDirectionRecursion {
    public void reverse (int[] arr,int i){
        if(i>=arr.length/2){
            return ;
        }
        reverse(arr, i+1);
        System.out.println(arr[i]);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        // System.out.println(arr(arr, 0));
    }
}
// public class ArrayElementsInBothDirectionRecursion {
//     public static int Arr(int[] arr,int i){
//         if(i==arr.length/2){
//             return 0;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5};
//         System.out.println(arr(arr, 0));
//     }
// }
