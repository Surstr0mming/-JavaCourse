import java.awt.*;
import java.awt.event.*;

public class AwtControl {

    private Frame mainFrame;
    private Label headerLabel;
    private Panel controlPanel;

    public AwtControl(){
        prepareGUI();
    }

    public static void main(String[] args){
        AwtControl awtControl = new AwtControl();
        awtControl.showDialogDemo();
    }

    private void prepareGUI(){
        mainFrame = new Frame("Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        Label statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showDialogDemo(){
        headerLabel.setText("Control in action: Dialog");
        Button showAboutDialogButton = new Button("Show About Dialog");
        showAboutDialogButton.addActionListener(e -> {
            AboutDialog aboutDialog = new AboutDialog(mainFrame);
            aboutDialog.setVisible(true);
        });

        controlPanel.add(showAboutDialogButton);
        mainFrame.setVisible(true);
    }

    static class AboutDialog extends Dialog {
        public AboutDialog(Frame parent){
            super(parent, true);
            setBackground(Color.gray);
            setLayout(new BorderLayout());
            Panel panel = new Panel();
            panel.add(new Button("Close"));
            add("South", panel);
            setSize(200,200);

            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    dispose();
                }
            });
        }

        public boolean action(Event evt, Object arg){
            if(arg.equals("Close")){
                dispose();
                return true;
            }
            return false;
        }

        public void paint(Graphics g){
            g.setColor(Color.white);
            g.drawString("Point", 25,70 );
            g.drawString("Version 1.0", 60, 90);
        }
    }
}