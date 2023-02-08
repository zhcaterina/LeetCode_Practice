class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            ListNode prev = head;

            if (head.next != null) {
                ListNode tmp = head.next;

                while (tmp != null) {
                    if (prev.val == tmp.val) {
                        prev.next = tmp.next;
                    } else {
                        prev = tmp;
                    }
                    tmp = tmp.next;
                }
            }
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode()));
    }
}