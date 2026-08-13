/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        Node less = new Node(0);
        Node greater = new Node(0);
        Node middle = new Node(0);
        Node m = middle;
        Node l = less;
        Node g = greater;
        Node temp = head;
        
        while(temp != null){
            if(temp.data<x){
                l.next = temp;
                l = l.next;
            }else if(temp.data>x){
                g.next = temp;
                g = g.next;
            }else if(temp.data==x){
                m.next = temp;
                m = m.next;
            }
            temp = temp.next;
        }
        g.next = null;
        m.next = greater.next;
        l.next = middle.next;
         
        head = less.next;
        return head;
    }
};