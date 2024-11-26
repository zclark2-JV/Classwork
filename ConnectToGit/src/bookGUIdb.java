import java.awt.EventQueue;
import java.util.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class bookGUIdb {

	private JFrame frame;
	private JTextField authorEntry;
	private JTextField fnEntry;
	private JTextField lnEntry;
	private JTable authorTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookGUIdb window = new bookGUIdb();
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
	public bookGUIdb() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/authors", "root", "root");
		PreparedStatement trunc = con.prepareStatement("TRUNCATE authors");
		trunc.executeUpdate();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(197, 221, 221));
		frame.setBounds(100, 100, 710, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// ALL SECTION TITLES
		
		JLabel bookdbTitle = new JLabel("GENERIC BOOK DATABASE");
		bookdbTitle.setBounds(0, 0, 710, 34);
		bookdbTitle.setForeground(new Color(33, 83, 145));
		bookdbTitle.setFont(new Font("Futura", Font.BOLD, 20));
		bookdbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(bookdbTitle);
		
		JLabel firstNameTitle = new JLabel("FIRST NAME:");
		firstNameTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		firstNameTitle.setForeground(new Color(23, 42, 74));
		firstNameTitle.setFont(new Font("Futura", Font.PLAIN, 15));
		firstNameTitle.setBounds(63, 89, 104, 34);
		frame.getContentPane().add(firstNameTitle);
		
		JLabel authorIDTitle = new JLabel("AUTHOR ID:");
		authorIDTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		authorIDTitle.setForeground(new Color(23, 42, 74));
		authorIDTitle.setFont(new Font("Futura", Font.PLAIN, 15));
		authorIDTitle.setBounds(63, 56, 104, 34);
		frame.getContentPane().add(authorIDTitle);
		
		JLabel lastNameTitle = new JLabel("LAST NAME:");
		lastNameTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lastNameTitle.setForeground(new Color(23, 42, 74));
		lastNameTitle.setFont(new Font("Futura", Font.PLAIN, 15));
		lastNameTitle.setBounds(63, 121, 104, 34);
		frame.getContentPane().add(lastNameTitle);
		
		// ALL SECTION TEXT INPUTS
		
		authorEntry = new JTextField();
		authorEntry.setBounds(184, 61, 460, 26);
		frame.getContentPane().add(authorEntry);
		authorEntry.setColumns(10);
		
		fnEntry = new JTextField();
		fnEntry.setColumns(10);
		fnEntry.setBounds(184, 94, 460, 26);
		frame.getContentPane().add(fnEntry);
		
		lnEntry = new JTextField();
		lnEntry.setColumns(10);
		lnEntry.setBounds(184, 126, 460, 26);
		frame.getContentPane().add(lnEntry);
		
		// SUBMIT BUTTON
		
		JButton submitBtn = new JButton("SUBMIT NEW AUTHOR ID [CLICK HERE]");
		submitBtn.setForeground(new Color(170, 185, 185));
		submitBtn.setFont(new Font("Futura", Font.BOLD | Font.ITALIC, 13));
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ESTABLISH CONNECTIONS
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/authors", "root", "root");
					
					PreparedStatement insert = con.prepareStatement("INSERT INTO authors (authorID, firstName, lastName) VALUES (?, ?, ?)");
					String authorText = authorEntry.getText();
					int authorID = Integer.parseInt(authorText);
					insert.setInt(1, authorID);
					insert.setString(2, fnEntry.getText());
					insert.setString(3, lnEntry.getText());
					insert.executeUpdate();
					
					System.out.println("Added to Database!");
					
					PreparedStatement fetch = con.prepareStatement("SELECT * FROM authors");
					ResultSet results = fetch.executeQuery();
					DefaultTableModel model = new DefaultTableModel();
					model.addColumn("ID");
					model.addColumn("First");
					model.addColumn("Last");
					
					while (results.next()) {
						model.addRow(new Object[] {
								results.getInt("authorID"),
								results.getString("firstName"),
								results.getString("lastName")});
					}
					
					authorTable.setModel(model);
					
				}
				catch (Exception ex){
					System.out.println(ex);
				}
				
				
			}
		});
		submitBtn.setBounds(73, 159, 571, 29);
		frame.getContentPane().add(submitBtn);
		
		authorTable = new JTable();
		authorTable.setBounds(83, 189, 553, 66);
		frame.getContentPane().add(authorTable);
	}
}
