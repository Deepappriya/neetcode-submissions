class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1,i=0;
        while(i<n){
            if(nums[i]==nums[i+1])
                i+=2;
            else 
                return nums[i];
        }
        return nums[i];
    }
}
