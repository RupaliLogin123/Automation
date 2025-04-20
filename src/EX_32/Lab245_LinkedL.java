package EX_32;

import java.util.LinkedList;

public class Lab245_LinkedL {
    public static void main(String[] args) {
        LinkedList <String> list=new LinkedList();


        list.add("Lionn");
        list.add("Pig");
        list.add("Cat");
        list.addFirst("Hyna");
        list.addLast("Dog");

        //Accessing Element
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list);


        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);

        System.out.println(list.size());

    }
}
