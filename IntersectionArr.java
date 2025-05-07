class IntersectionArr{
    static void intersection(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
          boolean found = true;
         for (int j = 0; j < b.length; j++) {
               if(a[i]==b[j]){
               found = false;
               }
              //  
          }
         if(!found){
          System.out.println(a[i]);
         }
            
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,8};
        int[] b = {3,4,5,1};
        intersection(a, b);
  }
}