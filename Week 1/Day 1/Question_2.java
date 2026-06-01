class Solution {
    public int removeDuplicates(int[] nums) {
        int pos=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[pos]!=nums[i]){
                temp=nums[i];
                nums[i]=nums[pos+1];
                nums[pos+1]=temp;
                pos++;
            }
        }
        return pos+1;
    }
}