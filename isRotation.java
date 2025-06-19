public class isRotation {
    
    public static void main(String[] args) {
        String s1 ="ABCD";
        String s2 ="CDAB";

       String s3 =s1+s1;

       if (s1.length() != s2.length()) {
            System.out.println("Not a rotation");
            return;
        }

       if(s3.contains(s2)){
        System.out.println("yes,rotation of string");
       }else{
        System.out.println("Not a rotation");
        }
    }
}

