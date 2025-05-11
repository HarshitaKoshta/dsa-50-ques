class StrAnagrams{
    public static void main(String[] args) {
        String s1 = "silent";
        String s2   ="listen";
        int sum = 0;
        int s =0;

        char[] ch = s1.toCharArray();
        char[] c = s2.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            sum += (int) ch[i]; 
        }
         for (int i = 0; i < c.length; i++) {
            s += (int) ch[i]; 
        }
        if(s==sum){
        System.out.println("string anagram ");
        }else{
           System.out.println("string not anagram ");
        }
    }
}

