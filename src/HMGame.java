import javax.swing.*;
import java.awt.*;

public class HMGame extends JFrame {

    public HMGame() {
        super("Hangman 1.0");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new HMPanel());
        String s = JOptionPane.showInputDialog(("What is your name"));
        JTextField jtf = new JTextField();
        jtf.setText(s);
        this.add(jtf);
        this.pack(); // all components have been added -- shrink frame to fit
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width / 2 - getWidth() / 2;
        int y = screenSize.height / 2 - getHeight() / 2;
        this.setLocation(x, y); // positions the game window in center of screen
    }
}
