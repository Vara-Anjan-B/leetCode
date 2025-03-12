class Solution {
    public int maximumCount(int[] nums) {
        int sts = 0,ends = nums.length-1;
        int stn = 0,endn = nums.length-1;
        while(sts <= ends){
            int mid = sts + (ends - sts)/2;
            if(nums[mid] <= 0){
                sts = mid + 1;
            }
            else if(nums[mid] > 0){
                ends = mid - 1;
            }
        }
        while(stn <= endn){
            int mid = stn + (endn - stn)/2;
            if(nums[mid] >= 0){
                endn = mid - 1;
            }
            else if(nums[mid] < 0){
                stn = mid + 1;
            }
        }
        return Math.max(nums.length - sts,endn+1);
    }
}