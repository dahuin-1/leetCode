package Top100andTopInterview.medium;

import java.util.Stack;

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       /* Stack<ListNode> stack = new Stack<>();
        while (l2 != null) {
            stack.push(l2);
            l2 = l2.next;
        }*/

        ListNode newNode = new ListNode(0);
        String tempL1 = "";
        String tempL2 = "";
        while (l1 != null) {
            tempL1 += String.valueOf(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            tempL2 += String.valueOf(l2.val);
            l2 = l2.next;
        }

        int returnValue = Integer.parseInt(tempL1 + tempL2);

        while () {
           newNode =  returnValue % 10;
        }


    }


      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}
