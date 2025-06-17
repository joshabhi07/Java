public class child extends parent {

    public void m3() {
        System.out.println("Child class method m3");
    }

    public void m4() {
        System.out.println("Child class method m4");
    }

    public static void main(String[] args) {
        parent p = new child();
        p.m1(); // Calls the overridden method in the child class
        p.m2(); // Calls the overridden method in the child class
        ((child) p).m3(); // Calls the child class method m3
        ((child) p).m4(); // Calls the child class method m4
    }
    
}
