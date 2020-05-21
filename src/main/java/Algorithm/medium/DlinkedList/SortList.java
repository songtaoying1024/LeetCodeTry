package Algorithm.medium.DlinkedList;

public class SortList {

    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 一下为第一种方法 mergesort up to bottom
     * Time complexity O(n*log(n))
     * Space complexity O(log(n))
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return merge(sortList(head),sortList(mid));
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                tail.next= l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail= tail.next;
        }
        tail.next = (l1==null)?l2:l1;
        return dummy.next;
    }

    /**
     * 方法2 也是merge sort 但是是bottom up
     * Time complexity O(n*log(n))
     * Space complexity O(1)
     */

    class mergeHelper{
        private ListNode newHead;
        private ListNode newtail;

        public mergeHelper(ListNode newHead, ListNode newtail) {
            this.newHead = newHead;
            this.newtail = newtail;
        }
    }
    public mergeHelper mergeVersion2(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                tail.next= l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail= tail.next;
        }
        tail.next = (l1==null)?l2:l1;
        while(tail.next!=null){
            tail = tail.next;
        }
        return new mergeHelper(dummy.next,tail);
    }

    public ListNode superSort(ListNode head){
        if(head==null||head.next==null) return head;
        int len =0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            len++;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l;
        ListNode r;
        ListNode tail;
        for(int n =1;n<len;n<<=1){
            curr = dummy.next;
            tail = dummy;
            while(curr!=null){
                l = curr;
                r= split(l,n);
                curr = split(r,n);
                mergeHelper merged = mergeVersion2(l,r);
                tail.next = merged.newHead;
                tail = merged.newtail;
            }
        }
        return dummy.next;
    }

    public  ListNode split(ListNode head,int n){
        while(head!=null && --n>0){
            head = head.next;
        }
        ListNode rest = head!=null?head.next:null;
        if(head!=null) head.next=null;
        return rest;
    }

    public static void main(String[] args) {
        ListNode te = new ListNode(-1);
        te.next = new ListNode(5);
        te.next.next = new ListNode(3);
        te.next.next.next = new ListNode(4);
        te.next.next.next.next = new ListNode(0);
        te.next.next.next.next.next = new ListNode(0);
        te.next.next.next.next.next.next= new ListNode(-2);




        ListNode res = new SortList().superSort(te);
        while(res!=null){
            System.out.println(res.val+"\n");
            res= res.next;
        }

    }


}
