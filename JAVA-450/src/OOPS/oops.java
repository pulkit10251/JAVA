package OOPS;


class Parent {
    String name;

    // A method which prints the
    // signature of the parent class
    void method()
    {
        System.out.println("Method from Parent");
    }
}

// Child class
class Child extends Parent {
    int id;

    // Overriding the parent method
    // to print the signature of the
    // child class
    @Override void method()
    {
        System.out.println("Method from Child");
    }
}
public class oops {
    public static void main(String[] args) {
        Parent p = new Child();
        p.method();
        p.name = "HOLLDA";
        System.out.println(p.name);

        Child c = (Child)p;

        c.method();
        c.id = 1234;
        System.out.println(c.id);
        c.name = "HOLAAAA";
        System.out.println(c.name);
    }
}
