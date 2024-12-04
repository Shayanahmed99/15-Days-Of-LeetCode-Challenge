class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] helper = new int[nums.length];
        int index;
        for(index = 0; index < k; index++){
            helper[index] = nums[nums.length-k+index];
        }
        int i = 0;
        while(i < nums.length-k){
            helper[index++] = nums[i++];
        }
        for(int j = 0; j<helper.length; j++){
            nums[j] = helper[j];
        }
    }
}