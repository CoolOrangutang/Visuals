import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        start();

    }

    static void start(){
        //basic frame setup

        int size = 512;

        JFrame myFrame = new JFrame("A clock");

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setPreferredSize(new Dimension(size,size));
        //
        myFrame.add(new ClockFace(size));

        myFrame.pack();
        myFrame.setVisible(true);

    }

}