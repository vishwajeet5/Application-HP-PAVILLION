import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    SnakeGame() {
        super("Snake Game");
        add(new Board());
        pack();
        setSize(300, 300);
        setLocationRelativeTo(null);

        setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new SnakeGame();

    }
}
