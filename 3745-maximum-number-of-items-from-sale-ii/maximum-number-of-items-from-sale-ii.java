class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int minPrice = Integer.MAX_VALUE;
        int[] freq = new int[n + 1];
        for (int[] item : items) {
          freq[item[0]]++;
         minPrice = Math.min(minPrice, item[1]);
        }
        int[] gain = new int[n + 1];
        for (int f = 1; f <= n; f++) {
            int count = 0;
            for (int j = f; j <= n; j += f) {
                count += freq[j];
            }
            gain[f] = count - 1;
        }
       int[][] sorted = items.clone();

        Arrays.sort(sorted, (a, b) ->
            Integer.compare(a[1], b[1])
        );
        long remaining = budget;
        long ans = 0;

        for (int[] item : sorted) {
            int factor = item[0];
            int price = item[1];
            if (price >= 2L * minPrice) {
                break;
            }
            int g = gain[factor];

            if (g == 0) {
                continue;
            }
        long canBuy = Math.min((long) g,remaining / price);
            ans += 2L * canBuy;
            remaining -= canBuy * price;
            if (canBuy < g) {
                break;
            }
        }
        ans += remaining / minPrice;
        return (int) ans;
    }
}
