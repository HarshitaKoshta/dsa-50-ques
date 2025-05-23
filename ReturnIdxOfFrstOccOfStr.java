class ReturnIdxOfFrstOccOfStr {
    public static int string(String find, String give) {
        int a = give.length();
        if(a==0) return -1;

        for(int i=0;i<=find.length()-a;i++){
            if(find.substring(i,i+a).equals(give)){
              System.out.println(i);
            }
        }return -1;
}
public static void main(String[] args) {
    String find = "flower";
    String give = "low";
    string(find,give);
}
}
    