import java.util.Arrays;

public class TripletSum {
    public static void findTriplets(int[] arr, int target) {
        Arrays.sort(arr); 
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; 

            int left = i + 1, right = n - 1;

            //  Two-pointer approach
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Triplet: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    found = true;
                    
                    // Skip duplicate elements
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++; 
                } else {
                    right--; 
                }
            }
        }

        if (!found) {
            System.out.println("triplet not found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int target = 5;
        findTriplets(arr, target);
    }
}

