class PalindromeStr{
    static void checkPalin(String a){
        boolean ispalindrome =true;
        for (int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                ispalindrome = false;
                break;
            } 
    }
    if(ispalindrome)
        System.out.println("palindrome");
    else
        System.out.println("not palindrome");
    }
    public static void main(String[] args) {
        String a = "kanak";
        checkPalin(a);
    }
}