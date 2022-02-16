package factory;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactoryGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private ButtonGroup persistenceGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactoryGUI frame = new FactoryGUI();
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
	public FactoryGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtName = new JTextField();
		txtName.setBounds(23, 25, 96, 20);
		txtName.setText("Enter Name");
		txtName.setColumns(10);
		
		JLabel lblResult = new JLabel("New label");
		lblResult.setBounds(10, 101, 396, 14);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(129, 24, 89, 23);
		
		JRadioButton rdbDatabase = new JRadioButton("Database");
		rdbDatabase.setBounds(251, 7, 111, 23);
		contentPane.setLayout(null);
		contentPane.add(txtName);
		contentPane.add(lblResult);
		contentPane.add(btnSave);
		contentPane.add(rdbDatabase);
		
		JRadioButton rdbXml = new JRadioButton("XML");
		rdbXml.setBounds(251, 34, 111, 23);
		contentPane.add(rdbXml);

		JRadioButton rdbFile = new JRadioButton("File");
		rdbFile.setBounds(251, 34+23, 111, 23);
		contentPane.add(rdbFile);

		persistenceGroup = new ButtonGroup();
		
		persistenceGroup.add(rdbDatabase);
		persistenceGroup.add(rdbXml);
		persistenceGroup.add(rdbFile);

		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbDatabase.isSelected())
				{
			        lblResult.setText(PersistenceFactory.GetFactory(PersistenceType.Database).Persist(txtName.getText()));
				}
			    else if (rdbXml.isSelected())
			    {
			        lblResult.setText(PersistenceFactory.GetFactory(PersistenceType.XML).Persist(txtName.getText()));
			    }
				else if (rdbFile.isSelected())
			    {
			        lblResult.setText(PersistenceFactory.GetFactory(PersistenceType.File).Persist(txtName.getText()));
			    }
			    else {
			        lblResult.setText("You must select a persistence type");
			    }
			}
		});

	}
}
