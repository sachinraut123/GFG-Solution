/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        Node temp = head;
        while(temp!=null){
            ans.add(temp.data);
            temp = temp.next;
        }
        int i = 0;
        int j = ans.size()-1;
        while(i<j){
        int swap = ans.get(i);
        ans.set(i, ans.get(j));
        ans.set(j, swap);
        i++;
        j--;
        }
        
         i =0;
        temp = head;
        while(temp!=null){
            temp.data = ans.get(i);
            i++;
            temp = temp.next;
            
        }
        return head;
    }
}