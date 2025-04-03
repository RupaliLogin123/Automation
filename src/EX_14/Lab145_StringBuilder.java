package EX_14;

public class Lab145_StringBuilder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Rupali") ;
        s1.append(" Pandagre") ;
        System.out.println(s1);
        s1.delete(0,6);
        System.out.println(s1);
        s1.insert(0,"Rupali");
        System.out.println(s1);;
        s1.replace(0,5,"Rupali");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);



    }
}
