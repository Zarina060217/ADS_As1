public class Task3 {
    public static boolean isprime(int n, int i){
        if(n<=2) return (n==2); //if number is less than 2, then nuber isn't prime(prime numbers begin from 2)
        if(n%i==0) return false; // if number is divisible to another num without remainder, it is not prime
        if(i*i>n) return false;//if didn't find divisor by the time you reach sqrt(n), then number is prime
        return isprime(n, i+1);
    }public static void main(String[] args){
        System.out.println(isprime(7,2)?"prime":"composite");
    }
}
