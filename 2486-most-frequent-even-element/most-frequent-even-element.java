class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int num:nums){
            if(num%2==0){
               if(m.containsKey(num)){
                m.put(num,m.get(num)+1);
               }
               else{
                m.put(num,1);
               }
            }
        }
        int ans = -1;
        int mF = 0;

        for(int num : m.keySet()){
            int fre = m.get(num);
            if(fre>mF){
                mF=fre;
                ans = num;
            }
            else if(fre == mF && num<ans){
                ans = num;
            }
        }
        return ans;
    }
}