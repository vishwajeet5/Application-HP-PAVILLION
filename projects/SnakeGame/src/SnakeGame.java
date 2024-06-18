import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    SnakeGame() {
        super("Snake Game");
        add(new Board());
        pack();
        
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new SnakeGame();

    }
}
