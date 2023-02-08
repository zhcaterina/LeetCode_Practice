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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode point = head, point2 = head;

        int size = 0;
        while (point != null) {
            point = point.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int num = size - n;


        for (int i = 0; i < num - 1; i++) {
            point2 = point2.next;
        }

        point2.next = point2.next.next;


        return head;
    }

    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(new ListNode(1,null), 1));
    }
}