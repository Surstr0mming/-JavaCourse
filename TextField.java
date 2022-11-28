import java.awt.*;
class TextField {
    public static void main(String args[]){
        Frame TextF_f= new Frame("TextField");
        java.awt.TextField text1,text2;
        text1=new java.awt.TextField("Enter few words");
        text1.setBounds(60,100, 230,40);
        text2=new java.awt.TextField("");
        text2.setBounds(60,150, 230,40);
        TextF_f.add(text1);
        TextF_f.add(text2);
        TextF_f.setSize(500,500);
        TextF_f.setLayout(null);
        TextF_f.setVisible(true);
    }
} 