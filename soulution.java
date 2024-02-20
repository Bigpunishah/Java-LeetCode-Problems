

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // create a dummy node to start the linked list
        ListNode dummy = new ListNode(0); 
        // create a pointer to the dummy node to add nodes to the linked list
        ListNode curr = dummy; 
        // create a variable to store the carry value while adding the digits
        int carry = 0; 
        
        // iterate over both lists until we reach the end of both lists and there is no carry
        while (l1 != null || l2 != null || carry != 0) {
            // get the value of the nodes or zero if the nodes are null

            //          if....        true     false
            //  this               =   this   or this
            int val1 = (l1 != null) ? l1.val : 0;
            /*
             int val1;
            if (l1 != null) {
                val1 = l1.val;
            } else {
                val1 = 0;
            }
             */
            int val2 = (l2 != null) ? l2.val : 0;
            
            // add the two values and the carry, and calculate the new carry value and the digit value to be added to the linked list
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            
            // create a new node with the digit value and add it to the linked list
            curr.next = new ListNode(digit);
            curr = curr.next;
            
            // move to the next nodes in both lists if they are not null
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        
        // return the linked list starting from the second node (first node is a dummy)
        return dummy.next;
    }
}