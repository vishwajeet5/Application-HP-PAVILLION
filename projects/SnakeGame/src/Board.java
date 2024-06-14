import javax.swing.*;
import java.awt.*;



public class Board extends JPanel {

    private Image apple;
    private Image head;
    private Image dot;

    private int dots;
    Board() {
        setBackground(Color.BLACK);
        setFocusable(true);

        loadImages();
        initGame();
    }

    public void loadImages(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/snakedot.jpg"));
        dot = i1.getImage();

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icon/snakeapple.jpg"));
        apple = i2.getImage();

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/snakehead.jpg"));
        head =i3.getImage();


    }

    public void initGame(){
        dots = 3;

        for(int i = 3; i<dots; i++){

        }
    }

}
