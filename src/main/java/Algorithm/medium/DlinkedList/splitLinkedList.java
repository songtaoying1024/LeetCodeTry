package Algorithm.medium.DlinkedList;

/**
 * leetcode 725
 * Time Complexity O(n)
 * Space Complexity O(k) 存储k个head的 reference
 *
 */
public class splitLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        ListNode curr = root;
        int len = 0;
        while(curr!=null){
            curr = curr.next;
            len++;
        }
        int l = len/k;
        int r = len%k;
        ListNode prev =null;
        curr = root;
        for(int i=0;i<k;i++,r--){
            res[i] = curr;
            int parLen=r>0?l+1:l;
            for(int j=0;j<parLen;j++){
                prev = curr;
                curr=curr.next;
            }
            if(prev!=null) prev.next=null;
        }
        return res;
    }
}
