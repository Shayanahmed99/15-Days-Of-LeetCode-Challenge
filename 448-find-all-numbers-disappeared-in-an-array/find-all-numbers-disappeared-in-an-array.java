class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> values = new HashSet<>();
        for(int i: nums){
            values.add(i);
        }
        for(int i = 1; i<=nums.length; i++){
            if(!values.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}