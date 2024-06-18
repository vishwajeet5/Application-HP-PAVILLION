import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener {

    private Image apple;
    private Image head;
    private Image dot;

    private final int ALL_DOTS = 900;
    private final int DOT_SIZE = 10;
    private final int RANDOM_POSITION = 29;

    private int apple_x;
    private int apple_y;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean rightDirection = true;
    private boolean leftDirection = false;

    private boolean inGame = true;

    private int dots;
    private Timer timer;

    Board() {

        addKeyListener(new TAdapter());

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(300,300));
        setFocusable(true);

        loadImages();
        initGame();
    }

    public void loadImages() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/snakedot.jpg"));
        dot = i1.getImage();

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icon/snakeapple.jpg"));
        apple = i2.getImage();

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/snakehead.jpg"));
        head = i3.getImage();

    }

    public void initGame() {
        dots = 3;

        for (int i = 0; i < dots; i++) {
            y[i] = 50;
            x[i] = 50 - i * DOT_SIZE;
        }

        locateapple();

        timer = new Timer(140, this);
        timer.start();
    }

    public void locateapple() {
        int r = (int) (Math.random() * RANDOM_POSITION);
        apple_x = r * DOT_SIZE;

        r = (int) (Math.random() * RANDOM_POSITION);
        apple_y = r * DOT_SIZE;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        draw(g);
    }

    public void draw(Graphics g) {

    if(inGame){
        g.drawImage(apple, apple_x, apple_y, this);

        for (int i = 0; i < dots; i++) {
            if (i == 0) {
                g.drawImage(head, x[i], y[i], this);
            } else {
                g.drawImage(dot, x[i], y[i], this);
            }
        }

        Toolkit.getDefaultToolkit().sync();

    }else{
        gameOver(g);
    }
    }
    public void gameOver(Graphics g){
        String msg = "Game Over!";
        Font font = new Font("SAN-SERIF",Font.BOLD, 14);
        FontMetrics metrics = getFontMetrics(font);

        g.setColor(Color.WHITE);
        g.setFont(font);

        g.drawString(msg,(300 - metrics.stringWidth(msg)) / 2, 300/2);
    }

    public void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        if (leftDirection) {
            x[0] = x[0] - DOT_SIZE;
        }
        if (rightDirection) {
            x[0] = x[0] + DOT_SIZE;
        }
        if (upDirection) {
            y[0] = y[0] - DOT_SIZE;
        }
        if (downDirection) {
            y[0] = y[0] + DOT_SIZE;
        }

        x[0] += DOT_SIZE;
        y[0] += DOT_SIZE;

    }

    public void checkApple(){
        if((x[0] == apple_x) && (y[0] == apple_y)){
            dots++;
            locateapple();
        }
    }

    public void checkCollision(){
        for (int i = dots; i > 0; i--){
            if((i> 4) &&(x[0] == x[i] && y[0] == y[i])){
                inGame = false;
            } 
        }
        if (y[0] >= 300){
            inGame = false;
        }
        if (x[0] >= 300){
            inGame = false;
        }
        if (y[0] < 0){
            inGame = false;
        }
        if (x[0] < 0){
            inGame = false;
        }

        if(!inGame){
            timer.stop();
        }
    }
    public void actionPerformed(ActionEvent e) {
        if(inGame){
        checkCollision();

        checkApple();

        move();
        }

        repaint();
    }

    public class TAdapter extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }
            if (key == KeyEvent.VK_RIGHT && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }
            if (key == KeyEvent.VK_UP && (!downDirection)) {
                leftDirection = false;
                upDirection = true;
                rightDirection = false;
            }
            if (key == KeyEvent.VK_DOWN && (!upDirection)) {
                leftDirection = false;
                downDirection = true;
                rightDirection = false;
            }

        }
    }
}