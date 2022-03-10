										Missing Header

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField TF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 929, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(142, 95, 562, 233);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Result = new JLabel("");
		Result.setBounds(331, 73, 162, 14);
		panel.add(Result);
		
		TF = new JTextField();
		TF.setBounds(201, 73, 86, 20);
		panel.add(TF);
		TF.setColumns(10);
		
		JLabel LB = new JLabel("Enter an integer:");
		LB.setBounds(95, 76, 96, 14);
		panel.add(LB);
		
		JButton Submit = new JButton("Check");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = TF.getText();
				
				int num = Integer.parseInt(msg);
					
				
				if (num % 3 >= 1) 
				{Result.setText("Integer is not divisble by 3");
				}
				else 
				{Result.setText("Integer is divisible by 3");
				};
				
			}});
		Submit.setBounds(198, 104, 89, 23);
		panel.add(Submit);}}
		
		
		
