import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


class Color1 implements ChangeListener {
    JFrame window;
    JColorChooser colorChooser ;
    JPanel colorChooserPanel, colorPanel;

    public static void main(String[] args) {
        new Color1();

    }

    public Color1(){
        /*
        код для виклику вікна, та зображення різних кольорових моделей в цьомі вікно
         */
        window = new JFrame();
        window.setSize(1200, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(java.awt.Color.black);
        window.setLayout(null);

        colorChooserPanel = new JPanel();
        colorChooserPanel.setBounds(50,  50, 600, 300);
        colorChooserPanel.setBackground(java.awt.Color.BLACK );
        window.add(colorChooserPanel);

        colorChooser = new JColorChooser();
        colorChooser.getSelectionModel().addChangeListener(this);

        colorChooser.setPreviewPanel(new JPanel());

        colorChooserPanel.add(colorChooser);

        colorPanel = new JPanel();
        colorPanel.setBounds(200, 420, 400, 100);
        colorPanel.setBackground(java.awt.Color.white);
        window.add(colorPanel);

        window.setVisible(true);


    }

    public void stateChanged(ChangeEvent e){
        /*
        код для відображення кольору на окремому квадраті, щоб можна було побачити вживу цей колір
        також виведення компонентів цього кольору(прописано тільки для Rgb, но інші аналогічно робляться,
        тому немає сенсу прописувати ідентичний код)
        */

        java.awt.Color newColor = colorChooser.getColor();
        colorPanel.setBackground(newColor);
        System.out.println("red: " + newColor.getRed() + "\n" + "green: " + newColor.getGreen() + "\n" +
                "blue: " + newColor.getBlue() + "\n" + "alpha: " + newColor.getAlpha() + "\n");

        JButton b = new JButton();
        b.setBounds(450,350,200,50);
        window.add(b);
        b.setBackground(newColor);
        b.setVisible(true);

    }


}
