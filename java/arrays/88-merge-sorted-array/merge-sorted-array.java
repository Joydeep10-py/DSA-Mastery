class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length - 1;
        if (m == 0){
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
        }
        if (n == 0){
            return;
        }

        for (int i = 0; i < n; i++) {
            nums1[l - i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
