//https://leetcode.com/problems/integer-break/#/description
public class Solution {
    public int integerBreak(int n) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(1);
        
        for(int i = 2; i < n; i++) {
            int temp = al.remove(0) + 1;
            
            if(temp == 4) {
                al.add(0, 2);
                al.add(0, 2);
            }
            else {
                al.add(temp);
            }
        }
        
        int count = 1;
        for(Integer i : al) count *= i;
        return count;
    }
}