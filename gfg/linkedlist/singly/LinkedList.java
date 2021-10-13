package gfg.linkedlist.singly;

import java.util.*;

/**
 * LinkedList
 */
public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head, tail;
    int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data, this.head);
        this.head = node;
        if (this.isEmpty()) {
            this.tail = node;
        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data, null);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void addAt(int data, int index) {
        Node temp = getNode(index - 1);
        Node node = new Node(data, temp.next);
        temp.next = node;
        this.size++;
    }

    public int getFirst() {
        return this.head.data;
    }

    public int getLast() {
        return this.tail.data;
    }

    public int getAt(int index) {
        return this.getNode(index).data;
    }

    public int deleteFirst() {
        Node temp = this.head;
        this.head = this.head.next;
        this.size--;
        return temp.data;
    }

    public int deleteLast() {
        Node temp = this.tail;
        Node node = this.getNode(this.size() - 2);
        node.next = null;
        this.tail = node;
        this.size--;
        return temp.data;
    }

    public int deleteAt(int index) {
        Node temp = this.getNode(index - 1);
        Node rv = temp.next;
        temp.next = temp.next.next;
        this.size--;
        return rv.data;
    }

    public void deleteList() {
        this.head = null;
        System.out.println("list deleted");
    }

    // Middle
    public int getMiddle() {
        Node slow = this.head, fast = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public int deleteMiddle() {
        Node slow = this.head, fast = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node rv = slow;
        slow.next = slow.next.next;
        this.size--;
        return rv.data;
    }

    // count number
    public int countNumber(int value) {
        Node temp = this.head;
        int count = 0;
        while (temp != null) {
            if (temp.data == value) {
                count++;
                temp = temp.next;
            }
        }

        return count;
    }

    public boolean findData(int value) {
        Node temp = this.head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
        }

        return false;
    }

    public void removeDuplicate() {
        Node temp = this.head;
        Node prev = null;
        HashSet<Integer> set = new HashSet<>();
        while (temp != null) {
            if (set.contains(temp.data)) {
                prev.next = temp.next;
                this.size--;
            } else {
                set.add(temp.data);
                prev = temp;
            }

            temp = temp.next;
        }

    }

    private Node getNode(int index) {
        int counter = 0;
        Node temp = this.head;
        while (counter != index) {
            temp = temp.next;
            counter++;
        }

        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}