class Solution {
    public int search(int[] nums, int target) {
        int j = 0;
        int n = 0;
        for (int i = j+1; i < nums.length; i++) {
            if (nums[j] > nums[i]){
                n = i;
                break;
            }
            j++;
        }
        if (BinarySearchRotated(nums,target,0,n-1) == -1){
            return BinarySearchRotated(nums, target, n, nums.length - 1);
        } else {
            return BinarySearchRotated(nums,target,0,n-1);
        }
    }

    private static int BinarySearchRotated(int[] nums, int target, int low, int high){
        while (low <= high){
            int mid = low + (high -low)/2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
