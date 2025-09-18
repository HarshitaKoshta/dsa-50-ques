package OOPs;

class Animal{
    void sound(){
        System.out.println("makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("barks");
    }
}

public class Main {
      public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
      }
}
