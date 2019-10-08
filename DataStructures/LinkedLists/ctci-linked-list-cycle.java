package LinkedLists;

// https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

import java.util.HashSet;
import java.util.Set;

class LinkedListCycleSolution {
    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        Set seen = new HashSet<Node>();
        while (head != null) {
            seen.add(head);
            head = head.next;
            if (seen.contains(head)) return true;
        }
        return false;
    }
}
