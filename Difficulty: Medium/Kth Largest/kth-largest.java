class Solution {
    public static int kthLargest(int arr[], int k) {
        // code here
        Arrays.sort(arr);
        
        return arr[arr.length-k];
    }
}