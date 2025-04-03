package EX_14;

import org.w3c.dom.ls.LSOutput;

public class Lab144_StringBuilder {

    public static void main(String[] args) {
        String S1= "Rupali" ;
        String S2=  "Rupali" ;

        StringBuffer S3= new StringBuffer("Rupali") ;
        StringBuilder S4= new StringBuilder("Rupali") ;

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S4);
    }
}
