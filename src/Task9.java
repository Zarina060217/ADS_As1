public class Task9 {
    public static int countch(String str){
        if(str.isEmpty()) return 0;
        return 1+countch(str.substring(1));
    }public static void main(String[] args){
        System.out.println(countch("hello"));
    }
}
