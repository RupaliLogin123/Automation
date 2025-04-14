package EX_14;

public class Lab146_StringBuffer {
    public static void main(String[] args) {
        StringBuffer S1=new StringBuffer("Rupali");
        System.out.println(S1);
        S1.append(" HELLO");
        System.out.println(S1);
        S1.insert(0,"Welcome ");
        System.out.println(S1);
        S1.replace(0,5,"Welcome ");

        System.out.println(S1.capacity());
        System.out.println(S1.length());

    }
}
