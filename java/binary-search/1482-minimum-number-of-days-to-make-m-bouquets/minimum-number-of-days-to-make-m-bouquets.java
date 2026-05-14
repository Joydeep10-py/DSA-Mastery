class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long num = (long) m * k;
        if (num > bloomDay.length){
            return -1;
        }

        int low = 1;
        int high = highestInArray(bloomDay);

        while (low <= high){
            int mid = low + (high - low)/2;
            int bou = bouquets(bloomDay, k, mid);
            if (bou >= m){
               high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int bouquets(int[] arr, int k, int num){
        int c = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num){
                c++;
            } else {
                n += c/k;
                c = 0;
            }
        }
        n += c/k;
        return n;
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
