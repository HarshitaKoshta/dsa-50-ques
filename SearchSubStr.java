public class SearchSubStr {
    public static void main(String[] args) {
        String s = "hello";
        String sub  = "llo";

        int n = s.length(),m=sub.length();

        for(int i = 0;i<=n-m;i++){
            if(s.substring(i,i+m).equals(sub)){
            System.out.println(i);
            break;
            }
        }
    }
}
