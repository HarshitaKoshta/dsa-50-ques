class MissingNumInArr{
    static void missing(int[] a){
       
        int n= a.length+1;
       int suma=0;
       int sum = (n*(n+1))/2;
       // System.out.println("sum"+sum);
       for (int i = 0; i < a.length; i++) {
           suma += a[i];
       }
      // System.out.println(suma);
       int missing = sum - suma;
       System.out.println("missing number :"+missing);
}
    public static void main(String[] args) {
         int[] a ={1,2,4,5,6,7};
         missing(a);
    }
}