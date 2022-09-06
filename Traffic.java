import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Traffic.class" height ="400" width ="500"></applet>*/

public class Traffic extends Applet implements ItemListener
{
    String msg;
    Checkbox r,y,g;
    CheckboxGroup cbg;
    
    public void init()
    {
        cbg = new CheckboxGroup();
        r = new Checkbox("STOP",cbg,false);
        y = new Checkbox("READY",cbg,false);
        g = new Checkbox("GO",cbg,false);
        
        add(r);
        add(y);
        add(g);
        r.addItemListener(this);
        y.addItemListener(this);
        g.addItemListener(this);
        
        setLayout(new FlowLayout());
        setVisible(true);
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    
    public void paint(Graphics g)
    {
        g.drawOval(140,80,50,50);
        g.drawOval(140,160,50,50);
        g.drawOval(140,240,50,50);
        try
        {
            msg = cbg.getSelectedCheckbox().getLabel();   
        }
        catch(Exception e)
        {
            System.out.println("Select one option");
        }
        
        if(msg=="STOP")
        {
            g.setColor(Color.red);
            g.fillOval(140,80,50,50);    
            
        }
        if(msg=="READY")
        {
            g.setColor(Color.yellow);
            g.fillOval(140,160,50,50);    
            
        }
        if(msg=="GO")
        {
            g.setColor(Color.green);
            g.fillOval(140,240,50,50);    
            
        }
    }
}

