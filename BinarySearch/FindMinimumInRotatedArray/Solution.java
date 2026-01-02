package BinarySearch.FindMinimumInRotatedArray;

class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[high]){
                //means we are in left segment
                // and we need to search in right segment
                low = mid+1;

            }
            else{
                //means we are in the right segment
                // we need to look more right
                high = mid;
            }
        }
        return nums[low];
    }
}