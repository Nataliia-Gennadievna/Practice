//Автор: Удинська Наталія

package com.company;

public class LinkedListT {
    public static void main(String[] args) {

        int index = 0;

        LinkedList ll = new LinkedList();

        System.out.println("size before = " + ll.size());
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println("size after = " + ll.size());

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i)+ " ");
        }

        Integer value = ll.get(index);
        System.out.println("\nlist(" + index + ")= " + value);

        System.out.println("element deleted: " + ll.delete(index));

        System.out.println("size after deleting = " + ll.size());
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}