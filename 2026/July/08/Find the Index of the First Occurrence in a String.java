import java.util.*;
class Solution {
    public int strStr(String haystack, String needle) {
        int idx=Integer.MAX_VALUE;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(helper(haystack,needle,i,needle.length())){
                    idx=Math.min(i,idx);
                }
            }
        }
        if(idx==Integer.MAX_VALUE)return -1;
        else return idx;
    }
    public boolean helper(String haystack,String needle,int start,int end){
        int j=0;
        if(haystack.length()<needle.length())return false;
        for(int i=start;i<end;i++){
            if(haystack.charAt(i)!=needle.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }
}