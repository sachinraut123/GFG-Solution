class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int idx = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                idx = i;
            }
        }
        return idx;
    }
}