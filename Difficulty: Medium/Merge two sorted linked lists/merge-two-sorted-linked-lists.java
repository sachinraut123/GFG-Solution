/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node ans = new Node(0);
        Node temp = ans;
        Node h1 = head1;
        Node h2 = head2;
        
        while(h1!=null && h2!=null){
            if(h1.data<h2.data){
                temp.next = h1;
                h1 = h1.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
            }
            temp=temp.next;
        }
        if(h1!=null){
            temp.next = h1;
        }else{
            temp.next = h2;
        }
        return ans.next;
    }
}