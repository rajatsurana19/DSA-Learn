class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
        while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
            int j = st.pop();
            answer[j] = i - j;
        }
        st.push(i);
}
    return answer;
    }
}