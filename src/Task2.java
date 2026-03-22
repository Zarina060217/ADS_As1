public class Task2 {
    public static int Sum(int[] l, int n){
        if(n==0) return 0;
        return l[n-1]+Sum(l, n-1);
    }public static void main(String[] args){
        int[] l={3,2,4,1};
        int summa=Sum(l, l.length);  //summing all elements
        System.out.println((double)summa / l.length);
    }
}
