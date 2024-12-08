class Solution {
    public int maxProduct(int[] nums) {
       if (nums.length == 1){
            return nums[0];
        }

        int max = nums[0];
        int min = nums[0];
        int product = nums[0];
        
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            } 
            if(nums[i] > max * nums[i]){
                max = nums[i];
            }
            else{
                max = max * nums[i];
            }
            if(nums[i] < min * nums[i]){
                min = nums[i];
            }
            else{
                min = min * nums[i];
            }
            product = Math.max(product, max);
        }

        return product;
    }
}