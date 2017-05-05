
//https://leetcode.com/problems/combination-sum-iv/#/description

public class Solution {
    public int combinationSum4(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        return recur(nums, target, hm);
    }
    
    public int recur(int[] nums, int target, HashMap<Integer, Integer> dp) {
        
        if(dp.containsKey(target)) return dp.get(target);
        
        if(target == 0) return 1;
        
        if(target < 0) return 0;
        
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            count += recur(nums, target-nums[i], dp);
        }
        
        dp.put(target, count);
        
        return count;
    }
}