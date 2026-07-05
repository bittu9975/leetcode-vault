class Solution {
    public int lengthOfLongestSubstring(String s) {
            int left=0,maxlen=0;
        Set<Character> tab=new HashSet<>();
        for (int r=0;r<s.length();r++){
            if (!tab.contains(s.charAt(r))){
                tab.add(s.charAt(r));
                maxlen=Math.max(maxlen,r-left+1);
            }else {
                while (tab.contains(s.charAt(r))){
                    tab.remove(s.charAt(left));
                    left++;
                }
                tab.add(s.charAt(r));
            }
        }
        return maxlen;
    
    }
}