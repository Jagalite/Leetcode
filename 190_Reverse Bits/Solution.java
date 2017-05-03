//https://leetcode.com/problems/reverse-bits/#/description
public class Solution {
    public int reverseBits(int n) {
        int temp = n;
        for(int i = 0; i < 16; i++) {
            int left = getBit(temp, i);
            int right = getBit(temp, 32-i-1);
            
            temp = setBit(temp, i, right);
            temp = setBit(temp, 32-i-1, left);
        }
        return temp;
    }
    
    public int getBit(int n, int index) {
        int mask = 1 << index;
        return ((n & mask) == 0) ? 0 : 1;
    }
    
    public int removeBit(int n, int index) {
        int mask = ~(1 << index);
        return n & mask;
    }
    
    public int setBit(int n, int index, int target) {
        int x = removeBit(n, index);
        return x | (target << index);
    }
}