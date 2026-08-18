import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Set<List<Integer>> nu = new HashSet<>();
        //     int n = nums.length;

        //     for(int i=0;i<n-2;i++){
        //         for(int j=i+1;j<n-1;j++){
        //             for(int k=j+1;k<n;k++){
        //                 if(nums[i] + nums[j] + nums[k] == 0){
        //                      List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                     Collections.sort(temp);
        //                     nu.add(temp);
        //                 }
        //             }
        //         }
        //     }
        //     return new ArrayList<>(nu);



        Set<List<Integer>> nu = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        int j=0;int k=0;
        for(int i=0;i<n-2;i++){
            j = i+1;  k =n-1;

            while(j<k){
                int sum =nums[i] +nums[j] + nums[k];
                if(sum == 0){
                    // List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    //         Collections.sort(temp);
                            nu.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
                if(sum<0){j++;}
                else{k--;}
            }
        }
    return new ArrayList<>(nu);
        }
    
}