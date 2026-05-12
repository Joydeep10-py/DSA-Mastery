class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = highestInArray(nums);
        int ans = high;

        while (low < high){
            int mid = low + (high - low)/2;
            int s = sumDiv(nums, mid);
            if (s <= threshold){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int sumDiv(int[] arr, int num){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.ceil((double) arr[i] / num);
        }
        return sum;
    }

    private static int highestInArray(int[] piles){
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max){
                max = piles[i];
            }
        }
        return max;
    }
}
