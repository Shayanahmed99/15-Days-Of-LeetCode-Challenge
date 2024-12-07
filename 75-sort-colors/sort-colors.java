class Solution {
    public void sortColors(int[] nums) {
        int rcount = 0;
        int wcount = 0 ;
        int bcount = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                rcount++;
            }
            else if(nums[i] == 1){
                wcount++;
            }
            else{
                bcount++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(rcount != 0){
                nums[i] = 0;
                rcount--;
            }
            else if(wcount != 0){
                nums[i] = 1;
                wcount--;
            }
            else{
                nums[i] = 2;
                bcount--;
            }
        }
    }
}