class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int p1 = i+1;
            int p2 = nums.length - 1;
            while(p1 < p2){
                int sum = nums[i] + nums[p1] + nums[p2];
                if(sum == 0){
                    List<Integer> values = new ArrayList<>();
                    values.add(nums[i]);
                    values.add(nums[p1]);
                    values.add(nums[p2]);
                    triplets.add(values);
                    while(p1<p2 && nums[p1] == nums[p1+1]){
                        p1++;
                    }
                    while(p2>p1 && nums[p2] == nums[p2-1]){
                        p2--;
                    }
                    p1++;
                    p2--;
                }
                else if(sum > 0){
                    p2--;
                }
                else{
                    p1++;
                }
            }
        }
        return triplets;
    }
}