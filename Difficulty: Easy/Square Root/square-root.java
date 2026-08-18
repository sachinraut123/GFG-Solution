class Solution {
    int floorSqrt(int n) {
        // code here
        
        int low = 1;
        int high = n;
        int middle=0;
        int sqrt = 0;
        int ans=0;
        
        while(low<=high){
            middle = low+(high-low)/2;
            sqrt = middle * middle;
            if(sqrt==n){
                return middle;
            } if(sqrt<n){
                ans = middle;
                low = middle+1;
            }else{
                high = middle-1;
            }
            
        }
        return ans;
    }
}