public class Task1 {
    public static void printdgt(int n){
        if(n==0) return;
        printdgt(n/10);
        System.out.println(n%10);
    }
    public static void main(String[] args){
        printdgt(5481);
    }
}
