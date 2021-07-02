import java.awt.*;
import java.applet.*;

public class LayoutExample extends Applet 
{
    Button okButton1;
    Button okButton2;
    Button okButton3;
    Button okButton4;
    Button okButton5;
    
    public void init(){
        // sets the LayoutManager to BorderLayout
        setLayout(new BorderLayout());
        okButton1 = new Button("Centered Button");
        okButton2 = new Button("Cold North");
        okButton3 = new Button("Go West");
        okButton4 = new Button("At East");
        okButton5 = new Button("Hot South");
        // always says where the component should be placed when adding
        // Options are center,East,West,Nort and South
        add(okButton1,"Center");
        add(okButton2,"North");
        add(okButton3,"West");
        add(okButton4,"East");
        add(okButton5,"South");
    }
} 