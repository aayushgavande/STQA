//import required classes and packages  
import javax.swing.*;  

import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
  
//create CreateLoginForm class to create login form  
//class extends JFrame to create a window where our component add  
//class implements ActionListener to perform an action on button click  
class CreateLoginForm extends JFrame implements ActionListener  
{  
    //initialize button, panel, label, and text field  
    JButton b1 , b2 , b3;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
    
    
      
    //calling constructor  
    CreateLoginForm()  
    {    
    	
          
        //create label for username   
        userLabel = new JLabel();  
        userLabel.setText("Username");      //set label value for textField1  
          
        //create text field to get username from the user  
        textField1 = new JTextField(15);    //set length of the text  
  
        //create label for password  
        passLabel = new JLabel();  
        passLabel.setText("Password");      //set label value for textField2  
          
        //create text field to get password from the user  
        textField2 = new JPasswordField(15);    //set length for the password  
          
        //create submit button  
        b1 = new JButton("SUBMIT"); //set label to button  
        b2 = new JButton("SignUp");
        b3 = new JButton("View Marks");
          
        //create panel to put form elements  
        newPanel = new JPanel(new GridLayout(4, 1));  
        newPanel.add(userLabel);    //set username label to panel  
        newPanel.add(textField1);   //set text field to panel  
        newPanel.add(passLabel);    //set password label to panel  
        newPanel.add(textField2);   //set text field to panel  
        newPanel.add(b1); 
        newPanel.add(b2);//set button to panel  
        newPanel.add(b3);
          
        //set border to panel   
        add(newPanel, BorderLayout.CENTER);  
          
        //perform action on button click   
        b1.addActionListener(this);     //add action listener to button 
        b2.addActionListener(this);
        b3.addActionListener(this);
        setTitle("LOGIN FORM");         //set title to the login form

    }  
      
    //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
          
        //check whether the credentials are authentic or not  
        
        if(ae.getSource() == b1) {
	        if (userValue.equals("Aayush") && passValue.equals("12345")) {  //if authentic, navigate user to a new page  
	              
	            //create instance of the NewPage  
	            quizMain page = new quizMain("Welcome:" + userValue);            
	            //make page visible to the user  
	            page.setVisible(true);         
	            //create a welcome label and set it to the new page  
	//            JLabel wel_label = new JLabel("Welcome: "+userValue);  
	//            page.getContentPane().add(wel_label);  
	                       
	        }else if (userValue.equals("Srishti") && passValue.equals("12345")) {  //if authentic, navigate user to a new page  
	              
	            //create instance of the NewPage  
	            quizMain page = new quizMain("Welcome:" + userValue);            
	            //make page visible to the user  
	            page.setVisible(true);         
	            //create a welcome label and set it to the new page  
	//            JLabel wel_label = new JLabel("Welcome: "+userValue);  
	//            page.getContentPane().add(wel_label);  
	                       
	        }else if (userValue.equals("Swarali") && passValue.equals("12345")) {  //if authentic, navigate user to a new page  
	              
	            //create instance of the NewPage  
	            quizMain page = new quizMain("Welcome:" + userValue);            
	            //make page visible to the user  
	            page.setVisible(true);         
	            //create a welcome label and set it to the new page  
	//            JLabel wel_label = new JLabel("Welcome: "+userValue);  
	//            page.getContentPane().add(wel_label);  
	                       
	        }
	        else {
	            //show error message  
	            System.out.println("Please enter valid username and password");  
	        }  
        }else if(ae.getSource() == b2) {
        	
        	signupPage signup = new signupPage();
        	signup.setSize(300,100);  //set size of the frame  
        	signup.setVisible(true);
        }
        else if(ae.getSource() ==b3)
        {
        	getMarks marks = new getMarks();
        	marks.setSize(300,100);  //set size of the frame  
        	marks.setVisible(true);
        }
       
    }  
}  

class loginPage {

	 //main() method start  
    public static void main(String arg[])  
    {  
        try  
        {  
            //create instance of the CreateLoginForm  
            CreateLoginForm form = new CreateLoginForm();  
            form.setSize(300,100);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            //handle exception   
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  

}
