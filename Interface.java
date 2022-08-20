package decd_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import java.awt.Color;
import javax.swing.JTextField;

import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	
	private JFrame frame;
	DefaultTableModel model;
	private JTextField id;
	private JTextField name;
	private JTextField course;
	private JTextField number;
	private JTable table;
	private JButton update;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unused")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 255));
		frame.setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 789, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(5, 5, 763, 437);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registation");
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(240, 11, 195, 31);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 53, 763, 384);
		panel.add(panel_1);
		panel_1.setLayout(null);
		model = new DefaultTableModel();
		Object[] Column = {"ID" ,"Name" ,"course" ,"Mobile No"};
		final Object[] row = new Object[4];
		model.setColumnIdentifiers(Column);
		
		JLabel lblNewLabel_1 = new JLabel("ID ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 10, 58, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mobile No");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 112, 92, 23);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("course");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 78, 58, 23);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("First Name");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(10, 44, 92, 23);
		panel_1.add(lblNewLabel_1_3);
		
		id = new JTextField();
		id.setFont(new Font("Arial", Font.PLAIN, 16));
		id.setColumns(10);
		id.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 255)));
		id.setBackground(new Color(0, 191, 255));
		id.setBounds(93, 10, 233, 23);
		panel_1.add(id);
		
		name = new JTextField();
		name.setFont(new Font("Arial", Font.PLAIN, 16));
		name.setColumns(10);
		name.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 255)));
		name.setBackground(new Color(0, 191, 255));
		name.setBounds(93, 44, 233, 23);
		panel_1.add(name);
		
		course = new JTextField();
		course.setFont(new Font("Arial", Font.PLAIN, 16));
		course.setColumns(10);
		course.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 255)));
		course.setBackground(new Color(0, 191, 255));
		course.setBounds(93, 78, 233, 23);
		panel_1.add(course);
		
		number = new JTextField();
		number.setFont(new Font("Arial", Font.PLAIN, 16));
		number.setColumns(10);
		number.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 255)));
		number.setBackground(new Color(0, 191, 255));
		number.setBounds(93, 112, 233, 23);
		panel_1.add(number);
		
		final JButton AddData = new JButton("ADD DATA");
		AddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("") && name.getText().equals("") && course.getText().equals("") && number.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Enter your data!");
				}else if(id.getText().equals("") ) 
				{
					JOptionPane.showMessageDialog(null, "Please enter id!");
				}else if(name.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter name!");
				}else if(course.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter course!");
				}else if(number.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter mobile number!");
				}else{
				
				row[0] =id.getText();
				row[1] =name.getText();
				row[2] =course.getText();
				row[3] =number.getText();
				model.addRow(row);
				
				id.setText("");
				name.setText("");
				course.setText("");
				number.setText("");
				
				JOptionPane.showMessageDialog(null, "Successfully data added!");
				}
				
			}
		});
		AddData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AddData.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(127, 255, 0)));
				AddData.setBackground(new Color(0, 191, 255));
				AddData.setOpaque(false);
				AddData.setFont(new Font("Arial", Font.BOLD, 16));
				AddData.setForeground(Color.WHITE);
				AddData.setBounds(54, 161, 221, 33);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				AddData.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 0)));
				AddData.setBackground(new Color(0, 191, 255));
				AddData.setOpaque(false);
				AddData.setFont(new Font("Arial", Font.BOLD, 16));
				AddData.setForeground(Color.black);
				AddData.setBounds(51, 158, 221, 33);
			}
		});
		AddData.setOpaque(false);
		AddData.setForeground(Color.BLACK);
		AddData.setFont(new Font("Arial", Font.BOLD, 16));
		AddData.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 0)));
		AddData.setBackground(new Color(0, 191, 255));
		AddData.setBounds(51, 158, 221, 33);
		panel_1.add(AddData);
		
		update = new JButton("UPDATE");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(id.getText(), i, 0);
					model.setValueAt(name.getText(), i, 1);
					model.setValueAt(course.getText(), i, 2);
					model.setValueAt(name.getText(), i, 3);
					JOptionPane.showMessageDialog(null, "Successfully details update");

				}else {
					JOptionPane.showMessageDialog(null, "Please select a row first");
				}
				}
		});
		update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				update.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255,255,51)));
				update.setBackground(new Color(0, 191, 255));
				update.setOpaque(false);
				update.setFont(new Font("Arial", Font.BOLD, 16));
				update.setForeground(Color.WHITE);
				update.setBounds(54, 205, 221, 33);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				update.setForeground(Color.BLACK);
				update.setFont(new Font("Arial", Font.BOLD, 16));
				update.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(204, 153, 51)));
				update.setBackground(new Color(0, 191, 255));
				update.setBounds(51, 202, 221, 33);
			}
		});
		update.setOpaque(false);
		update.setForeground(Color.BLACK);
		update.setFont(new Font("Arial", Font.BOLD, 16));
		update.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(204, 153, 51)));
		update.setBackground(new Color(0, 191, 255));
		update.setBounds(51, 202, 221, 33);
		panel_1.add(update);
		
		final JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i= table.getSelectedRow();
				int v =table.getRowCount();
				if(i>=0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null,"Successfully details delete");
				}else if(v==0){
					JOptionPane.showMessageDialog(null,"No Data available");
				}else {
					JOptionPane.showMessageDialog(null,"Please select a row first");
				}
			}
		});
		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				delete.setForeground(Color.BLACK);
				delete.setFont(new Font("Arial", Font.BOLD, 16));
				delete.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(104, 0, 0)));
				delete.setBackground(new Color(0, 191, 255));
				delete.setBounds(51, 290, 221, 33);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				delete.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 0, 0)));
				delete.setBackground(new Color(0, 191, 255));
				delete.setOpaque(false);
				delete.setFont(new Font("Arial", Font.BOLD, 16));
				delete.setForeground(Color.WHITE);
				delete.setBounds(54, 293, 221, 33);
			}
		});
		delete.setOpaque(false);
		delete.setForeground(Color.BLACK);
		delete.setFont(new Font("Arial", Font.BOLD, 16));
		delete.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(104, 0, 0)));
		delete.setBackground(new Color(0, 191, 255));
		delete.setBounds(51, 290, 221, 33);
		panel_1.add(delete);
		
		final JButton clearData = new JButton("CLEAR DATA");
		clearData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				name.setText("");
				number.setText("");
				course.setText("");
			}
		});
		clearData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				clearData.setForeground(Color.BLACK);
				clearData.setFont(new Font("Arial", Font.BOLD, 16));
				clearData.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 0)));
				clearData.setBackground(new Color(0, 191, 255));
				clearData.setBounds(51, 246, 221, 33);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				clearData.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(127, 255, 0)));
				clearData.setBackground(new Color(0, 191, 255));
				clearData.setOpaque(false);
				clearData.setFont(new Font("Arial", Font.BOLD, 16));
				clearData.setForeground(Color.WHITE);
				clearData.setBounds(54, 249, 221, 33);
			}
		});
		clearData.setOpaque(false);
		clearData.setForeground(Color.BLACK);
		clearData.setFont(new Font("Arial", Font.BOLD, 16));
		clearData.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 0)));
		clearData.setBackground(new Color(0, 191, 255));
		clearData.setBounds(51, 246, 221, 33);
		panel_1.add(clearData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(358, 16, 395, 341);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					id.setText(model.getValueAt(i, 0).toString());
					name.setText(model.getValueAt(i, 1).toString());
					course.setText(model.getValueAt(i,2).toString());
					number.setText(model.getValueAt(i, 3).toString());
				}
			}
		});
		model = new DefaultTableModel();
		Object[] column = {"ID" ,"Name" ,"course" ,"Mobile No"};
		final Object[] Row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(Color.WHITE);
	}
}
