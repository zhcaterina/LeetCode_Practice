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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();

        ListNode point = result;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                point.next = new ListNode(list1.val);
                list1 = list1.next;
                point = point.next;
            } else if (list1.val > list2.val) {
                point.next = new ListNode(list2.val);
                list2 = list2.next;
                point = point.next;
            }
        }

        if (list1 != null) {
            while (list1 != null) {
                point.next = new ListNode(list1.val);
                list1 = list1.next;
                point = point.next;
            }
        }

        if (list2 != null) {
            while (list2 != null) {
                point.next = new ListNode(list2.val);
                list2 = list2.next;
                point = point.next;
            }
        }

        return result.next;
    }

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(new ListNode(1, null), null));
    }
}