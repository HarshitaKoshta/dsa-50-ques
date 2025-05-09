class ReverseString{
    
    static void ReverseStr(String a){
      String rev = " ";
          for(int i=a.length()-1;i>=0;i--){
            rev += a.charAt(i);
          }
          System.out.println(rev);
      }    
    public static void main(String[] args) {
      String a = "hellooo";
      ReverseStr(a);
        }
    
}