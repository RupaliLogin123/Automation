package EX_32;

import java.util.ArrayList;
import java.util.List;

public class Lab243_ArrayList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");

        System.out.println(list.size());
        System.out.println(list.contains("1"));
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf("3"));
        System.out.println(list.contains("3"));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println(list);
















    }
}
