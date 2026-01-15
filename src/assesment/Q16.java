package assesment;

public class Q16 {
    public static void main(String[] args) {
        ListNode1 head = new ListNode1(3);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(0);
        head.next.next.next = new ListNode1(-4);
        head.next.next.next.next = head.next;

        ListNode1 hare = head;
        ListNode1 tort = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tort = tort.next;

            if (hare == tort) {
                System.out.println(true);
                return;
            }
        }
    }

    static class ListNode1 {
        int val;
        ListNode1 next;

        ListNode1() {
        }

        ListNode1(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode1(int val, ListNode1 next) {
            this.val = val;
            this.next = next;
        }
    }

}
