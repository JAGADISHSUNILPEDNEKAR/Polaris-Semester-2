public class PrintArrayUSingRecursion {
    public static void PrintArrayUSingRecursion(int arr[],int idx)
    {
        if(idx==arr.length){
        return;
    }
        System.out.println(arr[idx]);
        PrintArrayUSingRecursion(arr,idx+1);}    
        public static void main(String[] args) {
        int arr[]={1,3,4,9,7};
        PrintArrayUSingRecursion(arr,0);
    
}
}
// class Main {
//     public static void printArray(int[] arr, int idx) {
//         if (idx == arr.length) {
//             return;
//         }
//         System.out.println(arr[idx]);
//         printArray(arr, idx + 1);
//     }

//     public static void main(String[] args) {
//         int[] array = {1, 2, 3, 4, 5};
//         printArray(array, 0);
//     }
// }