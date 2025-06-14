public class PermutationStr {
   
    public static void main(String[] args) {
        String str = "ABCD";
        permute(str.toCharArray(), 0);
    }

    static void permute(char[] chars, int start) {
        if (start == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }

        for (int i = start; i < chars.length; i++) {
            swap(chars, start, i);
            permute(chars, start + 1); 
            swap(chars, start, i); 
        }
    }

    static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
} 
