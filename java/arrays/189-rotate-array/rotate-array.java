class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0){
            System.out.println(Arrays.toString(nums));
            return;
        }
        reverseArr(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
        reverseArr(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        reverseArr(nums,k,n-1);
        System.out.println(Arrays.toString(nums));
    }

    private void reverseArr(int[] arr, int s, int n){
        while (s < n){
            int temp = arr[s];
            arr[s] = arr[n];
            arr[n] = temp;
            s = s + 1;
            n = n - 1;
        }
    }
}
