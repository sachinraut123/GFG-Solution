/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        if(head==null || head.next == null){
            return true;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Node temp = head;
        
        while(temp != null){
            ans.add(temp.data);
            temp = temp.next;
        }
        int left = 0;
        int right =  ans.size()-1;
        
        while(left<right){
            if(ans.get(left).equals(ans.get(right))){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}