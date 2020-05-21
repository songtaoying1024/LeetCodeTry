package Algorithm.medium.DlinkedList;

public class removeNthFromEnd {
    public static class ListNode{

        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode slow= newHead;
        ListNode fast= newHead;
        for(int i =0;i<=n;i++){
            fast= fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow= slow.next;
        }
        slow.next=slow.next.next;
        return slow.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next= new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        new removeNthFromEnd().removeNthFromEnd(head,2);
    }

}

