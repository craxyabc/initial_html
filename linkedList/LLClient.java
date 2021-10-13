package linkedList;

public class LLClient {

    public static void main(String[] args) throws Exception {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addFirst(60);

        // ll.addLast(5);

        // ll.addAt(15, 2);

        ll.display();

        System.out.println();

        System.out.println(ll.getFirst());

        System.out.println(ll.getLast());

        System.out.println(ll.getAt(3));

        System.out.println(ll.removeFirst());

        ll.display();

        System.out.println();

        System.out.println(ll.removeLast());

        ll.display();

        System.out.println();

        System.out.println(ll.removeAt(3));

        ll.display();

        System.out.println();

        System.out.println(ll.middle());

        System.out.println(ll.deletemiddle());

        ll.display();
    }
}
