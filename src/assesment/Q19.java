package assesment;

public class Q19 {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];

        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        if (lists == null || lists.length == 0) {
            return;
        }

        while (lists.length > 1) {
            int newSize = (lists.length + 1) / 2;
            ListNode[] merged = new ListNode[newSize];
            int index = 0;

            for (int i = 0; i < lists.length; i += 2) {
                if (i + 1 == lists.length) {
                    merged[index++] = lists[i];
                    continue;
                }
                ListNode a = lists[i];
                ListNode b = lists[i + 1];

                ListNode dummy = new ListNode(0);
                ListNode current = dummy;

                while (a != null && b != null) {
                    if (a.val <= b.val) {
                        current.next = a;
                        a = a.next;
                    } else {
                        current.next = b;
                        b = b.next;
                    }
                    current = current.next;
                }
                current.next = a != null ? a : b;
                merged[index++] = dummy.next;


            }
            lists = merged;
        }
        ListNode results = lists[0];
        while (results != null) {
            System.out.print(results.val + " ");
            results = results.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
