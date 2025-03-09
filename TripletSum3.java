import java.util.HashSet;

public class TripletSum3 {
    public static boolean findTriplets(int[] arr, int target) {
        int n = arr.length;

        // Time complexity: O(n^2)
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currTarget = target - arr[i];

            for (int j = i + 1; j < n; j++) {
                if (set.contains(currTarget - arr[j])) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + (currTarget - arr[j]));
                    return true;
                }
                set.add(arr[j]);
            }
        }

        System.out.println("Triplet not found.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int target = 5;
        findTriplets(arr, target);
    }
}
