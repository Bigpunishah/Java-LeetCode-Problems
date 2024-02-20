import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> sMap = new HashMap<>();
        HashMap<Character , Character> tMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            // get the current characters from both strings
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            // if the character from s has already been mapped, check if it's mapped to the same character in t
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            } else { // if the character from s hasn't been mapped yet, add the mapping
                sMap.put(sChar, tChar);
            }
            
            // do the same for t
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }
        }
        


        return true;

        
    }



    public static void main(String[] args){
        Solution s = new Solution();

        String g = "foo";
        String t = "baa";
        System.out.println(s.isIsomorphic(g, t));
        
    }

}