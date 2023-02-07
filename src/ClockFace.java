import javax.swing.*;
import java.awt.*;

public class ClockFace extends JPanel {
    //attributes

    private int size;

    //Contrucktor

    public ClockFace(int num){
        this.size = num;
        this.setBackground(Color.pink);
        this.setSize(new Dimension(size,size));
    }

    //Methods
    //paints the circle
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.white);
        g.fillOval(0,0,size,size);

    }

    //get/set


}
