package questions;

/*
Occurrence of an integer in a Linked List
Given a singly linked list and a key, count the number of occurrences of given key in the linked list.

Example 1:

Input:
N = 7
Link List = 1->2->1->2->1->3->1
search_for = 1
Output: 4
Explanation:1 appears 4 times.
 */

public class GFGOne {
    private Node head;

    public void addData(int data){
        Node node = new Node(data);
        if(head == null){
            node = head;
        }

    }

    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
