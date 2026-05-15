class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = highestInArray(weights);
        int high = sumationArray(weights);

        while (low <= high){
            int mid = low + (high - low)/2;
            int noDay = checkWeights(weights, mid);
            if (noDay <= days){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static int sumationArray(int[] weights){
        int sum = 0;
        for(int i : weights){
            sum += i;
        }
        return sum;
    }

    private static int checkWeights(int[] arr, int cap){
        int day = 0;
        int load = 0;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > cap){
                day += 1;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return day+1;
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
