public class inheritance {
    public static void main(String args[]){
        // Fish shark = new Fish();
        // shark.eats();

        // Dog bruno = new Dog();
        // bruno.eats();
        // bruno.breed = "German";
        // bruno.legs = 4;
        // System.out.println(bruno.legs);
    }
}

class Animal{  // Base class
    String color;
    void eats(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}

class Mammal extends Animal{
    int legs;
    void walks(){
        System.out.println("Walks");
    }
}

class Dog extends Mammal{
    String breed;
} 