class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> elements = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                elements.add(nums[i]);
            }
        }
        int k = elements.size();
        for(int i = 0; i<k; i++){
            nums[i] = elements.get(i);
        }
        return k;
    }
}