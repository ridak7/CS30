									This file should be removed from your final product

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField disp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 659, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox grd = new JComboBox();
		grd.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		grd.setBounds(124, 123, 70, 25);
		frame.getContentPane().add(grd);
		
		JLabel Grade = new JLabel("Grade:");
		Grade.setBounds(23, 123, 67, 25);
		frame.getContentPane().add(Grade);
		
		JComboBox school = new JComboBox();
		school.setModel(new DefaultComboBoxModel(new String[] {"Crescent Heights", "Forest Lawn", "Defenbaker", "Robert Thirsk"}));
		school.setBounds(91, 181, 127, 25);
		frame.getContentPane().add(school);
		
		JLabel lblNewLabel_2 = new JLabel("School:");
		lblNewLabel_2.setBounds(23, 179, 61, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name:");
		txtFirstName.setBounds(21, 44, 127, 20);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setColumns(10);
		txtLastName.setBounds(22, 78, 127, 20);
		frame.getContentPane().add(txtLastName);
		
		disp = new JTextField();
		disp.setBounds(23, 237, 356, 141);
		frame.getContentPane().add(disp);
		disp.setColumns(10);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Grade = " ";
				String Fn = txtFirstName.getText();
				String Ln = txtLastName.getText();
				String School = " ";
				
				if(grd.getSelectedItem().equals("10"))
				{
					Grade = "10";
				}
				else if(grd.getSelectedItem().equals("11"))
				{
					Grade = "11";
				}
				else if(grd.getSelectedItem().equals("12"))
				{
					Grade = "12";
				}
				
				if(school.getSelectedItem().equals("Crescent Heights"))
				{
					School = "Crescent Heights";
				}
				else if(school.getSelectedItem().equals("Forest Lawn"))
				{
					School = "Forest Lawn";
				}
				else if(school.getSelectedItem().equals("Defenbaker"))
				{
					School = "Defenbaker";
				}
				else if(school.getSelectedItem().equals("Robert Thirsk"))
				{
					School = "Robert Thirsk";
				}
				
				disp.setText(Fn + " " + Ln + " " + Grade + " " + School);
			}
		});
		Submit.setBounds(290, 43, 89, 166);
		frame.getContentPane().add(Submit);
		

	}
}
