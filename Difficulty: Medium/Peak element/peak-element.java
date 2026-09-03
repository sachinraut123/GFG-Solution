class Solution {
    public int peakElement(int[] arr) {
        // code here
     
       
       if(arr.length==1) return 0;
       if(arr[0]>arr[1]) return 0;
       if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;
       
         int i=1; 
       int j=arr.length-2;
       while(i<=j){
           int mid = i+(j-i)/2;
           
           if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
               return mid;
           }else if(arr[mid-1]<arr[mid]){
               i=mid+1;
           }else{
               j=mid-1;
           }
       }
       return -1;
    }
}