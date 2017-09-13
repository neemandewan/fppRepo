package assignment5.problem1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class StringUtility extends JFrame implements ActionListener {
	
	private static final int FRAME_WIDTH    = 500;
    private static final int FRAME_HEIGHT   = 250;
    private static final int FRAME_X_ORIGIN = 450;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 150;
    private static final int BUTTON_HEIGHT = 30;
    private static final int TEXTFIELD_WIDTH  = 200;
    private static final int TEXTFIELD_HEIGHT = 30;
    
    private JTextField input, output;
    private JLabel l1, l2;
    private JButton countLetters, reverseLetters, removeDuplicates;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUtility su = new StringUtility();
		su.setVisible(true);
	}
	
	public StringUtility() {
		// TODO Auto-generated constructor stub
		
		Container contentPane = getContentPane();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("String Utility");
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        
        countLetters = new JButton("Count Letters");
        countLetters.setBounds(40, 40, BUTTON_WIDTH, BUTTON_HEIGHT);
        
        reverseLetters = new JButton("Reverse Letters");
        reverseLetters.setBounds(40, 90, BUTTON_WIDTH, BUTTON_HEIGHT);
        
        removeDuplicates = new JButton("Remove Duplicates");
        removeDuplicates.setBounds(40, 140, BUTTON_WIDTH, BUTTON_HEIGHT);
        
        input  = new JTextField();
        input.setBounds(250, 65, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        output  = new JTextField();
        output.setBounds(250, 120, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        l1 = new JLabel();
        l1.setText("Input");
        l1.setBounds(250, 45, TEXTFIELD_WIDTH, 20);
        
        l2 = new JLabel();
        l2.setText("Output");
        l2.setBounds(250, 100, TEXTFIELD_WIDTH, 20);
        
        contentPane.add(countLetters);
		contentPane.add(reverseLetters);
		contentPane.add(removeDuplicates);
		contentPane.add(input);
		contentPane.add(output);
		contentPane.add(l1);
		contentPane.add(l2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
