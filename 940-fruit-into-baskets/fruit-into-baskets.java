class Solution {
    public int totalFruit(int[] fruits) {
        int s = 0;
        int e = 0;
        int ml = 0;
        int n = fruits.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(e<n){
            map.put(fruits[e],map.getOrDefault(fruits[e],0)+1);

            while(map.size()>=3){
                map.put(fruits[s],map.get(fruits[s])-1);
                if(map.get(fruits[s]) == 0)map.remove(fruits[s]);
                s++;
            }

            int cl = e-s+1;
            ml = Math.max(cl,ml);
            e++;
        }

        return ml;
    }
}