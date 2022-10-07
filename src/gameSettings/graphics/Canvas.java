package gameSettings.graphics;

import gameSettings.createGame.Game;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JLabel {

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;

        int botsWindowWidth = 120;
        int bots = 6;
        int spaceAround = (Game.getWindow().WIDTH - (bots * botsWindowWidth)) / (bots + 1);

        graphics2D.setColor(Color.YELLOW);


        for (int i = 0; i < bots; i++) {
            int spaceBetween = ((i + 1) * spaceAround) + (i * botsWindowWidth);

            graphics2D.setColor(Color.YELLOW);
            graphics2D.fillRect(spaceBetween, 400, botsWindowWidth, 130);
            graphics2D.setColor(Color.BLACK);
            graphics2D.drawRect(spaceBetween, 400, botsWindowWidth, 130);
        }
    }
}