import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion {

	private JFrame frame;
	private JTextField disp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel LB = new JLabel("Which conversion would you like to use");
		LB.setBounds(10, 21, 246, 14);
		frame.getContentPane().add(LB);
		
		disp = new JTextField();
		disp.setBounds(10, 92, 209, 73);
		frame.getContentPane().add(disp);
		disp.setColumns(10);
		
		JComboBox selec = new JComboBox();
		selec.setModel(new DefaultComboBoxModel(new String[] {"Inches -> Centimeters", "Feet -> Meters", "Gallons -> Liters", "Pounds -> Kilograms"}));
		selec.setBounds(10, 46, 209, 22);
		frame.getContentPane().add(selec);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Result = " ";
				if (selec.getSelectedItem().equals("Inches -> Centimeters"))
				{
					Result = "1 Inch is equal to 2.54 centimeters";
				}
				else if (selec.getSelectedItem().equals("Feet -> Meters"))
				{
					Result = "1 Foot is equal to 0.3048 meters";
				}
				else if (selec.getSelectedItem().equals("Gallons -> Liters"))
				{
					Result = "1 Gallon is equal to 4.5461 liters";
				}
				else if (selec.getSelectedItem().equals("Pounds -> Kilograms"))
				{
					Result = "1 Pound is equal to 0.4536 kilograms";
				}
				disp.setText(Result);
			}
		});
		submit.setBounds(275, 23, 89, 23);
		frame.getContentPane().add(submit);
		
		
		}
	}

