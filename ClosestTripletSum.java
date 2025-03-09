public class ClosestTripletSum {
    public static int closestTriplet(int[] arr, int target) {
        int n = arr.length;
        int closestSum = arr[0] + arr[1] + arr[2]; 

        // Brute force approach
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currentSum = arr[i] + arr[j] + arr[k];
                    if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                        closestSum = currentSum;
                    }
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int target = 5;
        int result = closestTriplet(arr, target);
        System.out.println("Closest triplet sum: " + result);
    }
}
