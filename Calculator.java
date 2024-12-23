import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
        JFrame frame;
        JTextField textField;
        JButton[] numberButtons = new JButton[10];
        JButton[] functiButtons = new JButton[8];
        JButton addButton , subButton , mulButton , diButton ;
        JButton deButton , eqButton , delButton , clrButton ;
        JPanel panel;

        Font myFont = new Font("ink Free" , Font.BOLD,30);
        double 

       Calculator(){

        }
    public static void main(String[] args){
        Calculator calc = new Calculator();

        // TODO: 
        System.out.println("Hello this is my calaulator");
    }
    @Override 
     public void actionPerformed(ActionEvent e){
        // TODO: Auto-....

     }

}