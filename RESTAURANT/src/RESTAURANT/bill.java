package RESTAURANT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 822, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESTAURANT BILL");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(259, 11, 387, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(105, 107, 129, 57);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantity:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(105, 211, 209, 57);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox C1 = new JComboBox();
		C1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C1.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "Chicken Biryani", "Mutton Biryani", "Veg Biryani", "Chicken Fried Rice", "Veg Fried Rice"}));
		C1.setBounds(269, 107, 377, 57);
		frame.getContentPane().add(C1);
		
		T1 = new JTextField();
		T1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		T1.setBounds(269, 211, 377, 57);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JButton btnNewButton = new JButton("Generate Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m=(String) C1.getSelectedItem();
				String q=T1.getText();
				int Q=Integer.parseInt(q);
				int bill=0;
				if(m.equals("Chicken Biryani"))
				{
					bill=Q*200;
				}
				else if(m.equals("Mutton Biryani"))
				{
					bill=Q*270;
				}
				else if(m.equals("Veg Biryani"))
				{
					bill=Q*100;
				}
				else if(m.equals("Veg Fried Rice"))
				{
					bill=Q*50;
				}
				else if(m.equals("Chicken Fried Rice"))
				{
					bill=Q*80;
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"Invalid!");
				}
				JOptionPane.showMessageDialog(btnNewButton,"Thank you!"+"\nYour Order: "+m+"\nQuantity: "+q+"\nBill: Rs."+bill);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(353, 333, 150, 57);
		frame.getContentPane().add(btnNewButton);
	}
}
