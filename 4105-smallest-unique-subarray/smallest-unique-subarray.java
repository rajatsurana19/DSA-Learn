
import java.util.*;

class Solution {
    private final long BASE = 19;
    private final long MOD = 1_000_000_007L;
    private long[] pow;
    private Map<Long, Integer> res = new HashMap<>();

    public int smallestUniqueSubarray(int[] nums) {
        int low = 1;
        int high = nums.length;
        int ans = nums.length;
        pow = new long[nums.length + 1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(mid, nums)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean check(int mid, int[] nums) {
        int n = nums.length;
        pow[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow[i] = (pow[i - 1] * BASE) % MOD;
        }
        long cur = 0;
        for (int i = 0; i < mid; i++) {
            cur = (cur * BASE + nums[i]) % MOD;
        }
        res.clear();
        res.put(cur, 1);
        for (int i = 1; i <= n - mid; i++) {
            cur = (cur - pow[mid - 1] * nums[i - 1]) % MOD;
            if (cur < 0) cur += MOD;
            cur = (cur * BASE + nums[i + mid - 1]) % MOD;
            res.merge(cur, 1, Integer::sum);
        }
        for (int count : res.values()) {
            if (count == 1) return true;
        }
        return false;
    }

    private long computeHash(int[] v, int i, int j, long base) {
        long p = 1;
        long ret = 0;
        for (int x = i; x <= j; x++) {
            ret = (ret + (v[x] * p) % MOD) % MOD;
            p = (p * base) % MOD;
        }
        return ret;
    }
}
