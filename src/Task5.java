public class Task5 {
    public static int fibb(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibb(n-1)+fibb(n-2);//n is equal to sum of two preceding nums
    }public static void main(String[] args){
        System.out.println(fibb(5));
    }
}
