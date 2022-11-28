import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class FrameWin extends Frame implements WindowListener {
    public FrameWin(String FrameTitle){
        super(FrameTitle);
        setLayout(new FlowLayout());

        //Create two label
        Label L1 = new Label("There are two label");
        Label L2 = new Label("both contain text");

        //Add Label to the
        add(L1);
        add(L2);

        //Set Size of the Frame
        setSize(400, 300);
        setLocation(100,100);

        //Register with the Listener
        addWindowListener(this);

    }
    //Implement the Listeners
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        this.dispose();
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}