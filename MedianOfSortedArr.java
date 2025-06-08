import java.util.Arrays;

public class MedianOfSortedArr {
    public static void main(String[] args) {
        int[] a1 = {1, 7, 2, 5};
        int[] a2 = {3, 4, 6};

        Arrays.sort(a1);
        Arrays.sort(a2);
        int[] ans = merge(a1, a2);
        System.out.println("Merged Array: " + Arrays.toString(ans));

        if (ans.length % 2 == 0){
        double ans2 = (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2.0;
            System.out.println("Median: " + ans2);
        } else {
            System.out.println("Median: " + (double) ans[ans.length / 2]);
        }
    }
    public static int[] merge(int[] a1, int[] a2){
        int[] ans = new int[a1.length + a2.length];
        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < a1.length || p2 < a2.length){
            int val1 = p1 < a1.length ? a1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < a2.length ? a2[p2] : Integer.MAX_VALUE;

            if (val1 < val2){
                ans[p3++] = val1;
                p1++;
            } else {
                ans[p3++] = val2;
                p2++;
            }
        }
        return ans;
    }
}
