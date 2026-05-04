class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        if (nums.length == 1){
            return 0;
        }

        if (nums.length == 2){
            if (nums[0] > nums[1]){
                return 0;
            } else {
                return 1;
            }
        }

        while (low < high){
            int mid = low + (high - low)/2;
            if (nums[mid] < nums[mid+1]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
