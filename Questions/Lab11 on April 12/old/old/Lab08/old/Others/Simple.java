import java.applet.Applet;
import java.awt.Graphics;

//No need to extend JApplet, since we don't add any components;
//we just paint.
public class Simple extends Applet{
    String msg;
    public void init(){
        msg="Initialization Complete! ";
    }
    public void start() {
        likhaBodlao("Starting... ");
        while(true){
            int n=(int)(Math.random()*9000);
            likhaBodlao(" "+n);
            try{
                Thread.sleep(500);        
            }catch(Exception e){
                System.out.println("Can't sleep");
            }
        }
    }
    private void likhaBodlao(String newWord) {
        msg+=newWord;
        repaint();
    }
    
    public void paint(Graphics g) {
        int lastX = getWidth() - 1;
        int lastY = getHeight() - 1;
        //Draw a Rectangle around the applet's display area.
        g.drawRect(0, 0, lastX, lastY);
        
        //Draw the current string inside the rectangle.
        g.drawString(msg, 5, 15);
    }
}
