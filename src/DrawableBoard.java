import javax.swing.*;
import java.awt.*;
public class DrawableBoard {
   private JFrame myWindow;
   private Boolean value;
   public DrawingShape kota;


    public DrawableBoard(){
       myWindow = new JFrame();
    }
    public void addShape(DrawingShape shape){
          kota = shape;
    }
    public void setBackground(java.awt.Color Color){

    }
    public void setDelayTime(double delay){

    }
    public void setMovement(Movement type){

    }
    public void setVisible(Boolean state){
       JFrame myWindow = new JFrame();
       myWindow.setTitle("Screensaver");
       myWindow.setSize(1700,900);
       myWindow.setVisible(value);
       value = state;
       Container contentPane = myWindow.getContentPane();
       Graphics nice = contentPane.getGraphics();
        kota.draw(nice);
    }
    public void start(){
        addShape(kota);
        //setVisible(value);

    }

}
