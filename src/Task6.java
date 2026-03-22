public class Task6 {
    public static int pow(int i, int n){
        if(n==0) return 1;//every num with 0 power is equal to 1
        return i*pow(i, n-1);// i powered to n is i mutiplying to i n times
    }public static void main(String[] args){
        System.out.println(pow(2,10));
    }
}
