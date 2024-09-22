public class abstraction {
    public static void main(String args[]){
        Horse h = new Horse();
        h.walk();
        System.out.println(h.color);  //Default color

        Chicken c = new Chicken();
        c.walk();
    }
}

abstract class Animal{
    String color;
    Animal() {
        color = "Brown";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();   //Non Abstract Method
}
class Horse extends Animal{
    void changeColor(){
        color = "Dark brown";
    }
    void walk(){    //Abstract Method
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "Rad black";
    }
    void walk(){    //Abstract Method
        System.out.println("Walks on 2 legs");
    }
}
