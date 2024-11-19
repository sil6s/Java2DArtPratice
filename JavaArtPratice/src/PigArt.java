import javax.swing.*;
import java.awt.*;

public class PigArt extends JPanel {
    private static final int CANVAS_WIDTH = 800;
    private static final int CANVAS_HEIGHT = 600;

    public PigArt() {
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(255, 192, 203));
        g2d.fillOval(300, 200, 200, 200); // Head

        g2d.fillOval(240, 150, 80, 80); // Left ear
        g2d.fillOval(480, 150, 80, 80); // Right ear

        g2d.setColor(Color.WHITE);
        g2d.fillOval(350, 250, 40, 40); // Left eye
        g2d.fillOval(410, 250, 40, 40); // Right eye

        g2d.setColor(Color.BLACK);
        g2d.fillOval(365, 265, 15, 15); // Left pupil
        g2d.fillOval(425, 265, 15, 15); // Right pupil

        g2d.setColor(Color.PINK);
        g2d.fillOval(370, 320, 60, 40); // Snout

        g2d.setColor(Color.BLACK);
        g2d.fillOval(385, 330, 10, 10); // Left nostril
        g2d.fillOval(405, 330, 10, 10); // Right nostril

        g2d.drawArc(350, 370, 100, 50, 0, -180); // Mouth
        g2d.setColor(Color.RED); // Set text color
        g2d.setFont(new Font("Arial", Font.BOLD, 24)); // Set font
        g2d.drawString("Silas's Pig Attempt", 280, 50);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Silas's Pig Art");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PigArt artPanel = new PigArt();

        frame.add(artPanel);

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
// Author: Silas Curry for Programming II
