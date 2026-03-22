public class Task10 {
    public static int gcd(int x, int y){
        if(y==0) return x;// math: gcd(x,0)=x
        return gcd(y,x%y);//gcd of 2 nums also divides their remainder
    }public static void main(String[] args){
        System.out.println(gcd(32,48));
    }
}
