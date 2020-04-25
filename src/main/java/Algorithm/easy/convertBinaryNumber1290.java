package Algorithm.easy;

/**
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
Example 3:

Input: head = [1]
Output: 1
Example 4:

Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
Output: 18880
Example 5:

Input: head = [0,0]
Output: 0
 * **/
public class convertBinaryNumber1290{
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
    public int solution(ListNode node){
         int ans = 0;
        while(node!=null){
            ans = (ans<<1) | node.val;
            node = node.next;
        }
        return ans;
    }
    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(0);
        node.next.next=new ListNode(1);
        System.out.println(new convertBinaryNumber1290().solution(node));
        
    }
}

