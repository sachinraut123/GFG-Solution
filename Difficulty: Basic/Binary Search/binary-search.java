class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int i=0;
        int j = arr.length-1;
        
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]<k){
                i = mid+1;
            }else if(arr[mid]>k){
                j = mid-1;
            }
        }
        return false;
    }
}