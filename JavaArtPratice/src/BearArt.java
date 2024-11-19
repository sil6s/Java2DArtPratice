import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BearArt extends JPanel {
    private static final int CANVAS_WIDTH = 800;
    private static final int CANVAS_HEIGHT = 600;

    public BearArt() {
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Head
        g2d.setColor(Color.BLACK);
        g2d.fillOval(200, 100, 400, 400); // Head

        // Ears
        int[] leftEarX = {200, 250, 200};
        int[] leftEarY = {150, 100, 200};
        int[] rightEarX = {600, 650, 600};
        int[] rightEarY = {150, 100, 200};
        g2d.fillPolygon(leftEarX, leftEarY, leftEarX.length);
        g2d.fillPolygon(rightEarX, rightEarY, rightEarX.length);

        // Inner Ears
        g2d.setColor(new Color(255, 182, 193)); // Light pink color for inner ears
        g2d.fillPolygon(new int[]{200, 240, 200}, new int[]{160, 120, 200}, 3);
        g2d.fillPolygon(new int[]{600, 640, 600}, new int[]{160, 120, 200}, 3);

        // Eyes
        g2d.setColor(Color.WHITE);
        g2d.fillOval(300, 200, 80, 80); // Left eye
        g2d.fillOval(420, 200, 80, 80); // Right eye

        // Pupils
        g2d.setColor(Color.BLACK);
        g2d.fillOval(320, 220, 30, 30); // Left pupil
        g2d.fillOval(440, 220, 30, 30); // Right pupil

        // Nose
        g2d.setColor(Color.BLACK);
        int[] noseX = {360, 400, 440};
        int[] noseY = {300, 350, 300};
        g2d.fillPolygon(noseX, noseY, noseX.length);

        // Mouth (smiling arc)
        g2d.drawArc(360, 350, 80, 50, 0, -180); // Mouth

        // Teeth
        g2d.setColor(Color.WHITE);
        g2d.fillRect(380, 370, 10, 20); // Left tooth
        g2d.fillRect(410, 370, 10, 20); // Right tooth

        // Whiskers
        g2d.setColor(Color.BLACK);
        g2d.drawLine(300, 340, 180, 340); // Left whisker
        g2d.drawLine(300, 360, 180, 360); // Left whisker (lower)
        g2d.drawLine(500, 340, 620, 340); // Right whisker
        g2d.drawLine(500, 360, 620, 360); // Right whisker (lower)

        g2d.setColor(Color.RED); // Set text color
        g2d.setFont(new Font("Arial", Font.BOLD, 24)); // Set font
        g2d.drawString("Silas's 2D Java Art", 280, 50);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Silas's Bear Art");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BearArt artPanel = new BearArt();

        frame.add(artPanel);

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
