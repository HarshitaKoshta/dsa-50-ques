class KthMaxMin{
    static void MaxMin(int[] arr,int Kmax,int Kmin ){
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
        Kmax = arr[arr.length-Kmax];
        Kmin = arr[Kmin-1];
        System.out.println("max:"+Kmax+" "+"min:"+Kmin);
    }
    public static void main(String[] args) {
        int[] arr = {1,43,64,7,15,9};
        MaxMin(arr,3,3);
    }
}