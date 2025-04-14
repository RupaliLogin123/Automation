package EX_17;

public class Lab172_Constructor {
    public static void main(String[] args) {


        Baby b1 = new Baby();
        b1.sleep();
    }
}
class Baby{
    void sleep ()
    {
        System.out.println("Baby sleep");
    }
    void eat()
    {
        System.out.println("Baby eat");
    }
    void cry()
    {
        System.out.println("Baby cry");
    }
    Baby()
    {
        System.out.println("Baby constructor");
    }
}
