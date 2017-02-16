//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
//import javax.swing.border.LineBorder;
//import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;

public class SortGUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblBubbleSortIn;
	private JLabel lblSelectionSortIn;
	private JLabel lblInsertionSortIn;
	private JTextField textField_3;
	private JLabel label;
	private JTextField textField_4;
	private JLabel label_1;
	private JTextField textField_5;
	private JLabel label_2;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JPanel panel;
	private JPanel panel_1;
	private JComboBox [] comboBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static final long serialVersionUID =1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortGUI frame = new SortGUI();
					//frame.pack();
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
	public SortGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 325);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPleaseSelectThe = new JLabel("Please select the");
		GridBagConstraints gbc_lblPleaseSelectThe = new GridBagConstraints();
		gbc_lblPleaseSelectThe.anchor = GridBagConstraints.SOUTH;
		gbc_lblPleaseSelectThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblPleaseSelectThe.gridx = 0;
		gbc_lblPleaseSelectThe.gridy = 0;
		contentPane.add(lblPleaseSelectThe, gbc_lblPleaseSelectThe);
		
		JLabel lblNumberOfElements = new JLabel("number of elements");
		GridBagConstraints gbc_lblNumberOfElements = new GridBagConstraints();
		gbc_lblNumberOfElements.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumberOfElements.gridx = 0;
		gbc_lblNumberOfElements.gridy = 1;
		contentPane.add(lblNumberOfElements, gbc_lblNumberOfElements);
		
		//JComboBox comboBox = new JComboBox();
		JComboBox comboBox = new JComboBox (new String[]{"100","1000","10000","100000"});
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblForYourArray = new JLabel("for your Array");
		GridBagConstraints gbc_lblForYourArray = new GridBagConstraints();
		gbc_lblForYourArray.insets = new Insets(0, 0, 5, 5);
		gbc_lblForYourArray.gridx = 0;
		gbc_lblForYourArray.gridy = 2;
		contentPane.add(lblForYourArray, gbc_lblForYourArray);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Sorted Array Analysis", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 4;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblBubbleSortIn = new JLabel("Bubble sort in millisecs");
		GridBagConstraints gbc_lblBubbleSortIn = new GridBagConstraints();
		gbc_lblBubbleSortIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblBubbleSortIn.gridx = 0;
		gbc_lblBubbleSortIn.gridy = 0;
		panel_1.add(lblBubbleSortIn, gbc_lblBubbleSortIn);
		lblBubbleSortIn.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		lblSelectionSortIn = new JLabel("Selection sort in millisecs");
		GridBagConstraints gbc_lblSelectionSortIn = new GridBagConstraints();
		gbc_lblSelectionSortIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectionSortIn.gridx = 1;
		gbc_lblSelectionSortIn.gridy = 0;
		panel_1.add(lblSelectionSortIn, gbc_lblSelectionSortIn);
		lblSelectionSortIn.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		lblInsertionSortIn = new JLabel("Insertion sort in millisecs");
		GridBagConstraints gbc_lblInsertionSortIn = new GridBagConstraints();
		gbc_lblInsertionSortIn.insets = new Insets(0, 0, 5, 0);
		gbc_lblInsertionSortIn.gridx = 2;
		gbc_lblInsertionSortIn.gridy = 0;
		panel_1.add(lblInsertionSortIn, gbc_lblInsertionSortIn);
		lblInsertionSortIn.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 1;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Unsorted Array Analysis", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		label = new JLabel("Bubble sort in millisecs");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel.add(label, gbc_label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		label_1 = new JLabel("Selection sort in millisecs");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 1;
		panel.add(label_1, gbc_label_1);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		label_2 = new JLabel("Insertion sort in millisecs");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 1;
		panel.add(label_2, gbc_label_2);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 2;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 2;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 2;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		button = new JButton("Bubble");
		buttonGroup.add(button);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 8;
		contentPane.add(button, gbc_button);
		
		button_1 = new JButton("Selection");
		buttonGroup.add(button_1);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 8;
		contentPane.add(button_1, gbc_button_1);
		
		button_2 = new JButton("Insertion");
		buttonGroup.add(button_2);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.anchor = GridBagConstraints.NORTH;
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 8;
		contentPane.add(button_2, gbc_button_2);
	}
}
