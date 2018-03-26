public class Separator {
    public static void main(String[] args){
        String s="zhangsan,18,192.168.36.22,8.8.8.8";
        String[] m=s.split(",");
        for(String i:m){
            System.out.println(i);
        }
    }
}
