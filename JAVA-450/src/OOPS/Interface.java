package OOPS;

interface A{
    int a = 5;
    static int cube(int a){
        return a*a*a;
    }
    void run();

    default void run1(){
        run3();
        System.out.println("Default");
    }

    private void run3(){
        System.out.println("Kutte");
    }

}

class B implements A{

    @Override
    public void run() {
        System.out.println("Hello run");
    }
}

public class Interface {

    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.a);
        b.run();
        b.run1();

        System.out.println(A.cube(5));
    }

}
