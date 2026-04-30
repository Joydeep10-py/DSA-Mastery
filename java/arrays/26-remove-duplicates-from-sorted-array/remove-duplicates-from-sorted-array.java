class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            hash.add(i);
        }

        int k = hash.size();
        List<Integer> list = new ArrayList<>(hash);
        return k; 
    }
}
