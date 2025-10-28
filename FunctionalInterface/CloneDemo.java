package FunctionalInterface;

class Prototype implements Cloneable {
    String model = "Prototype Object";
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype();
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Cloned: " + p2.model);
    }
}