class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = highestInArray(piles);
        int ans = Integer.MAX_VALUE;

        while (low <= high){
            int mid = low + (high - low)/2;
            long hours = hoursTaken(piles,mid);
            if (hours <= h){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

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

    private static long hoursTaken(int[] arr, int num){
        long hours = 0;
        for (int i = 0; i < arr.length; i++) {
            hours += (int) Math.ceil((double) arr[i] /num);
        }
        return hours;
    }
}
