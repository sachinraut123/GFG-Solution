/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        
        Node odd = new Node(0);
        Node even = new Node(0);
        Node o = odd;
        Node e = even;
        Node temp = head;
        
        while(temp != null){
            if(temp.data%2==0){
                e.next = temp;
                e = e.next;
            }else{
                o.next = temp;
                o = o.next;
            }
            temp = temp.next;
        }
        o.next = null;
        e.next = odd.next;
        head = even.next;
        return head;
    }
}