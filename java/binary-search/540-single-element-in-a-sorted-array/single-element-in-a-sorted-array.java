class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        if (nums.length == 1){
            return nums[0];
        }
        
        if (nums[1] != nums[0]){
            return nums[0];
        }
        
        if (nums[high] != nums[high-1]){
            return nums[high];
        }

        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid + 1] !=  nums[mid] && nums[mid-1] != nums[mid]){
                return nums[mid];
            } else if ((mid % 2 != 0 && nums[mid-1] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
