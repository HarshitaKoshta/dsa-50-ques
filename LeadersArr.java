
import java.util.Scanner;

class LeadersArr{
    static void leaders(int[] a){
        int n = a.length;
     int maxEle =a[n-1];
     System.out.println("leaders in an array:");
     System.out.print(maxEle+" ");

     for(int i = n-2; i>=0; i--){
        if(a[i]>maxEle){
            maxEle = a[i];
            System.out.print(maxEle+" ");
        }
     }
    } 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        leaders(a);
    }    
}