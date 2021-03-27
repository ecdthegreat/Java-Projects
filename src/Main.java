import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        Window m = new Window();

        JFrame f = new JFrame("Pathfinder");

        m.setSize(Window.windowX, Window.windowY);
        f.add(m);
        f.setSize(Window.windowX, Window.windowY);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        //f.setLayout(null);
        f.setVisible(true);
    }
}