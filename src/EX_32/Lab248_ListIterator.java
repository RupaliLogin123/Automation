package EX_32;

import java.util.ListIterator;
import java.util.Vector;

public class Lab248_ListIterator {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Joy");
        v.add("John");
        v.add("Mary");
        v.add("Jack");

        ListIterator it = v.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



        ListIterator li = v.listIterator();
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
    }
}
