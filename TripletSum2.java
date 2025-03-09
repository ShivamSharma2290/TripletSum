public class TripletSum2 {
    public static boolean findTriplets(int[] arr, int target) {
        int n = arr.length; 

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) { 
                    int sum = arr[i] + arr[j] + arr[k]; 
                    
                    if (sum == target) {
                        System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return true; 
                    }
                }
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