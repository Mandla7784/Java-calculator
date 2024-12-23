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
        double num1 = 0 , num2 = 0 , results = 0 ;
        char operator;


       Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420 , 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50 , 25 , 300 , 50);
        textField.setFont(myFont);
        textField.setEditable(false);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton= new JButton("*");
        diButton= new JButton("/");
        clrButton = new JButton("clear");
        deButton = new JButton("DEC");
        delButton = new JButton("Delete");

        functiButtons[0] = addButton;
        functiButtons[1]= subButton;
        functiButtons[2] = mulButton;
        functiButtons[3] = diButton;
        functiButtons[4] = diButton;
        functiButtons[5] = clrButton;
        functiButtons[6] = deButton;
        functiButtons[7] = delButton;

        for(int i = 0 ; i < 8 ; i ++){
            functiButtons[i].addActionListener(this);
            functiButtons[i].setFont(myFont);
            functiButtons[i].setFocusable(false);

        }
        
        for(int i = 0 ; i < 10 ; i ++){
            numberButtons[i] = new JButton(String.valueOf(i));
          numberButtons[i].setFont(myFont);
          numberButtons[i].addActionListener(this);
          numberButtons[i].setFocusable(false);

          
        }

        delButton.setBounds(50 , 430 , 145 , 50);
        clrButton.setBounds(205 , 430 , 245 , 50 );
        frame.add(delButton );
        frame.add(clrButton);

        frame.add(textField);
        frame.setVisible(true);

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