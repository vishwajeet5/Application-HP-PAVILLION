public class intefaces {
    public static void main(String args[]){
        // Queen q = new Queen();
        // q.moves();

        Bear b = new Bear();
        b.eat();
    }
}

interface Herbivore{
    void eat();
}
interface Carnivore{
    void eat();
}
class Bear implements Herbivore, Carnivore{    //Multiple inheritace
    public void eat(){
        System.out.println("Eats grass as well as meat");
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonals(in all four direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("(up, down, left, right, diagonals)by 1 step four direction");
    }
}