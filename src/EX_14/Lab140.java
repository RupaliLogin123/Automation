package EX_14;

import com.sun.security.jgss.GSSUtil;

import java.util.function.DoubleToIntFunction;

public class Lab140 {
    public static void main(String[] args) {
        String s1 = "Rupali";
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        System.out.println(s1.charAt(8));
        System.out.println(s1.concat("Pandagre"));
        System.out.println(s1.contains("pa"));
        System.out.println(s1.equals("Rupali"));
        System.out.println(s1.indexOf("R"));//Gives us first ch
        System.out.println(s1.replace("a", "o"));
        //String S2="rupali.pandagre@alight.com"
        ;
        //String[] split=S2.split(".");
        //System.out.println(split[0]);
        // System.out.println(split[1]);
        //System.out.println(split[2]);
    }
}
