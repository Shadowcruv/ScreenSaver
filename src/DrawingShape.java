import java.awt.*;

public class DrawingShape {
    public Graphics fet;
    public DrawingShape(){

      }
    public void draw(Graphics g){
       g.setColor(Color.BLUE);
       g.drawRect(200,300,150,300);
       // g.drawOval(200,300,150,300);
        //g.drawRoundRect(200,300,150,300,30,30);
    }

}
