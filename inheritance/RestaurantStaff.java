
interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}


class Waiter extends Person implements Worker {
    private int experience;
    public Waiter(String name, int id, int experience) {
        super(name, id);
        this.experience = experience;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Experience: " + experience + " years");
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers and taking orders.");
    }
}


class Chef extends Person implements Worker {
    private String specialty;
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Specialty: " + specialty);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + ".");
    }
}


class RestaurantStaff {
    public static void main(String[] args) {
        Waiter w = new Waiter("Alice", 101, 5);
        Chef c = new Chef("Bob", 201, "Italian Cuisine");
        w.display();
        w.performDuties();
        System.out.println();
        c.display();
        c.performDuties();
    }
}