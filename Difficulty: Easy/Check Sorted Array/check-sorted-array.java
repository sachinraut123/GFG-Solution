class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int i = 0;
        int j = arr.length-1;
        
        while(i<j){
            if(arr[i]>arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}