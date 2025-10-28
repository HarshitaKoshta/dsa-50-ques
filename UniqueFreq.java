
import java.util.HashMap;

public class UniqueFreq {
    public static void main(String[] args) {
      int[] arr = {8,9,8,3,8,9};
      HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.print("Unique elements: ");
        for (int num : arr) {
            if (freq.get(num) == 1) {
                System.out.print(num + " ");
            }
        }

    }
}
