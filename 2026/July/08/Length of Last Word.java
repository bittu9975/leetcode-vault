class Solution {
    public int lengthOfLastWord(String s) {
         String t=s.trim();
        int a = t.lastIndexOf(' ')+1;
        return t.length()-a;
    
    }
}