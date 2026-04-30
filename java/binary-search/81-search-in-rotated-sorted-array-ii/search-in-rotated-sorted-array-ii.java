class Solution {
    public boolean search(int[] nums, int target) {
        int j = 0;
        for (int i = j+1; i < nums.length; i++) {
            if (nums[j] > nums[i]){
                j = i;
                break;
            }
            j++;
        }

        int ans1 = BinarySearchRotated(nums, target, 0, j-1);
        int ans2 = BinarySearchRotated(nums, target, j+0, nums.length - 1);

        if (ans1 == -1 && ans2 == -1){
            return false;
        }
        return true;
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
