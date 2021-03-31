import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {
    public final static int windowX = 1000;
    public final static int windowY = 600;
    public final static int blockSize = 20;
    public final static int width = (windowX / blockSize) - 1;
    public final static int height = (windowY / blockSize) - 2;

    public static int[][] grid =
            new int[width][height];

    public Window() {
        generateGrid();
    }

    public void generateGrid() {
        for (int xpos = 0; xpos < width; xpos++) {
            for (int ypos = 0; ypos < height; ypos++) {
                double value = Math.random();
                grid[xpos][ypos] = (value > .70) ? 1 : 0;
            }
        }

        grid[0][0] = 2;
        grid[width - 1][height - 1] = 3;
    }

    public void paint(Graphics g) {
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

                    canvas.fillRect(
                            xpos * blockSize,
                            ypos * blockSize,
                            blockSize,
                            blockSize
                    );
                }
            }
        }
    }
}
