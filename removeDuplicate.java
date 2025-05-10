class removeDuplicate{
    static void remove(String a){
           String s =" ";
        for (int i = 0; i < a.length(); i++) {
             boolean isFound = false;
           for (int j = 0; j<i; j++) {
               if(a.charAt(i)==a.charAt(j)){
                 isFound = true;
                 break;
               }
           } 
       if(!isFound){
           s +=a.charAt(i);
        }      
    }
      System.out.println(s);
    }
    public static void main(String[] args) {
        String a = "harshita";
        remove(a);
    }
}