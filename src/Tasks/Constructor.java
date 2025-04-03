package Tasks;

public class Constructor {
    public static void main(String[] args) {
        Person P1=new Person();
        Person P2=new Person("Jannie",65,"A-10 ffghh",780609952);
        Person P3=new Person("Jeremy",67,"sg-10nn wwmmkkknnm, dnnn");

        System.out.println(P1.name);
        System.out.println(P1.age);
        System.out.println(P1.Address);
        System.out.println(P1.phone);




    }
}
class Person {
    String name;
    int age;
    String Address;
    long phone;
    Person(){
        System.out.println("Default Constructor"  );
    }

 Person(String name, int age, String Address, long phone)
 {
     this.name = name;
     this.age = age;

     this.phone = phone;
     this.Address= Address;
 }
 Person(String name, int age, String Address)
 {
     this.name = name;
     this.age = age;
     this.Address = Address;
 }
 void eat()
 {
     System.out.println(name + " is eating");
 }
 void sleep()
 {
     System.out.println(name+"is sleeping");
 }
 void walk()
 {
     System.out.println(name + " is walking");
 }




}
