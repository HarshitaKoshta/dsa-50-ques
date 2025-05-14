public class ReverseArray{
    
   static void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left<right) {    
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
     static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
       }
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        reverseInPlace(myArray);
        System.out.print("After reversing:");
        printArray(myArray);
    }
}
