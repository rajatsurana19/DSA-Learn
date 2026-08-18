class Solution {
    public int threeSumClosest(int[] nums, int target) {
        

        Arrays.sort(nums);
        int n = nums.length;
        int j=0;int k=0;
        int cl = 0;
        int min = Integer.MAX_VALUE;
        int answer = 0;;
        for(int i=0;i<n-2;i++){
            j = i+1;  k =n-1;

            while(j<k){
                int sum =nums[i] +nums[j] + nums[k];
                cl = Math.abs(sum-target);
                 if (cl < min) {
                    min = cl;
                answer = sum;
                }
                if(sum<target){j++;}
                else{k--;}

                
            }
        }
    return answer;


    }
}