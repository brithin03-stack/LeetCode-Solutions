class Solution {
    public int removeElement(int[] nums, int val) {
        int lp=0;
        int rp=0;
        while(rp<nums.length){
            if(nums[rp]!=val){
                int temp=nums[rp];
                nums[rp]=nums[lp];
                nums[lp]=temp;
                lp++;
            }
            rp++;
        }
        return lp;
    }
}
