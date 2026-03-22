public class Task8 {
    public static boolean isdgt(String s){
        if(s.isEmpty()) return true;
        if(!Character.isDigit(s.charAt(0))) return false;//checking for 1st element
        return isdgt(s.substring(1));//check everything except 1st element
    }public static void main(String[] args){
        System.out.println(isdgt("123456")?"yes":"no");
    }
}
