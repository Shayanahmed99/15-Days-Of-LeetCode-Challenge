class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> helper = new ArrayList<>();
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                helper.add(nums[i]);
            }
            else{
                count++;
            }
        }
        while(count != 0){
            helper.add(0);
            count--;
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = helper.get(i);
        }

    }
}