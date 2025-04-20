package EX_32;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lab250_Interview {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(68);
        list.add(79 );
        list.add(90);
        list.add(95);

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);


        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(Collections.reverseOrder());
        System.out.println(marks);


    }
}
