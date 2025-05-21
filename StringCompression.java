class StringCompression {
    static void compression(String str) {
        int i = 0;
        while(i<str.length()){
            char currChar = str.charAt(i);
            int count=1;
            while(i+1<str.length()&&currChar==str.charAt(i+1)){
                  count++;
                  i++;
            }
             System.out.print(currChar+""+count);
            i++;
        }
    }
    public static void main(String[] args) {
        String str = "aabccca";
        compression(str); 
    }
}
