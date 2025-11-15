package OOPs;

abstract class Animal {
    abstract void sound();

    void sleep(){
        System.out.println("sleeping....");
    }
}
class Dog extends  Animal{
    void sound(){
        System.out.println("Bark...");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}