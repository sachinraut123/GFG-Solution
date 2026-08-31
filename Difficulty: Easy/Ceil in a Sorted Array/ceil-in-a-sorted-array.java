class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int i=0;
        int j=arr.length-1;
        int idx=-1;
        
        while(i<=j){
            int mid = i+(j-i/2);
            
            if(arr[mid]>=x){
                idx=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return idx;
    }
}
