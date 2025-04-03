package EX_14;

public class Lab139 {

    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3="Hello";

        String S4=new String("Hello");
        String S5=new String("Hello");
        String S6=new String("hello");


        System.out.println(s1==S4);
        System.out.println(s1==S5);
        System.out.println(s1==S6);
        System.out.println(s1==s2);
        System.out.println(s3==S4);

        System.out.println(s1.equals(S4));
        System.out.println(s1.equalsIgnoreCase(S6));


    }
}
