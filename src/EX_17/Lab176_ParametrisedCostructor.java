package EX_17;

public class Lab176_ParametrisedCostructor {
    public static void main(String[] args) {
        Person P1=new Person("Tejaswinni",43);
        Person P2=new Person("Mikhail",23,788937883);
        P1.eat();
        P2.eat();
        Person P3=new Person("Mikhail",23);

    }
}
class Person{
    String name;
    int age;
    long phone;
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    Person(String name, int age,long phone)
    {
        this.name=name;
        this.age=age;
        this.phone=phone;
    }  void eat(){
        System.out.println(this.name + " is eating!");
    }



}
