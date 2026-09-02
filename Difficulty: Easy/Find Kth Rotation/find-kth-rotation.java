class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        
        int i=0;
        int j=arr.length-1;
        int min = Integer.MAX_VALUE;
        int idx=0;
        
        while(i<=j){
            int mid = i+(j-i)/2;
            
            if(arr[i]<=arr[mid]){
                if(arr[i]<min){
                min = arr[i];
                idx=i;
                }
                i=mid+1;
            }else {
                if(min>arr[mid]){
                min = arr[mid];
                idx=mid;
                
                }
                j=mid-1;
            }
        }
        return idx;
    }
}