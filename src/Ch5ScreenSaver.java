import javax.swing.*;
import java.util.Scanner;

public class Ch5ScreenSaver {
    private DrawableBoard canvas;
    public Ch5ScreenSaver(){

    }
    public void start(){
        DrawingShape shape1 = new DrawingShape();
        //DrawingShape shape2 = new DrawingShape();
       // DrawingShape shape3 = new DrawingShape();

        canvas.addShape(shape1);
        //canvas.addShape(shape2);
        //canvas.addShape(shape3);
        canvas.setVisible(true);
        canvas.start();
    }

    public static void main(String []args){
        Scanner scanner =new Scanner(System.in);
        int age,sum =0;
        age = scanner.nextInt();
        while(age >0){ System.out.print(sum=sum +age);}
        System.out.println("its okay");


    }
}
