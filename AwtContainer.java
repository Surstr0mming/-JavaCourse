import java.awt.*;
import java.awt.event.*;

public class AwtContainer {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private Label msglabel;

    public AwtContainer(){
        prepareGUI();
    }

    public static void main(String[] args){
        AwtContainer awtContainerDemo = new AwtContainer();
        awtContainerDemo.showFrameDemo();
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
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        msglabel = new Label();
        msglabel.setAlignment(Label.CENTER);
        msglabel.setText("frame");

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showFrameDemo(){
        headerLabel.setText("Container in action: Frame");

        final Frame frame = new Frame();
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.add(msglabel);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                frame.dispose();
            }
        });
        Button okButton = new Button("Open a Frame");

        okButton.addActionListener(e -> {
            statusLabel.setText("A Frame shown to the user.");
            frame.setVisible(true);
        });
        controlPanel.add(okButton);

        mainFrame.setVisible(true);
    }
}