package assesment;

import java.math.BigDecimal;

public class Q17 {

    public static void main(String[] args) {

        // l1 = [2,4,3]
        ListNode l1 = new ListNode(9);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);

        // l2 = [5,6,4]
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

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

        int i = 0;
        int j = 0;

        BigDecimal a = BigDecimal.ZERO;
        BigDecimal b = BigDecimal.ZERO;

        ListNode current1 = l1;
        ListNode current2 = l2;

        while (current1 != null) {
            BigDecimal value =
                    BigDecimal.valueOf(current1.val)
                            .multiply(BigDecimal.TEN.pow(i));
            a = a.add(value);

            current1 = current1.next;
            i++;
        }

        while (current2 != null) {
            BigDecimal value =
                    BigDecimal.valueOf(current2.val)
                            .multiply(BigDecimal.TEN.pow(j));
            b = b.add(value);

            current2 = current2.next;
            j++;
        }

        BigDecimal sum = a.add(b);

// Handle zero case
        if (sum.equals(BigDecimal.ZERO)) {
            return new ListNode(0);
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);

// Convert sum back to linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (sum.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal[] divRem = sum.divideAndRemainder(BigDecimal.TEN);

            int digit = divRem[1].intValue();
            sum = divRem[0];

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
