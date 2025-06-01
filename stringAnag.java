public class stringAnag {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "ileln";
          if (s1.length() != s2.length()) {
            System.out.println("not anagram");
            return;
          }
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                System.out.println("String is not anagram");
                return;
            }
           }  
        System.out.println("String is anagram");
    }
}
