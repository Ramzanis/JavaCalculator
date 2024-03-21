import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UI implements ActionListener{
	
	JFrame frame;
	JButton b1, b2, b3, b4;
	
	public UI() {
        frame = new JFrame("Calculator");
        b1 = new JButton("Click");
        b2 = new JButton("ffs");
        b3 = new JButton("31");
        b4 = new JButton("22");
        
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
	        frame.setSize(400, 500);
	        frame.setLocationRelativeTo(null);
	        frame.add(b1);
	        frame.add(b2);
	        frame.add(b3);
	        frame.add(b4);
	        frame.setVisible(true);
	        
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
}