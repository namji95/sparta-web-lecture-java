package Third.inter;

public class Main1 extends D implements C {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    void d() {
        super.d();
    }

    public static void main(String[] args) {
        Main1 main = new Main1();
        main.a();
        main.b();
        main.d();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {
}

class D {
    void d() {
        System.out.println("D");
    }
}