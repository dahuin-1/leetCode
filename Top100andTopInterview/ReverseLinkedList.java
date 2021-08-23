package Top100andTopInterview;

import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode returnNode;
        Stack stack = new Stack();
        while (currentNode != null){
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }
        while (!stack.isEmpty()) {
            returnNode = (ListNode) stack.pop();


            return (ListNode) stack.pop();
        }

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
