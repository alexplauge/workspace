package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		super("GUI Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		final JLabel lblGuiTemperatureConverter = new JLabel("GUI Temperature Converter");
		
		txtInput = new JTextField();
		txtInput.setToolTipText("Input");
		txtInput.setColumns(10);
		final JButton btnToFahrenheit = new JButton("To Fahrenheit");
		final JLabel lblOutput = new JLabel("Output:");
		JButton btnToCelsius = new JButton("To Celsius");
		btnToCelsius.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent arg0) {
	        	double in = Double.parseDouble(txtInput.getText());
	        	lblOutput.setText("Output: " + logic(in,"ToC"));
	        }
	    });
		btnToFahrenheit.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent arg0) {
	        	double in = Double.parseDouble(txtInput.getText());
	        	lblOutput.setText("Output: " + logic(in,"ToF"));
	        }
	    }); 
		
		
		
		JTextPane txtpnInputCelsiusOr = new JTextPane();
		txtpnInputCelsiusOr.setEditable(false);
		txtpnInputCelsiusOr.setText("Input Celsius or Fahrenheit and click the conversion\nyou would like to perform.\n");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(115, Short.MAX_VALUE)
					.addComponent(lblGuiTemperatureConverter, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addGap(93))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(btnToCelsius, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
					.addComponent(btnToFahrenheit)
					.addGap(29))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(55, Short.MAX_VALUE)
					.addComponent(txtpnInputCelsiusOr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(52))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(155)
					.addComponent(txtInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(169, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(165, Short.MAX_VALUE)
					.addComponent(lblOutput, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(153))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblGuiTemperatureConverter)
					.addGap(18)
					.addComponent(txtInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnToCelsius, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnToFahrenheit))
					.addGap(28)
					.addComponent(lblOutput)
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addComponent(txtpnInputCelsiusOr, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public double logic(double original, String operation) {
		double converted;
		if (operation == "ToC") {
			converted = (original - 32)*5/9;
		}else {
			converted = (original * 9/5.0) +32; 
		}
		return converted;
	}
}

