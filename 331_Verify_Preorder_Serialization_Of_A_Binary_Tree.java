//https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/#/description

public class Solution {
    public boolean isValidSerialization(String preorder) {
        
        if(preorder.length() == 1 && !preorder.equals("#")) return false;
        
        String x = preorder;
        int l = x.length();
        x = x.replaceAll("\\d+,#,#", "T");
        
        for(int i = 0; i < l/4; i++) {
            x = x.replaceAll("\\d+,T,T","T");
            x = x.replaceAll("\\d+,(#,T|T,#)","T");
            if(x.length() == 1) return true;
        }
    
        
        if(x.length() == 1) return true;
        return false;
    }
}

//"9,3,4,#,#,1,#,#,2,#,6,#,#"

//"9,3,T,T,2,#,T"

//"9,T,T"

//"T"