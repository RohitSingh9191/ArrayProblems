package ProblemSolve;

import java.util.HashMap;
import java.util.Map;

public class ProblemlinkdlistHashSet {
          private class Node{

         int key;

         Node prev;

         Node next;

         int value;

         Node(int key , int value){
            this.key = key;
            this.value = value;
         }

        }



        int capacity;
        Map<Integer, Node> map;
        Node most; 
        Node least; 

    public ProblemlinkdlistHashSet(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();

        most = new Node(0, 0);

        least = new Node(0, 0);

        most.next = least;

        least.prev = most;
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);
        }else{
            if(map.size() == capacity){
                Node node = least.prev;
                remove(node);
                map.remove(node.key);
            }

            Node newNode = new Node(key, value);
            insert(newNode);
            map.put(key, newNode);
        }
    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node){
        node.next = most.next;
        node.prev = most;

        most.next.prev= node;

        most.next = node;
    }
    public static void main(String[] args) {

        ProblemlinkdlistHashSet test = new ProblemlinkdlistHashSet(2);

        test.put(1, 1);
        test.put(2, 2);

        System.out.println(test.get(1));

        test.put(3,3);

        System.out.println(test.get(2));

        test.put(4, 4);

        System.out.println(test.get(1));
        System.out.println(test.get(2));

        System.out.println(test.get(3));

        System.out.println(test.get(4));

        
    }
}
