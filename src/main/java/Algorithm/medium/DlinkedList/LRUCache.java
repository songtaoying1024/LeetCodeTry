package Algorithm.medium.DlinkedList;

import java.util.*;

public class LRUCache {
    class DlinkedNode{
        int key;
        int val;
        DlinkedNode pre;
        DlinkedNode post;
        public DlinkedNode(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    int capacity;
    Map<Integer,DlinkedNode> map = new HashMap<>();
    DlinkedNode head = new DlinkedNode(0,0);
    DlinkedNode tail = new DlinkedNode(0,0);
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.post = tail;
        tail.pre = head;

    }

    public int get(int key) {
        if(map.containsKey(key)){
            DlinkedNode node = map.get(key);
            moveNodeToTop(node);
            return node.val;
        }else{
            return -1;
        }

    }

    public void put(int key, int value) {
        if(!map.containsKey(key)){
            if(map.size() == capacity) {deleteLastNode();}
            DlinkedNode temp = head.post;
            DlinkedNode newNode = new DlinkedNode(key,value);
            head.post = newNode;
            newNode.pre = head;
            newNode.post = temp;
            temp.pre = newNode;
            map.put(key,newNode);
        }else{
            DlinkedNode node = map.get(key);
            node.val = value;
            moveNodeToTop(node);
        }


    }
    public void deleteLastNode(){
        DlinkedNode lastNode = tail.pre;
        lastNode.pre.post = tail;
        tail.pre = lastNode.pre;
        map.remove(lastNode.key);
    }
    public void moveNodeToTop(DlinkedNode node){
        node.pre.post= node.post;
        node.post.pre =node.pre;
        DlinkedNode temp = head.post;
        head.post = node;
        node.pre = head;
        node.post = temp;
        temp.pre = node;
    }


    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        int one =lruCache.get(1);
        lruCache.put(3,3);
        int two =lruCache.get(2);
        lruCache.put(4,4);
        int one2 =lruCache.get(1);
        int three =lruCache.get(3);
        int four =lruCache.get(3);

    }
}
