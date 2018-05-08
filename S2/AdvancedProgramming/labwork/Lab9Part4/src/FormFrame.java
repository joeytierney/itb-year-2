import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 22/03/2017
 *
 */
public class FormFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel myPanel = new JPanel();
	JLabel nameLabel;
	JTextField nameField;
	JButton submitButton;
	
	public FormFrame(){
		//add RegisterPanel to myPanel
		myPanel.add(new RegisterPanel());
		//set frame parameters
		setTitle("Lab9Part4");
		setSize(400,100);
		setVisible(true);
		
	}//end FormFrame
	
	//inner class definitions
	class RegisterPanel extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public RegisterPanel(){
			nameLabel = new JLabel("Name: ");
			nameField = new JTextField(20);
			submitButton = new JButton("Submit");
			//anonymous inner class
			submitButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					nameField.setText("Submit completed");
					setTitle("Submit Completed!!!!");
					nameField.setEnabled(false);
				}//end actionPerformed
			});//end anonymous inner class
			//add label, textfield and button to panel
			myPanel.add(nameLabel);
			myPanel.add(nameField);
			myPanel.add(submitButton, BorderLayout.SOUTH);
			setContentPane(myPanel);
		}//end RegisterPanel
	}//end inner class
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new FormFrame();
	}//end main

}//end class