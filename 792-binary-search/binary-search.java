class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int h = nums.length-1;

        while(h>=s){
            int mid = (h+s)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        return -1;
    }
}