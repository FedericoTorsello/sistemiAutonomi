package it.unibo.scopone.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

public class MainGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 472, 311);
		contentPane.add(panel);
		panel.setBackground(new Color(173, 255, 47));
		panel.setLayout(null);
		
		JLabel lblPlayer3 = new JLabel("Player 3");
		lblPlayer3.setBounds(209, 12, 57, 15);
		panel.add(lblPlayer3);
		
		JLabel lblPlayer2 = new JLabel("Player 2");
		lblPlayer2.setBounds(12, 156, 57, 15);
		panel.add(lblPlayer2);
		
		JLabel lblPlayer4 = new JLabel("Player 4");
		lblPlayer4.setBounds(403, 156, 57, 15);
		panel.add(lblPlayer4);
		
		JLabel lblPlayer1 = new JLabel("Player 1");
		lblPlayer1.setBounds(209, 284, 57, 15);
		panel.add(lblPlayer1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(496, 12, 317, 257);
		contentPane.add(textPane);
		
		JButton btnEndGame = new JButton("End Game");
		btnEndGame.setBounds(696, 298, 117, 25);
		contentPane.add(btnEndGame);
		
		JButton btnNextTurn = new JButton("Next Turn");
		btnNextTurn.setBounds(567, 298, 117, 25);
		contentPane.add(btnNextTurn);
	}
}
