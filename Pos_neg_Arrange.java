class Pos_neg_Arrange{
    public static void main(String[] args) {
        int[] arr ={-2,7,9,-1,2,3,-5,4};

           for (int i = 0; i < arr.length; i++) {
               if(arr[i]<0){
                System.out.println(arr[i]);
               }
           }
           for (int i = 0; i < arr.length; i++) {
              if(arr[i]>=0){
                System.out.println(arr[i]);
              }               
           } 
    }
}