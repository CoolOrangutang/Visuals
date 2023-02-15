import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Locale;

public class ClockFace extends JPanel {
    //attributes

    private int size;
    private int middle;

    private int cirkSize;

    final double angle = (int) 2*Math.PI/12;
    private int dx,dy;

    LocalTime time;

    //Contrucktor

    public ClockFace(int num){
        this.size = num;
        this.middle = size/2;
        this.setBackground(Color.pink);
        this.setSize(new Dimension(size,size));

    }

    //Methods
    //paints the circle
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        time = LocalTime.now();

        face(g);
        drawnum(g);
        drawHour(g);
        drawMinute(g);
        drawSecond(g);

        repaint();
    }

    //get/set

    public void face(Graphics g){

    int x = (int) (size*0.1);
    int y = x;

    g.setColor(Color.white);
    cirkSize= size-x*2;
    g.fillOval(x,y,size-x*2,size-x*2);
    }

    public void drawnum(Graphics g){
       int dist = (int) (cirkSize*0.9)/2;


       for (int i = 1; i <= 12; i++){
           double v = angle*i;

           dx = (int) (dist*Math.sin(v));
           dy = (int) (dist*Math.cos(v));

           g.setColor(Color.pink);
           g.drawString(String.valueOf(i), middle+dx, middle-dy);
           //g.fillOval(middle+dx,middle+dy,10,10);


       }
    }

    public void drawHour(Graphics g){

            int hour= time.getHour();
            System.out.println(hour);
            double v = ((2*Math.PI)/12)*hour;
            int dist = (int) (size*0.25);

        int posX = (int) (dist * Math.sin(v));
        int posY = (int) (dist * Math.cos(v));
        posX = middle+posX;
        posY = middle-posY;

        g.drawLine(middle, middle, posX, posY);
    }

    public void drawMinute(Graphics g){

        int minute= time.getMinute();
        System.out.println(minute);
        double v = ((2*Math.PI)/60)*minute;
        int dist = (int) (size*0.3);

        int posX = (int) (dist * Math.sin(v));
        int posY = (int) (dist * Math.cos(v));
        posX = middle+posX;
        posY = middle-posY;

        g.drawLine(middle, middle, posX, posY);
    }

    public void drawSecond(Graphics g){

        int second= time.getSecond();
        System.out.println(second);
        double v = ((2*Math.PI)/60)*second;
        int dist = (int) (size*0.4);

        int posX = (int) (dist * Math.sin(v));
        int posY = (int) (dist * Math.cos(v));
        posX = middle+posX;
        posY = middle-posY;

        g.drawLine(middle, middle, posX, posY);
    }
}


