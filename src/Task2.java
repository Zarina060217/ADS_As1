public class Task2 {
    public static int sum(int[] l, int n){
        if(n==0) return 0;
        return l[n-1]+sum(l, n-1);
    }public static void main(String[] args){
        int[] l={3,2,4,1};
        int summa=sum(l, l.length);  //summing all elements
        System.out.println((double)summa / l.length);
    }
}
