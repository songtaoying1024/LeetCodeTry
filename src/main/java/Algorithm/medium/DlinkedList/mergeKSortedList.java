package Algorithm.medium.DlinkedList;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * leetcode 23 merge K Sorted Lists
 * 这道题可以用两种办法做
 *
 * 1 用PriorityQueue（可以搜索了解其api）
 * 2 用递归做。
 *
 */
public class mergeKSortedList {
    public class  ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 这个方法用了priorityQueue
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null||lists.length==0) return null;
        ListNode dummy  = new ListNode(0);
        ListNode tail = dummy;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for(ListNode node : lists){
            if(node!=null){
                priorityQueue.add(node);
            }
        }
        while(!priorityQueue.isEmpty()){
            tail.next= priorityQueue.poll();
            tail = tail.next;
            if(tail.next!=null) {
                priorityQueue.offer(tail.next);
            }
        }
        return dummy.next;
    }

    /**
     * 这种方法使用了递归
     * @param lists
     * @return
     */
    public ListNode mergeKLists2(ListNode[] lists){
        return helper(lists,0,lists.length-1);

    }

    private ListNode helper (ListNode[] lists,int l,int r){
        if(l>r) return null;
        if(l==r) return lists[l];
        if(l+1==r) return mergeTwoList(lists[l],lists[r]);
        int m = l+(r-l)/2;
        ListNode lf = helper(lists,l,m);
        ListNode ri = helper(lists,m+1,r);
        return mergeTwoList(lf,ri);
    }
    public ListNode mergeTwoList(ListNode l1 ,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode res;
        if(l1.val<l2.val){
            res = l1;
            res.next = mergeTwoList(l1.next,l2);
        }else{
            res = l2;
            res.next = mergeTwoList(l1,l2.next);
        }
        return res;
    }
}
