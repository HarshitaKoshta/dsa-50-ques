public class validPalinrome {
    
    public static void main(String[] args) {
        String s = "abca";
         if (isValidPalindrome(s)) {
            System.out.println("Valid palindrome after removing at most one character.");
        } else {
            System.out.println("Not a valid palindrome even after one removal.");
        }
    }

    public static boolean isValidPalindrome(String s) {
        int lt=0;
        int rt=s.length()-1;
        while(lt<rt){
            if(s.charAt(lt)==s.charAt(rt)){
                lt++;
                rt--;
            }
            else{
                int l1 = lt+1, r1=rt;
                int l2 = lt,r2=rt-1;
                boolean firstTry = true, secondTry = true;
                   
                while(l1<r1){
                    if(s.charAt(l1)!=s.charAt(r1)){
                        firstTry=false;
                        break;
                   }
                   l1++;r1--;
                }
                while(l2<r2){
                    if(s.charAt(l2)!=s.charAt(r2)){
                        secondTry=false;
                        break;
                    }
                   l2++;r2--;
                } 
                return firstTry || secondTry;                 
            }
        }
       
        return true;
    }
}

