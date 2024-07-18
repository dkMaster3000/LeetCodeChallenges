package main;


public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy head node to help simplify the code
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Iterate through both lists until both are exhausted
        while (l1 != null || l2 != null) {
            // Get the values from the current nodes, if present
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum and the carry-over
            int total = val1 + val2 + carry;
            carry = total / 10;
            int newVal = total % 10;

            // Create a new node with the computed value
            current.next = new ListNode(newVal);
            current = current.next;

            // Move to the next nodes in the lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's any carry left after the last operation, create a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // The result linked list is in the next of dummy head
        return dummyHead.next;
    }

//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//            Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.
//    Example 2:
//
//    Input: l1 = [0], l2 = [0]
//    Output: [0]
//    Example 3:
//
//    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//    Output: [8,9,9,9,0,0,0,1]
}
