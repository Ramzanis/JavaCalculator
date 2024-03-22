import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UI implements ActionListener{
	
	private final JFrame frame;
	JTextField textField;
	JButton[] numButtons = new JButton[10];
	JButton[] funcButtons = new JButton[8];
	JButton addition,subtraction,multiply,division;
	JButton decimal, equals, delete, clear;
	JPanel panel;
	
	Font myFont = new Font("Arial", Font.BOLD, 25);
	double num1=0, num2=0, result=0; 
	char operator;

	UI() {
        frame = new JFrame("Calculator");
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
		textField.setFont(myFont);
        
    }
	
	//Method to run the GUI
	public void runUI() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

	}
		
	
	//Where the labels and frames of the GUI is implemented 
	 private void createAndShowGUI() {
	 
		 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(420, 550);
	        frame.setLocationRelativeTo(null);
	        frame.setLayout(null);
	        frame.add(textField);
	        
	        frame.setVisible(true);  
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
}