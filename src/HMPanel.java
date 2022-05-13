import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HMPanel extends JPanel { // a BreakoutPanel IS-A JPanel

    public static final int PANEL_WIDTH = 800;
    public static final int PANEL_HEIGHT = 600;

    private Image background;
    private Font letterFont;

    public ArrayList<Letters> wordBank;

    public HMPanel() {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        wordBank = new ArrayList<Letters>();

    }


}