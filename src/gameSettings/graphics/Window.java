package gameSettings.graphics;

import gameSettings.listener.KeyListener;

import javax.swing.*;
import java.awt.*;

public class Window {

    public final int HEIGHT = 780;
    public final int WIDTH = 1000;

    private final Canvas canvas;
    private final JFrame jFrame;

    public Window() {
        JLabel jLabel = new JLabel(new ImageIcon("/resources/nice.jpg"));

        jFrame = new JFrame("BlackJack 2.0");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.requestFocus();

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setVisible(true);

        jFrame.add(jLabel);
        jFrame.add(canvas);
        jFrame.addKeyListener(new KeyListener());
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
