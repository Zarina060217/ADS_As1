public class Task4 {
    public static int factorial(int n){
        if(n<=1) return 1;//cases for factorial is 1! or 0! both get 1
        return n*factorial(n-1);// fact=n*(n-1)!
    }public static void main(String[] args){
        System.out.println(factorial(5));
    }
}
