import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class madLib extends JFrame {
	private JTextField textFieldAdj;
	private JTextField textFieldNoun;
	private JTextField textFieldVerb;
	private JTextField textFieldAdjTwo;
	private JLabel lblOutput;
	public void writeStory() {
		String adj = textFieldAdj.getText();
		String noun = textFieldNoun.getText();
		String verb = textFieldVerb.getText();
		String adjTwo = textFieldAdjTwo.getText();
		String story = "The " + adj + " cat " + verb + " the " + adjTwo + " " + noun; 
		lblOutput.setText(story);
		lblOutput.setVisible(true);
	}
	public madLib() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Echo's WildLibs");
		getContentPane().setLayout(null);
		
		textFieldAdj = new JTextField();
		textFieldAdj.setBounds(83, 34, 104, 19);
		getContentPane().add(textFieldAdj);
		textFieldAdj.setColumns(10);
		
		JLabel lblAdjective = new JLabel("adjective");
		lblAdjective.setBounds(12, 36, 55, 15);
		getContentPane().add(lblAdjective);
		
		textFieldNoun = new JTextField();
		textFieldNoun.setBounds(83, 157, 104, 19);
		getContentPane().add(textFieldNoun);
		textFieldNoun.setColumns(10);
		
		JLabel lblNoun = new JLabel("noun");
		lblNoun.setBounds(12, 159, 55, 15);
		getContentPane().add(lblNoun);
		
		textFieldVerb = new JTextField();
		textFieldVerb.setBounds(332, 34, 104, 19);
		getContentPane().add(textFieldVerb);
		textFieldVerb.setColumns(10);
		
		textFieldAdjTwo = new JTextField();
		textFieldAdjTwo.setBounds(332, 157, 104, 19);
		getContentPane().add(textFieldAdjTwo);
		textFieldAdjTwo.setColumns(10);
		
		JLabel lblAdjectiveTwo = new JLabel("Adjective ");
		lblAdjectiveTwo.setBounds(255, 159, 72, 15);
		getContentPane().add(lblAdjectiveTwo);
		
		JLabel lblVerb = new JLabel("verb");
		lblVerb.setBounds(255, 36, 55, 15);
		getContentPane().add(lblVerb);
		
		JButton btnWrite = new JButton("Write");
		btnWrite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writeStory();
			}
		});
		btnWrite.setBounds(12, 216, 98, 25);
		getContentPane().add(btnWrite);
		
		lblOutput = new JLabel("");
		lblOutput.setFont(new Font("Dialog", Font.BOLD, 12));
		lblOutput.setBounds(128, 221, 301, 38);
		lblOutput.setVisible(false);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		madLib theMadLib = new madLib();
		theMadLib.setSize(new Dimension(450,300));
		theMadLib.setVisible(true);
	}
}
