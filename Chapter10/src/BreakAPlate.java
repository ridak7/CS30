import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.*;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon plates = new ImageIcon("..\\Chapter10\\src\\plates.gif");
		ImageIcon tiger = new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
		ImageIcon placeholder = new ImageIcon("..\\Chapter10\\src\\placeholder.gif");
		ImageIcon platesallbroken = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon platestwobroken = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon sticker = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Plates = new JLabel(new ImageIcon("..\\\\Chapter10\\\\src\\\\plates.gif"));
		Plates.setBounds(66, 11, 287, 125);
		panel.add(Plates);
		
		JLabel prize = new JLabel("");
		prize.setBounds(135, 181, 154, 55);
		panel.add(prize);
		
		JButton btnPlayAgain = new JButton("Play Game");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random num = new Random();
				int rand = num.nextInt(2);
				
				if (rand == 0) {
					Plates.setIcon(platesallbroken);
					prize.setIcon(tiger);
				}
				
				else {
					Plates.setIcon(platestwobroken);
					prize.setIcon(sticker);
				}
			}
		});
		btnPlayAgain.setBounds(152, 147, 104, 23);
		panel.add(btnPlayAgain);
		
		
	}
}
