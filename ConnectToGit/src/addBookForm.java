import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class addBookForm {

	private JFrame frame;
	private JTextField tbTitle;
	private JTextField tbAuthor;
	private JTextField tbPrice;
	private JTextField tbQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addBookForm window = new addBookForm();
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
	public addBookForm() {
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
		
		JLabel lblAddBooks = new JLabel("Add a New Book!");
		lblAddBooks.setFont(new Font("Futura", Font.PLAIN, 28));
		lblAddBooks.setBounds(112, 6, 241, 91);
		frame.getContentPane().add(lblAddBooks);
		
		JLabel lblTitle = new JLabel("Enter Title:");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitle.setBounds(23, 109, 111, 16);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblEnterAuthor = new JLabel("Enter Author: ");
		lblEnterAuthor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterAuthor.setBounds(23, 137, 111, 16);
		frame.getContentPane().add(lblEnterAuthor);
		
		JLabel lblEnterPrice = new JLabel("Enter Price:");
		lblEnterPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterPrice.setBounds(23, 165, 111, 16);
		frame.getContentPane().add(lblEnterPrice);
		
		JLabel lblEnterQuantity = new JLabel("Enter Quantity:");
		lblEnterQuantity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterQuantity.setBounds(23, 193, 111, 16);
		frame.getContentPane().add(lblEnterQuantity);
		
		tbTitle = new JTextField();
		tbTitle.setBounds(146, 104, 130, 26);
		frame.getContentPane().add(tbTitle);
		tbTitle.setColumns(10);
		
		tbAuthor = new JTextField();
		tbAuthor.setColumns(10);
		tbAuthor.setBounds(146, 132, 130, 26);
		frame.getContentPane().add(tbAuthor);
		
		tbPrice = new JTextField();
		tbPrice.setColumns(10);
		tbPrice.setBounds(146, 160, 130, 26);
		frame.getContentPane().add(tbPrice);
		
		tbQuantity = new JTextField();
		tbQuantity.setColumns(10);
		tbQuantity.setBounds(146, 188, 130, 26);
		frame.getContentPane().add(tbQuantity);
		
		JTextArea aAddedBook = new JTextArea();
		aAddedBook.setEditable(false);
		aAddedBook.setBounds(283, 93, 156, 134);
		frame.getContentPane().add(aAddedBook);
		
		JButton btnAddBook = new JButton("Add Book!");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = tbTitle.getText();
				String author = tbAuthor.getText();
				double price = Double.parseDouble(tbPrice.getText());
				int quantity = Integer.parseInt(tbQuantity.getText());
				Book myBook = new Book(title, author, price, quantity);
				System.out.println("Book Added!\n"+myBook);
				aAddedBook.setText(myBook.toString());
			}
		});
		btnAddBook.setForeground(new Color(4, 50, 255));
		btnAddBook.setBounds(159, 226, 117, 29);
		frame.getContentPane().add(btnAddBook);
	}
}
