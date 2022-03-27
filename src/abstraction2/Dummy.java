package abstraction2;

import java.util.LinkedList;

public class Dummy {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Mark");
        ll1.add("Tom");
        //How to print LinkedList
         System.out.println(ll1);
        // How to get first element from a linked list
//         String firstElement1 = ll1.element();//element() returns the first element without removing (copy+paste)
//         System.out.println(firstElement1);//Ali
        // System.out.println(ll1);
//         String firstElementRemoved = ll1.poll();//poll() returns the first element after removing (cut+paste)
//         System.out.println(firstElementRemoved);//Ali
//         System.out.println(ll1);
         String firstElement2 = ll1.getFirst();//getFirst() returns the first element without removing (copy+paste)
         System.out.println(firstElement2);//Can		System.out.println(ll1);
         String firstElement3 = ll1.peek();//peek() returns first element without removing (copy+paste)
         System.out.println(firstElement3);//Can		System.out.println(ll1);
//         How to get first element from an empty linked list
         LinkedList<String> ll2 = new LinkedList<>();
         String firstElFromEmptyLinkedList1 = ll2.element();// element() method throws NoSuchElementException for the
        // empty linked list
//        System.out.println(firstElFromEmptyLinkedList1);





    }
}
