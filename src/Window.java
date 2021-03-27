import javax.swing.*;
import java.awt.*;

public class Window extends JPanel {
    public final static int windowX = 1000;
    public final static int windowY = 600;
    public final static int blockSize = 25;
    public final static int width = windowX / blockSize;
    public final static int height = windowY / blockSize;

    public static int[][] grid =
            new int[width][height];

    public Window() {
        generateGrid();
    }

    public void generateGrid() {
        for (int xpos = 0; xpos < width; xpos++) {
            for (int ypos = 0; ypos < height; ypos++) {
                double value = Math.random();
                grid[xpos][ypos] = (value > .75) ? 1 : 0;
            }
        }

        grid[0][0] = 2;
        grid[width - 1][height - 1] = 3;
    }

    public void paintComponent(Graphics g) {
        //canvas.clearRect(0, 0, windowX, windowY);
        super.paintComponent(g);
        generateMaze();
    }

    public void generateMaze() {
        Graphics canvas = getGraphics();
        setBackground(Color.WHITE);

        for (int xpos = 0; xpos < width; xpos++) {
            for (int ypos = 0; ypos < height; ypos++) {
                int currentVal = grid[xpos][ypos];
                if (currentVal > 0) {
                    if (currentVal == 1)
                        canvas.setColor(Color.black);
                    else if (currentVal == 2)
                        canvas.setColor(Color.red);
                    else
                        canvas.setColor(Color.green);

                    canvas.fillRect(xpos * blockSize, ypos * blockSize, blockSize, blockSize);
                }
            }
        }
    }
}
