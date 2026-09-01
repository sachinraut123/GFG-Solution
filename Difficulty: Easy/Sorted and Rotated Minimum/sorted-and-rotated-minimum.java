class Solution {
    public int findMin(int[] arr) {
        // code here
        int ans = Integer.MAX_VALUE;
        
        int i=0;
        int j = arr.length-1;
        
        while(i<=j){
            int mid = i+(j-i)/2;
            
            if(arr[i]<=arr[mid]){
                ans = Math.min(arr[i],ans);
                i=mid+1;;
            }else{
                ans = Math.min(arr[mid],ans);
                j=mid-1;
            }
        }
        return ans;
    }
}
