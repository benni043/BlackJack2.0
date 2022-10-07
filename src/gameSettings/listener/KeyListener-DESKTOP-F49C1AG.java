package gameSettings.listener;



import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {

    public static boolean isMoveFinished = false;
    public static boolean newMove = false;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            isMoveFinished = true;
            System.out.println("enter");
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            newMove = true;
            System.out.println("space");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
