import java.util.Arrays;;
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
    public static void mergeSort(int[] nums){
       int n = nums.length;
       if(n == 1){
        return;
       }  
       int mid = n/2;
       int[] arr1 = Arrays.copyOfRange(nums,0,mid);
       int[] arr2 = Arrays.copyOfRange(nums,mid,n);

       mergeSort(arr1);
       mergeSort(arr2);
       merge(nums,arr1,arr2);
    }

    public static void merge(int[] arr,int[] left, int[] right){
        int i=0, j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
}