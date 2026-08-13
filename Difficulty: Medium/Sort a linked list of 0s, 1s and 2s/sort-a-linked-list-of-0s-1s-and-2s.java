/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node zero = new Node(0);
        Node one = new Node(0);
        Node two = new Node(0);
        Node o = one;
        Node z = zero;
        Node t = two;
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0){
                z.next = temp;
                z= z.next;
            }else if(temp.data == 1){
                o.next = temp;
                o = o.next;
            }else if(temp.data == 2){
                t.next = temp;
                t = t.next;
            }
            temp = temp.next;
        }
        t.next = null;
         o.next = two.next;
        z.next = one.next;
       
        head = zero.next;
        return head;
    }
}