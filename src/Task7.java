public class Task7 {
    public static void reverse(int n, int[] l){
        if(n==0) return;
        System.out.print(l[n-1]+" ");//printing last element
        reverse(n-1, l);//recursive call for other elements
    }public static void main(String[] args){
        int[] l={1,4,6,2};
        reverse(l.length,l);
    }
}
