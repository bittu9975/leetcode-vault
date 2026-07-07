class Solution {
    public int searchInsert(int[] arr, int k) {
            int l=0,h=arr.length;
            if (k>arr[h-1])return h;
            while (l<=h){
                int mid=(l+h)/2;
                if (arr[mid]==k)return mid;
                else if (arr[mid]<k){
                    l=mid+1;
                }else {
                    h=mid-1;
                }
            }
            return l;
        
    }
}