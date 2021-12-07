
import static java.lang.Thread.sleep;


import org.junit.jupiter.api.Test;


class signupPageTest {
	
	@Test	
	public void testMain() throws InterruptedException {
		signupPage form = new signupPage();  
        form.setSize(300,100);  //set size of the frame  
        form.setVisible(true); //make form visible to the user  
        form.textField1.setText("test1@gmail.com");
        sleep(2000);
        form.textField2.setText("12345");
        sleep(2000);
        form.textField3.setText("12345904");
        sleep(2000);
        form.b1.doClick();
        sleep(2000);
        System.out.println("SignUp Successful");   
        form.dispose();
	}
	
	@Test	
	public void testMainWrongUser() throws InterruptedException {
		signupPage form = new signupPage();  
        form.setSize(300,100);  //set size of the frame  
        form.setVisible(true); //make form visible to the user  
        form.textField1.setText("");
        sleep(2000);
        form.textField2.setText("12345");
        sleep(2000);
        form.textField3.setText("123456789");
        sleep(2000);
        form.b1.doClick();
        sleep(2000);  
        form.dispose();
	}
	
	@Test	
	public void testMainWrongPass() throws InterruptedException {
		signupPage form = new signupPage();  
        form.setSize(300,100);  //set size of the frame  
        form.setVisible(true); //make form visible to the user  
        form.textField1.setText("test1@gmail.com");
        sleep(2000);
        form.textField2.setText("");
        sleep(2000);
        form.textField3.setText("123456789");
        sleep(2000);
        form.b1.doClick();
        sleep(2000);
        form.dispose();
	}
	
	@Test	
	public void testMainWrongMob() throws InterruptedException {
		signupPage form = new signupPage();  
        form.setSize(300,100);  //set size of the frame  
        form.setVisible(true); //make form visible to the user  
        form.textField1.setText("test1@gmail.com");
        sleep(2000);
        form.textField2.setText("12345");
        sleep(2000);
        form.textField3.setText("");
        sleep(2000);
        form.b1.doClick();
        sleep(2000);
        form.dispose();
	}
	
}
