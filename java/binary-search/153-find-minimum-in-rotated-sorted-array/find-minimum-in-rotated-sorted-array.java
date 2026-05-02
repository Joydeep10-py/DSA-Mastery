class Solution {
    public int findMin(int[] nums) {
        int n = 0;
        int j = 0;
        for (int i = j+1; i < nums.length; i++) {
            if (nums[j] > nums[i]){
                n = i;
                break;
            }
            j++;
        }
        return nums[n];
    }
}
