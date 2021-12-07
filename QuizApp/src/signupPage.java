import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class signupPage extends JFrame implements ActionListener {
	
	JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel , mobLabel;  
    final JTextField  textField1, textField2, textField3; 
    
    signupPage() {
    
	    //create label for username   
	    userLabel = new JLabel();  
	    userLabel.setText("Username");      //set label value for textField1  
	      
	    //create text field to get username from the user  
	    textField1 = new JTextField(15);    //set length of the text  
	
	    //create label for password  
	    passLabel = new JLabel();  
	    passLabel.setText("Password");      //set label value for textField2  
	      
	    //create text field to get password from the user  
	    textField2 = new JPasswordField(15); //set length for the password 
	    
	    mobLabel = new JLabel();
	    mobLabel.setText("Mobile Number");
	    
	    textField3 = new JTextField(15);
	      
	    //create submit button  
	    b1 = new JButton("SUBMIT"); //set label to button  
	      
	    //create panel to put form elements  
	    newPanel = new JPanel(new GridLayout(4, 1));  
	    newPanel.add(userLabel);    //set username label to panel  
	    newPanel.add(textField1);   //set text field to panel  
	    newPanel.add(passLabel);    //set password label to panel  
	    newPanel.add(textField2);   //set text field to panel  
	    newPanel.add(mobLabel);
	    newPanel.add(textField3);
	    newPanel.add(b1);           //set button to panel  
	      
	    //set border to panel   
	    add(newPanel, BorderLayout.CENTER);  
	      
	    //perform action on button click   
	    b1.addActionListener(this);     //add action listener to button  
	    setTitle("SignUp FORM");
    }
    
  //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
        String mobValue = textField3.getText();
        //check whether the credentials are authentic or not  
        if (userValue.equals("")) {  //if authentic, navigate user to a new page  
              
        	System.out.println("Please enter a valid Username.");
        	
        	
        } else if(passValue.equals("")) {
        	
        	System.out.println("Please enter a valid Password.");
        	
        }else if(mobValue.contentEquals("")) {
        	
        	System.out.println("Please enter a valid Mobile Number.");
        	
        }else{  
            //show error message  
            System.out.println("SignUp Successful");
            
            CreateLoginForm page = new CreateLoginForm();  
            
            //make page visible to the user  
            page.setSize(300,100);  //set size of the frame  
            page.setVisible(true); 
            
          
        }  
    }  

}
