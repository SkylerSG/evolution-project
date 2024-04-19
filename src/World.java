import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class World extends JPanel {
    private static final int PANEL_SIZE = 128;
    private static final int PIXEL_SIZE = 7; 

    private ArrayList<Coordinate> coordinates;

    World() {
        this.coordinates = new ArrayList<>();
        setPreferredSize(new Dimension(PANEL_SIZE * PIXEL_SIZE, PANEL_SIZE * PIXEL_SIZE));
    }

    public void update(ArrayList<Coordinate> coordinates) {
        this.coordinates = coordinates;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Coordinate coordinate : coordinates) {
            int pixelX = coordinate.x * PIXEL_SIZE;
            int pixelY = coordinate.y * PIXEL_SIZE;
            g.fillRect(pixelX, pixelY, PIXEL_SIZE, PIXEL_SIZE);
        }
    }

}
