package assesment;

public class Q17 {

    public static void main(String[] args) {

        // l1 = [2,4,3]
        ListNode l1 = new ListNode(0);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);

        // l2 = [5,6,4]
        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

        Q17 obj = new Q17();
        ListNode result = obj.addTwoNumbers(l1, l2);

        // Print result list
        ListNode iter = result;
        while (iter != null) {
            System.out.print(iter.val + "->");
            iter = iter.next;
        }
        System.out.println("null");
    }

    // ================= IMPLEMENT LOGIC HERE =================
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // write logic here
        double i = 0;
        double a = 0;
        double b = 0;

        ListNode current1 = l1;
        ListNode current2 = l2;

        while (current1 != null && current2 != null) {
            a = current1.val * Math.pow(10, i) + a;
            b = current2.val * Math.pow(10, i) + b;
            i++;

            current1 = current1.next;
            current2 = current2.next;
        }
        int sum = (int) (a + b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);


        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (sum != 0) {
            int digit = sum % 10;
            sum = sum / 10;

            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummy.next;
    }
    // ========================================================

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
