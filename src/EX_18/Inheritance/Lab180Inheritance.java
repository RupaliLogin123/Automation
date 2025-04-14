package EX_18.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Lab180Inheritance {
    public static void main(String[] args) {
       Father F1 = new Father();
       System.out.println(F1.gold);
        F1.BHK2();

        Son S1 = new Son();
        S1.BHK3();
        S1.BHK2();

       System.out.println(S1.gold);
}}
class Father{
    int gold=1000;
    void BHK2()
    {
        System.out.println("BHK2");
    }
}
class Son extends Father {
    void BHK3() {
        System.out.println("BHK3");
    }
}

