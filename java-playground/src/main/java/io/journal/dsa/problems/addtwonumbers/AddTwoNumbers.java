package io.journal.dsa.problems.addtwonumbers;


/**
 * https://leetcode.com/problems/add-two-numbers/
 * <p>
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode tmp;

        /**
         * Example 1:
         * Input: l1 = [2,4,3], l2 = [5,6,4]
         * Output: [7,0,8]
         */

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode rs = addTwoNumbers(l1, l2);

        /**
         *  * Example 3:
         *  * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
         */
        ListNode l11 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l22 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode rs1 = addTwoNumbers(l11, l22);

    }

    // Recursive
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1, l2, 0);
    }

    private static ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;
        int sum = carry + x + y;
        ListNode curr = new ListNode(sum % 10);
        carry = sum / 10;
        ListNode l1Next = (l1 != null) ? l1.next : null;
        ListNode l2Next = (l2 != null) ? l2.next : null;
        curr.next = addTwoNumbersHelper(l1Next, l2Next, carry);
        return curr;
    }

    // Iterative
    private static ListNode addTwoNumbersIter(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
