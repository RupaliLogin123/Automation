package EX_18.MultilevelInheritance;

public class Lab182 {

    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.Bhk1();
        gf.home();

        Father f = new Father();
        f.home();
        f.Bhk2();
        f.Bhk1();
        f.home();

        Son S= new Son();
        S.home();
        S.Bhk2();
        S.Bhk1();
        S.home();
        S.bhk3();
        S.home();


    }

}
