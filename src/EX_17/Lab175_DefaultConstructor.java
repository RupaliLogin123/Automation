package EX_17;

public class Lab175_DefaultConstructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name="Tesla";
        System.out.println(c1.name);
        System.out.println(c1.Model);
        System.out.println(c1.Year);

        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.Model);
        System.out.println(c2.Year);
    }
}
class Car{
    String name;
    int Year;
    String Model;

    Car()
    {
        name="Unknown";
        Year=2018;
        Model="XXXX";
    }
}