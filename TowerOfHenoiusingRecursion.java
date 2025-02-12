public class TowerOfHenoiusingRecursion {
   
    public static void TowerOfHenoiusingRecursion(int n,int t1,int t2,int t3){
        if(n==0){
            return;
    }
    TowerOfHenoiusingRecursion(n-1,t1,t3,t2);
    System.out.println(n+" "+t1+"->"+t2+" ");
    TowerOfHenoiusingRecursion(n-1,t3,t2,t1);
}
    public static void main(String[] args) {
        int n=3;
        TowerOfHenoiusingRecursion(n,10,20,30);
    }

}
