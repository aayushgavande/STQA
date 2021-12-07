import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class getMarks extends JFrame implements ActionListener {
	
	JButton b1,b2;  
    JPanel newPanel;  
    JLabel userLabel;  
    final JTextField  textField1; 
    
    getMarks() {
    
	    //create label for username   
	    userLabel = new JLabel();  
	    userLabel.setText("Roll Number");      //set label value for textField1  
	      
	    //create text field to get username from the user  
	    textField1 = new JTextField(15);    //set length of the text  
	
	  	    //create submit button  
	    b1 = new JButton("View Marks"); //set label to button  
	    b2 = new JButton("Back");
	      
	    //create panel to put form elements  
	    newPanel = new JPanel(new GridLayout(4, 1));  
	    newPanel.add(userLabel);    //set username label to panel  
	    newPanel.add(textField1);   //set text field to panel  
	   
	    newPanel.add(b1);           //set button to panel  
	    newPanel.add(b2);
	      
	    //set border to panel   
	    add(newPanel, BorderLayout.CENTER);  
	      
	    //perform action on button click   
	    b1.addActionListener(this);     //add action listener to button  
	    b2.addActionListener(this);
	    setTitle("Get Marks");
    }
    
  //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        String userValue = textField1.getText();        //get user entered username from the textField1  
        if(ae.getSource() == b1) {
	        //check whether the credentials are authentic or not  
	        if (userValue.equals("1")) {  //if authentic, navigate user to a new page  
	              
	        	JOptionPane.showMessageDialog(this,"Marks Scored= 10");
	        	
	        	
	        } else if(userValue.equals("2")) {
	        	
	        	JOptionPane.showMessageDialog(this,"Marks Scored= 3");
	        	
	        }else if(userValue.contentEquals("3")) {
	        	
	        	JOptionPane.showMessageDialog(this,"Marks Scored= 8");
	        	
	        }else{  
	        	JOptionPane.showMessageDialog(this,"No Record Found for the given roll number");
	        }
        }else if (ae.getSource() == b2)
        {
            CreateLoginForm page = new CreateLoginForm();
        	page.setSize(300,100);  //set size of the frame  
        	page.setVisible(true);
        }
    }  
    


}
