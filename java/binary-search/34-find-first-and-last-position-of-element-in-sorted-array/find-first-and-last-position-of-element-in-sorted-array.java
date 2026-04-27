class Solution {
    public int[] searchRange(int[] nums, int target) {
      int[] arr = {-1,-1};

        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] > target){
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                arr[0] = lower(nums, target);
                if (upper(nums, target) == -1){
                    arr[1] = nums.length - 1;
                } else {
                    arr[1] = upper(nums, target) - 1;
                }
                return arr;
            }
        }
        return arr;
    }

    private static int lower(int[] arr, int target){
        int n = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] >= target){
                n = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return n;
    }

    private static int upper(int[] arr, int target){
        int n = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] > target){
                n = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return n;
    }
}
