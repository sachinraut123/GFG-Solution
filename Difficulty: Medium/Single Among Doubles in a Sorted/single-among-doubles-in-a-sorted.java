class Solution {
    int single(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1) return arr[0];
       if(arr[0]!=arr[1]) return arr[0];
       if(arr[n-1]!=arr[n-2]) return arr[n-1];
       
       int i=0; 
       int j=arr.length-1;
       
       while(i<=j){
           int mid = i+(j-i)/2;
               if(arr[mid]!=arr[mid-1] && arr[mid] != arr[mid+1]){
                   return arr[mid];
               }
               int first = mid,second = mid;
               
               if(arr[mid]==arr[mid-1]){
                   first= mid-1;
               }else{
                   second = mid+1;
               }
               int firstCnt = first-i;
               int secondCnt = j-second;
               if(firstCnt%2==0){
                   i = second+1;
               }else{
                   j = first-1;
               }
           
       }
       return -1;
    }
}