class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();


        solve(candidates,target,0,ans,out);
        return ans;
    }
    public static void solve(int[] candidates,int target,int in,List<List<Integer>> ans,List<Integer> out){
        if(target == 0) {
        ans.add(new ArrayList<>(out));
        return ;
        }

        if(in >= candidates.length || target<0){
            return;
        }

        out.add(candidates[in]);
        solve(candidates,target-candidates[in],in,ans,out);
        out.remove(out.size()-1);
        solve(candidates,target,in+1,ans,out);
    }
}