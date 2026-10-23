class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] ps = new int[n + 1];

        for (int i = 0; i < n; i++) {
            ps[i + 1] = ps[i] + nums[i];
        }

        int cnt = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i <= n; i++) {
            if (mp.containsKey(ps[i] - k)) {
            cnt += mp.get(ps[i] - k);
        }
        mp.put(ps[i], mp.getOrDefault(ps[i], 0) + 1);
    }

    return cnt;


    }
}