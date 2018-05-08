import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 08/03/2017
 */

public class GUIWithAnonymousInnerClass extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel myLabel;
	JButton myButton;
	
	public GUIWithAnonymousInnerClass(){
		Container contentPane = getContentPane();
		GridLayout gridlayout = new GridLayout(2,2);
		contentPane.setLayout(gridlayout);
		//create label and button
		myLabel = new JLabel("Default Text");
		myButton = new JButton("Change Text");
		//anonymous inner class
		myButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				myLabel.setText("Outer class label set by inner class " + getClass().getName());
			}//end actionPerformed
			
		});//end inner class
		//add to content pane
		contentPane.add(myLabel);
		contentPane.add(myButton);
		//set frame parameters
		setTitle("Lab7Part3");
		setSize(450,200);
		setVisible(true);
	}//end GUI

	public static void main(String[] args) {
		new GUIWithAnonymousInnerClass();
	}//end main

}//end class