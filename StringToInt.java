class StringToInt{
    public static void main(String[] args) {
        String s = "abc";
        int c=0;
        for (int idx = 0; idx < s.length(); idx++) {
           c +=(int)s.charAt(idx);
        }
        System.out.println("ASCII value of the string"+c);
    }
}