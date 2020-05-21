package Algorithm.medium.DlinkedList;

public class mergeTwoSortedList {
       public static class ListNode {
           int val;
           ListNode next;
           ListNode() {}
           ListNode(int val) { this.val = val; }
           ListNode(int val, ListNode next) { this.val = val; this.next = next; }
       }

     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          if(l1 == null) return l2;
          if(l2 == null) return l1;
          ListNode res;
          if(l1.val<l2.val){
               res = l1;
               res.next = mergeTwoLists(l1.next,l2);
          }else{
               res = l2;
               res.next = mergeTwoLists(l1,l2.next);
          }
          return res;
     }

     public static void main(String[] args) {
          ListNode l1 = new ListNode(1);
          l1.next = new ListNode(2);
          l1.next.next = new ListNode(4);

          ListNode l2 = new ListNode(1);
          l2.next = new ListNode(3);
          l2.next.next = new ListNode(5);
          new mergeTwoSortedList().mergeTwoLists(l1,l2);
     }

}
