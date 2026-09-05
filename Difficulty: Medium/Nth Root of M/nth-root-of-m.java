class Solution {
    public int nthRoot(int n, int m) {
        // code here
        
        if(m==0)  return 0;
         int i=1;
         int j = m;
         
         while(i<=j){
             int mid = i+(j-i)/2;
             
             int ans=1;
             for(int k=0; k<n; k++){
                 ans*=mid;
             }
             if(ans==m){
                 return mid;
             }else if(ans>m){
                 j=mid-1;
             }else i=mid+1;
         }
         return -1;
    }
}