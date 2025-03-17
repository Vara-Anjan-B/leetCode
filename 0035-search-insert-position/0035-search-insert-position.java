class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0,end = nums.length-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(nums[mid] < target){
                st = mid+1;
            }
            if(nums[mid] > target){
                end = mid - 1;
            }
            if(nums[mid] == target){
                return mid;
            }
        }
        return st;
    }
}