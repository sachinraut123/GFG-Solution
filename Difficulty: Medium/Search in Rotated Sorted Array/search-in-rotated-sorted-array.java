class Solution {
    int search(int[] arr, int key) {
        // code here
        int i=0;
        int j = arr.length-1;
        
        while(i<=j){
            int mid = i+(j-i)/2;
            
            if(arr[mid]==key) return mid;
            
            if(arr[i]<=arr[mid]){
                if(arr[i]<=key && arr[mid]>=key){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(arr[mid] < key && key <= arr[j]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
}