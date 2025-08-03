package OOPs;

class pen{
    String colour;
    int price;

    public void write(){
        System.out.println("writing....");
    }
    public void printColor(){
        System.out.println(this.colour);
    }
}


public class oops {
   public static void main(String[] args) {
    pen p =new pen();
    p.colour = "blue";
    p.price = 20;
    System.out.println(p.price);
    p.printColor();
    p.write();
   }   
}
