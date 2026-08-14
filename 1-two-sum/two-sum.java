class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int re = target - nums[i];
            if(map.containsKey(re)){
                int k = map.get(re);
                return new int[] {i,k};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}