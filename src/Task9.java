public class Task9 {
    public static int countc(String str){
        if(str.isEmpty()) return 0;
        return 1+countc(str.substring(1));
    }public static void main(String[] args){
        System.out.println(countc("hello"));
    }
}
