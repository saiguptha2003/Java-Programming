import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.stream.Collector;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;

public class SCalculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCalculator window = new SCalculator();
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
	public SCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new );
		frame.setBounds(100, 100, 633, 872);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   SCIENTIFIC CALCULATOR");
		lblNewLabel.setForeground(new Color(51, 0, 255));
		lblNewLabel.setBackground(new Color(153, 204, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 2, 599, 56);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(20, 69, 589, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		

		
		JButton btnNewButton = new JButton("Sqrt");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(58, 188, 90, 79);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnEx.setBounds(158, 188, 90, 79);
		frame.getContentPane().add(btnEx);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnSin.setBounds(258, 188, 90, 79);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnCos.setBounds(364, 188, 90, 79);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnTan.setBounds(464, 188, 90, 79);
		frame.getContentPane().add(btnTan);
		
		JButton btnx = new JButton("1/x");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnx.setBounds(58, 278, 90, 79);
		frame.getContentPane().add(btnx);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1_1.setBounds(158, 278, 90, 79);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Sinh");
		btnNewButton_2_1.setEnabled(false);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_2_1.setBounds(258, 278, 90, 79);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("Cosh");
		btnNewButton_3_1.setEnabled(false);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_3_1.setBounds(364, 278, 90, 79);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("Tanh");
		btnNewButton_4_1.setEnabled(false);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_4_1.setBounds(464, 278, 90, 79);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnXy.setBounds(58, 367, 90, 79);
		frame.getContentPane().add(btnXy);
		
		JButton btnNewButton_1_2 = new JButton("%");
		btnNewButton_1_2.setEnabled(false);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1_2.setBounds(158, 367, 90, 79);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("C");
		btnNewButton_2_2.setEnabled(false);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_2_2.setBounds(258, 367, 90, 79);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("Back");
		btnNewButton_3_2.setEnabled(false);
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace= str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_3_2.setBounds(364, 367, 90, 79);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("+");
		btnNewButton_4_2.setEnabled(false);
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_4_2.setBounds(464, 367, 90, 79);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnX = new JButton("X^3");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnX.setBounds(58, 457, 90, 79);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_1_3 = new JButton("7");
		btnNewButton_1_3.setEnabled(false);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1_3.setBounds(158, 457, 90, 79);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("8");
		btnNewButton_2_3.setEnabled(false);
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_2_3.setBounds(258, 457, 90, 79);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("9");
		btnNewButton_3_3.setEnabled(false);
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_3_3.setBounds(364, 457, 90, 79);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_4_3 = new JButton("-");
		btnNewButton_4_3.setEnabled(false);
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_4_3.setBounds(464, 457, 90, 79);
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnX_1 = new JButton("X^2");
		btnX_1.setEnabled(false);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				
				
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnX_1.setBounds(58, 547, 90, 79);
		frame.getContentPane().add(btnX_1);
		
		JButton btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.setEnabled(false);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1_4.setBounds(158, 547, 90, 79);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_2_4 = new JButton("5");
		btnNewButton_2_4.setEnabled(false);
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_2_4.setBounds(258, 547, 90, 79);
		frame.getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_3_4 = new JButton("6");
		btnNewButton_3_4.setEnabled(false);
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_3_4.setBounds(364, 547, 90, 79);
		frame.getContentPane().add(btnNewButton_3_4);
		
		JButton btnNewButton_4_4 = new JButton("*");
		btnNewButton_4_4.setEnabled(false);
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_4_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_4_4.setBounds(464, 547, 90, 79);
		frame.getContentPane().add(btnNewButton_4_4);
		
		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact =1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnN.setBounds(58, 639, 90, 79);
		frame.getContentPane().add(btnN);
		
		JButton btnNewButton_1_5 = new JButton("1");
		btnNewButton_1_5.setEnabled(false);
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_5.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1_5.setBounds(158, 639, 90, 79);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_2_5 = new JButton("2");
		btnNewButton_2_5.setEnabled(false);
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_2_5.setBounds(258, 639, 90, 79);
		frame.getContentPane().add(btnNewButton_2_5);
		
		JButton btnNewButton_3_5 = new JButton("3");
		btnNewButton_3_5.setEnabled(false);
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_3_5.setBounds(364, 639, 90, 79);
		frame.getContentPane().add(btnNewButton_3_5);
		
		JButton btnNewButton_4_5 = new JButton("/");
		btnNewButton_4_5.setEnabled(false);
		btnNewButton_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_4_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_4_5.setBounds(464, 639, 90, 79);
		frame.getContentPane().add(btnNewButton_4_5);
		
		JButton btnNewButton_10 = new JButton("+/-");
		btnNewButton_10.setEnabled(false);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_10.setBounds(58, 732, 90, 79);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_1_6 = new JButton("0");
		btnNewButton_1_6.setEnabled(false);
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1_6.setBounds(158, 732, 190, 79);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_3_6 = new JButton(".");
		btnNewButton_3_6.setEnabled(false);
		btnNewButton_3_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_3_6.setBounds(364, 732, 90, 79);
		frame.getContentPane().add(btnNewButton_3_6);
		
		JButton btnNewButton_4_6 = new JButton("=");
		btnNewButton_4_6.setEnabled(false);
		btnNewButton_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result = first + second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result = first - second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result = first * second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result = first / second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result = first % second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y") {
					double resultt=1;
					for(int i=0;i<second;i++) {
						resultt = first * resultt;

					}
					answer= String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(true);
				btnEx.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnx.setEnabled(true);
				btnNewButton_1_1.setEnabled(true);
				btnNewButton_2_1.setEnabled(true);
				btnNewButton_3_1.setEnabled(true);
				btnNewButton_4_1.setEnabled(true);
				btnXy.setEnabled(true);
				btnNewButton_1_2.setEnabled(true);
				btnNewButton_2_2.setEnabled(true);
				btnNewButton_3_2.setEnabled(true);
				btnNewButton_4_2.setEnabled(true);
				btnX.setEnabled(true);
				btnNewButton_1_3.setEnabled(true);
				btnNewButton_2_3.setEnabled(true);
				btnNewButton_3_3.setEnabled(true);
				btnNewButton_4_3.setEnabled(true);
				btnX_1.setEnabled(true);
				btnNewButton_1_4.setEnabled(true);
				btnNewButton_2_4.setEnabled(true);
				btnNewButton_3_4.setEnabled(true);
				btnNewButton_4_4.setEnabled(true);
				btnN.setEnabled(true);
				btnNewButton_1_5.setEnabled(true);
				btnNewButton_2_5.setEnabled(true);
				btnNewButton_3_5.setEnabled(true);
				btnNewButton_4_5.setEnabled(true);
				btnNewButton_10.setEnabled(true);
				btnNewButton_1_6.setEnabled(true);
				btnNewButton_3_6.setEnabled(true);
				btnNewButton_4_6.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(153, 204, 255));
		rdbtnNewRadioButton.setForeground(Color.BLUE);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton.setBounds(258, 147, 49, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(false);
				btnEx.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnx.setEnabled(false);
				btnNewButton_1_1.setEnabled(false);
				btnNewButton_2_1.setEnabled(false);
				btnNewButton_3_1.setEnabled(false);
				btnNewButton_4_1.setEnabled(false);
				btnXy.setEnabled(false);
				btnNewButton_1_2.setEnabled(false);
				btnNewButton_2_2.setEnabled(false);
				btnNewButton_3_2.setEnabled(false);
				btnNewButton_4_2.setEnabled(false);
				btnX.setEnabled(false);
				btnNewButton_1_3.setEnabled(false);
				btnNewButton_2_3.setEnabled(false);
				btnNewButton_3_3.setEnabled(false);
				btnNewButton_4_3.setEnabled(false);
				btnX_1.setEnabled(false);
				btnNewButton_1_4.setEnabled(false);
				btnNewButton_2_4.setEnabled(false);
				btnNewButton_3_4.setEnabled(false);
				btnNewButton_4_4.setEnabled(false);
				btnN.setEnabled(false);
				btnNewButton_1_5.setEnabled(false);
				btnNewButton_2_5.setEnabled(false);
				btnNewButton_3_5.setEnabled(false);
				btnNewButton_4_5.setEnabled(false);
				btnNewButton_10.setEnabled(false);
				btnNewButton_1_6.setEnabled(false);
				btnNewButton_3_6.setEnabled(false);
				btnNewButton_4_6.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(153, 204, 255));
		rdbtnNewRadioButton_1.setForeground(Color.RED);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_1.setBounds(327, 147, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		btnNewButton_4_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_4_6.setBounds(464, 732, 90, 79);
		frame.getContentPane().add(btnNewButton_4_6);
	}
}