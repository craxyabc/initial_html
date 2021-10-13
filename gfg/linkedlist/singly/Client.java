package gfg.linkedlist.singly;

import java.util.*;

public class Client {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(15);
        list.addLast(20);

        list.addAt(30, 3);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAt(3));

        list.display();

        System.out.println();
        System.out.println(list.deleteFirst());

        list.display();

        System.out.println();
        System.out.println(list.deleteLast());

        list.display();

        System.out.println();

        System.out.println(list.getMiddle());

        System.out.println(list.deleteMiddle());

        System.out.println(list.deleteAt(1));

        list.display();

        System.out.println();

        System.out.println(list.countNumber(10));

        System.out.println(list.findData(10));

        list.deleteList();

        //

        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(15);

        list.addAt(15, 3);
        list.addAt(10, 4);
        list.addAt(50, 5);

        list.display();

        list.removeDuplicate();

        System.out.println();

        list.display();

    }

}
