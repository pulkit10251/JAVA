package OOPS;

abstract class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    int a = 20;
    abstract void run();
    public static void hello(){
        System.out.println("HOLA");
    }
    public final void changeGear(){
        System.out.println("Gear Changed");
    }
}


class Honda extends Bike{

    @Override
    void run() {
        System.out.println("running honda");
    }


}

public class Abstract {
    public static void main(String[] args) {
        Honda h = new Honda();
        System.out.println(h.a);
        h.run();

    }
}
