package EX_32;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public record lab247_Vector1() {
    public static void main(String[] args) {
        Vector v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Rupali");
        v.add("Pandagre");
        v.remove("Pandagre");

        for (int i = 0; i < v.size(); i++)
        {
            System.out.println(v.get(i));
        }

        System.out.println("for each");

        for(Object o : v)
        {
            System.out.println(o);
        }

        System.out.println("Iterator");

            Iterator iterator = v.iterator();
          while (iterator.hasNext());
          System.out.println(iterator.next());

        System.out.println("Enumerator");
        Enumeration<Object> enumeration=v.elements();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("List Iterator" );
        ListIterator listIterator = v.listIterator();
        while (listIterator.hasNext());
        System.out.println(listIterator.next());

        while (listIterator.hasPrevious());
        System.out.println(listIterator.previous());




    }
}
