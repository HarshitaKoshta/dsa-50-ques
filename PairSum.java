

class PairSum{
    static void pair(int[] a,int target){
        System.out.println("Pair Sum:");
     for(int i =0;i<a.length;i++){
        for (int j = i+1; j < a.length; j++) {
           if(a[i]+a[j]==target){
            System.out.println(a[i]+" "+a[j]);
           }
        }
     }
    }
    public static void main(String[] args) {
        int[] a ={1,2,4,5,3,6};
        int target = 7;
        pair(a, target);
    }
}