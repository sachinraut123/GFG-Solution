class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=arr.length-1;
        int idx = -1;
        
        
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==x){
                idx = mid;
                j=mid-1;
                
            }else if(arr[mid]<x){
                i = mid+1;
            }else if(arr[mid]>x){
                j = mid-1;
            }
        }
    
        
        int left=0;
        int right=arr.length-1;
        int idx2=-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==x){
                idx2 = mid;
                left=mid+1;
                
            }else if(arr[mid]<x){
                left = mid+1;
            }else if(arr[mid]>x){
                right = mid-1;
            }
        }
        ans.add(idx);
        ans.add(idx2);
        return ans;
      
    }
}
