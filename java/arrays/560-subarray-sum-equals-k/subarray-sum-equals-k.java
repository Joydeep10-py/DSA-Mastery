class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0,1);
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (hash.containsKey(prefixSum - k)){
                c += hash.get(prefixSum - k);
            }

            if (hash.containsKey(prefixSum)){
                hash.put(prefixSum, hash.get(prefixSum) + 1);
            } else {
                hash.put(prefixSum, 1);
            }
        }
        return c;
    }
}
