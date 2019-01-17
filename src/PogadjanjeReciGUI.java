import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class PogadjanjeReciGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textPogodi;
	public char [] sakriveno;
	public int indeks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{




		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PogadjanjeReciGUI window = new PogadjanjeReciGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	String rec = JOptionPane.showInputDialog("Uneti rec");
	{
		sakriveno = new char[rec.length()]; 

		for (indeks = 0; indeks < sakriveno.length; indeks++)
		{
			sakriveno[indeks] = '*';
		}

	}


	/**
	 * Create the application.
	 */
	public PogadjanjeReciGUI() 
	{
		initialize();
	}


	public void proveriSlovo()
	{

			if (rec.toLowerCase().contains(String.valueOf(textPogodi.getText().toLowerCase()))) //gledamo ima li nasa rec to slovo
			{
				for (int indeks = 0; indeks < rec.length(); indeks++)
				{
					if (rec.toLowerCase().toCharArray()[indeks] == String.valueOf(textPogodi.getText().toLowerCase()).toCharArray()[0])
					{

						//gde nadjemo da slovo postoji, na istom mestu
						//na nasoj "tabli" unosimo to slovo
						sakriveno[indeks] = String.valueOf(textPogodi.getText()).toCharArray()[0];
						textField.setText(String.valueOf(sakriveno));
					}else
					{
					}
				}
			}
		
	}
			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() 
			{


				frame = new JFrame();
				frame.setBounds(100, 100, 650, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				GridBagLayout gridBagLayout = new GridBagLayout();
				gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
				gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				frame.getContentPane().setLayout(gridBagLayout);

				JLabel lblPogodiRec = new JLabel("Pogodi rec");
				lblPogodiRec.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GridBagConstraints gbc_lblPogodiRec = new GridBagConstraints();
				gbc_lblPogodiRec.insets = new Insets(0, 0, 5, 5);
				gbc_lblPogodiRec.anchor = GridBagConstraints.EAST;
				gbc_lblPogodiRec.gridx = 0;
				gbc_lblPogodiRec.gridy = 0;
				frame.getContentPane().add(lblPogodiRec, gbc_lblPogodiRec);

				textField = new JTextField();
				textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
				textField.setEnabled(false);
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.gridwidth = 8;
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 0;
				frame.getContentPane().add(textField, gbc_textField);
				textField.setColumns(10);

				textField.setText(String.valueOf(sakriveno));

				JLabel lblPogodiRecIli = new JLabel("Pogodi rec ili probaj slovo");
				GridBagConstraints gbc_lblPogodiRecIli = new GridBagConstraints();
				gbc_lblPogodiRecIli.gridwidth = 2;
				gbc_lblPogodiRecIli.insets = new Insets(0, 0, 5, 5);
				gbc_lblPogodiRecIli.gridx = 0;
				gbc_lblPogodiRecIli.gridy = 1;
				frame.getContentPane().add(lblPogodiRecIli, gbc_lblPogodiRecIli);

				textPogodi = new JTextField();
				GridBagConstraints gbc_textPogodi = new GridBagConstraints();
				gbc_textPogodi.gridwidth = 2;
				gbc_textPogodi.insets = new Insets(0, 0, 5, 5);
				gbc_textPogodi.fill = GridBagConstraints.HORIZONTAL;
				gbc_textPogodi.gridx = 3;
				gbc_textPogodi.gridy = 1;
				frame.getContentPane().add(textPogodi, gbc_textPogodi);
				textPogodi.setColumns(10);

				JButton button_4 = new JButton("\u017D");
				GridBagConstraints gbc_button_4 = new GridBagConstraints();
				gbc_button_4.insets = new Insets(0, 0, 5, 5);
				gbc_button_4.gridx = 1;
				gbc_button_4.gridy = 3;
				frame.getContentPane().add(button_4, gbc_button_4);

				JButton btnA = new JButton("Q");
				GridBagConstraints gbc_btnA = new GridBagConstraints();
				gbc_btnA.insets = new Insets(0, 0, 5, 5);
				gbc_btnA.gridx = 2;
				gbc_btnA.gridy = 3;
				frame.getContentPane().add(btnA, gbc_btnA);

				JButton btnB = new JButton("W");
				GridBagConstraints gbc_btnB = new GridBagConstraints();
				gbc_btnB.insets = new Insets(0, 0, 5, 5);
				gbc_btnB.gridx = 3;
				gbc_btnB.gridy = 3;
				frame.getContentPane().add(btnB, gbc_btnB);

				JButton btnC = new JButton("E");
				GridBagConstraints gbc_btnC = new GridBagConstraints();
				gbc_btnC.insets = new Insets(0, 0, 5, 5);
				gbc_btnC.gridx = 4;
				gbc_btnC.gridy = 3;
				frame.getContentPane().add(btnC, gbc_btnC);

				JButton btnD = new JButton("R");
				btnD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				GridBagConstraints gbc_btnD = new GridBagConstraints();
				gbc_btnD.insets = new Insets(0, 0, 5, 5);
				gbc_btnD.gridx = 5;
				gbc_btnD.gridy = 3;
				frame.getContentPane().add(btnD, gbc_btnD);

				JButton btnE = new JButton("T");
				GridBagConstraints gbc_btnE = new GridBagConstraints();
				gbc_btnE.insets = new Insets(0, 0, 5, 5);
				gbc_btnE.gridx = 6;
				gbc_btnE.gridy = 3;
				frame.getContentPane().add(btnE, gbc_btnE);

				JButton btnF = new JButton("Y");
				GridBagConstraints gbc_btnF = new GridBagConstraints();
				gbc_btnF.insets = new Insets(0, 0, 5, 5);
				gbc_btnF.gridx = 7;
				gbc_btnF.gridy = 3;
				frame.getContentPane().add(btnF, gbc_btnF);

				JButton btnG = new JButton("U");
				GridBagConstraints gbc_btnG = new GridBagConstraints();
				gbc_btnG.insets = new Insets(0, 0, 5, 5);
				gbc_btnG.gridx = 8;
				gbc_btnG.gridy = 3;
				frame.getContentPane().add(btnG, gbc_btnG);

				JButton btnNewButton = new JButton("I");
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton.gridx = 9;
				gbc_btnNewButton.gridy = 3;
				frame.getContentPane().add(btnNewButton, gbc_btnNewButton);

				JButton btnO = new JButton("O");
				GridBagConstraints gbc_btnO = new GridBagConstraints();
				gbc_btnO.insets = new Insets(0, 0, 5, 5);
				gbc_btnO.gridx = 10;
				gbc_btnO.gridy = 3;
				frame.getContentPane().add(btnO, gbc_btnO);

				JButton btnP = new JButton("P");
				GridBagConstraints gbc_btnP = new GridBagConstraints();
				gbc_btnP.insets = new Insets(0, 0, 5, 5);
				gbc_btnP.gridx = 11;
				gbc_btnP.gridy = 3;
				frame.getContentPane().add(btnP, gbc_btnP);

				JButton btnNj = new JButton("NJ");
				GridBagConstraints gbc_btnNj = new GridBagConstraints();
				gbc_btnNj.insets = new Insets(0, 0, 5, 5);
				gbc_btnNj.gridx = 1;
				gbc_btnNj.gridy = 4;
				frame.getContentPane().add(btnNj, gbc_btnNj);

				JButton button = new JButton("\u0160");
				GridBagConstraints gbc_button = new GridBagConstraints();
				gbc_button.insets = new Insets(0, 0, 5, 5);
				gbc_button.gridx = 2;
				gbc_button.gridy = 4;
				frame.getContentPane().add(button, gbc_button);

				JButton btnA_1 = new JButton("A");
				GridBagConstraints gbc_btnA_1 = new GridBagConstraints();
				gbc_btnA_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_1.gridx = 3;
				gbc_btnA_1.gridy = 4;
				frame.getContentPane().add(btnA_1, gbc_btnA_1);

				JButton btnS = new JButton("S");
				btnS.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) 
					{
						textPogodi.setText("S");
						proveriSlovo();
					}
				});
				GridBagConstraints gbc_btnS = new GridBagConstraints();
				gbc_btnS.insets = new Insets(0, 0, 5, 5);
				gbc_btnS.gridx = 4;
				gbc_btnS.gridy = 4;
				frame.getContentPane().add(btnS, gbc_btnS);

				JButton btnD_1 = new JButton("D");
				GridBagConstraints gbc_btnD_1 = new GridBagConstraints();
				gbc_btnD_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnD_1.gridx = 5;
				gbc_btnD_1.gridy = 4;
				frame.getContentPane().add(btnD_1, gbc_btnD_1);

				JButton btnF_1 = new JButton("F");
				GridBagConstraints gbc_btnF_1 = new GridBagConstraints();
				gbc_btnF_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnF_1.gridx = 6;
				gbc_btnF_1.gridy = 4;
				frame.getContentPane().add(btnF_1, gbc_btnF_1);

				JButton btnG_1 = new JButton("G");
				GridBagConstraints gbc_btnG_1 = new GridBagConstraints();
				gbc_btnG_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnG_1.gridx = 7;
				gbc_btnG_1.gridy = 4;
				frame.getContentPane().add(btnG_1, gbc_btnG_1);

				JButton btnH = new JButton("H");
				GridBagConstraints gbc_btnH = new GridBagConstraints();
				gbc_btnH.insets = new Insets(0, 0, 5, 5);
				gbc_btnH.gridx = 8;
				gbc_btnH.gridy = 4;
				frame.getContentPane().add(btnH, gbc_btnH);

				JButton btnJ = new JButton("J");
				GridBagConstraints gbc_btnJ = new GridBagConstraints();
				gbc_btnJ.insets = new Insets(0, 0, 5, 5);
				gbc_btnJ.gridx = 9;
				gbc_btnJ.gridy = 4;
				frame.getContentPane().add(btnJ, gbc_btnJ);

				JButton btnK = new JButton("K");
				GridBagConstraints gbc_btnK = new GridBagConstraints();
				gbc_btnK.insets = new Insets(0, 0, 5, 5);
				gbc_btnK.gridx = 10;
				gbc_btnK.gridy = 4;
				frame.getContentPane().add(btnK, gbc_btnK);

				JButton btnL = new JButton("L");
				GridBagConstraints gbc_btnL = new GridBagConstraints();
				gbc_btnL.insets = new Insets(0, 0, 5, 5);
				gbc_btnL.gridx = 11;
				gbc_btnL.gridy = 4;
				frame.getContentPane().add(btnL, gbc_btnL);

				JButton btnLj = new JButton("LJ");
				GridBagConstraints gbc_btnLj = new GridBagConstraints();
				gbc_btnLj.insets = new Insets(0, 0, 0, 5);
				gbc_btnLj.gridx = 1;
				gbc_btnLj.gridy = 5;
				frame.getContentPane().add(btnLj, gbc_btnLj);

				JButton button_1 = new JButton("\u0110");
				GridBagConstraints gbc_button_1 = new GridBagConstraints();
				gbc_button_1.insets = new Insets(0, 0, 0, 5);
				gbc_button_1.gridx = 2;
				gbc_button_1.gridy = 5;
				frame.getContentPane().add(button_1, gbc_button_1);

				JButton button_2 = new JButton("\u010C");
				GridBagConstraints gbc_button_2 = new GridBagConstraints();
				gbc_button_2.insets = new Insets(0, 0, 0, 5);
				gbc_button_2.gridx = 3;
				gbc_button_2.gridy = 5;
				frame.getContentPane().add(button_2, gbc_button_2);

				JButton btnZ = new JButton("Z");
				GridBagConstraints gbc_btnZ = new GridBagConstraints();
				gbc_btnZ.insets = new Insets(0, 0, 0, 5);
				gbc_btnZ.gridx = 4;
				gbc_btnZ.gridy = 5;
				frame.getContentPane().add(btnZ, gbc_btnZ);

				JButton btnX = new JButton("X");
				GridBagConstraints gbc_btnX = new GridBagConstraints();
				gbc_btnX.insets = new Insets(0, 0, 0, 5);
				gbc_btnX.gridx = 5;
				gbc_btnX.gridy = 5;
				frame.getContentPane().add(btnX, gbc_btnX);

				JButton btnC_1 = new JButton("C");
				GridBagConstraints gbc_btnC_1 = new GridBagConstraints();
				gbc_btnC_1.insets = new Insets(0, 0, 0, 5);
				gbc_btnC_1.gridx = 6;
				gbc_btnC_1.gridy = 5;
				frame.getContentPane().add(btnC_1, gbc_btnC_1);

				JButton btnV = new JButton("V");
				GridBagConstraints gbc_btnV = new GridBagConstraints();
				gbc_btnV.insets = new Insets(0, 0, 0, 5);
				gbc_btnV.gridx = 7;
				gbc_btnV.gridy = 5;
				frame.getContentPane().add(btnV, gbc_btnV);

				JButton btnB_1 = new JButton("B");
				GridBagConstraints gbc_btnB_1 = new GridBagConstraints();
				gbc_btnB_1.insets = new Insets(0, 0, 0, 5);
				gbc_btnB_1.gridx = 8;
				gbc_btnB_1.gridy = 5;
				frame.getContentPane().add(btnB_1, gbc_btnB_1);

				JButton btnN = new JButton("N");
				GridBagConstraints gbc_btnN = new GridBagConstraints();
				gbc_btnN.insets = new Insets(0, 0, 0, 5);
				gbc_btnN.gridx = 9;
				gbc_btnN.gridy = 5;
				frame.getContentPane().add(btnN, gbc_btnN);

				JButton btnM = new JButton("M");
				GridBagConstraints gbc_btnM = new GridBagConstraints();
				gbc_btnM.insets = new Insets(0, 0, 0, 5);
				gbc_btnM.gridx = 10;
				gbc_btnM.gridy = 5;
				frame.getContentPane().add(btnM, gbc_btnM);

				JButton button_3 = new JButton("\u0106");
				GridBagConstraints gbc_button_3 = new GridBagConstraints();
				gbc_button_3.insets = new Insets(0, 0, 0, 5);
				gbc_button_3.gridx = 11;
				gbc_button_3.gridy = 5;
				frame.getContentPane().add(button_3, gbc_button_3);


			}

		}
