package assesment;
abstract class Ani {
 abstract void sound();
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Ani {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abst {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();  
        d.sleep();  
    }
}
