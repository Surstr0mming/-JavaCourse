import java.awt.*;
public class Checkbox {
    Checkbox(){
        Frame checkB_f= new Frame("Checkbox");
        java.awt.Checkbox ckbox1 = new java.awt.Checkbox("Yes", true);
        ckbox1.setBounds(100,100, 60,60);
        java.awt.Checkbox ckbox2 = new java.awt.Checkbox("No");
        ckbox2.setBounds(100,150, 60,60);
        checkB_f.add(ckbox1);
        checkB_f.add(ckbox2);
        checkB_f.setSize(400,400);
        checkB_f.setLayout(null);
        checkB_f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Checkbox();
    }
}   
  
