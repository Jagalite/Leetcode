
//https://leetcode.com/problems/pascals-triangle/#/description

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList array = new ArrayList();
        
        HashMap dp = new HashMap();
        
        for(int i = 0; i <= numRows-1; i++) {
            ArrayList temp = new ArrayList();
            for(int j = 0; j <= i; j++) {
                temp.add(combo(i,j, dp));
            }
            
            array.add(temp);
        }
        
        return array;
    }

    public int combo(int n, int r, HashMap<String, Integer> dp) {
        if(n == r || r == 0) return 1;
        
        if(dp.containsKey(n + " " + r)) return dp.get(n + " " + r);
        
        int a = combo(n-1, r-1, dp);
        
        int b = combo(n-1, r, dp);
        
        dp.put((n-1) + " " + (r-1), a);
        dp.put((n-1) + " " + r, b);
        
        return a + b;
    }
}