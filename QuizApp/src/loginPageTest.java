
import static java.lang.Thread.sleep;


import org.junit.jupiter.api.Test;


class loginPageTest {
	
	@Test	
	public void testMain() throws InterruptedException {
		CreateLoginForm form = new CreateLoginForm();  
        form.setSize(300,100);  //set size of the frame  
        form.setVisible(true); //make form visible to the user  
        form.textField1.setText("Aayush");
        sleep(2000);
        form.textField2.setText("12345");
        sleep(2000);
        form.b1.doClick();
        sleep(2000);
        System.out.println("Login Successful");   
        form.dispose();
	}
	
	@Test	
	public void testMainWrong() throws InterruptedException {
		CreateLoginForm form = new CreateLoginForm();  
        form.setSize(300,100);  //set size of the frame  
        form.setVisible(true); //make form visible to the user  
        form.textField1.setText("wronguser");
        sleep(2000);
        form.textField2.setText("12345");
        sleep(2000);
        form.b1.doClick();
        sleep(2000);  
        form.dispose();
	}
	
	@Test	
	public void testMainWrongPass() throws InterruptedException {
		CreateLoginForm form = new CreateLoginForm();  
        form.setSize(300,100);  //set size of the frame  
        form.setVisible(true); //make form visible to the user  
        form.textField1.setText("Aayush");
        sleep(2000);
        form.textField2.setText("wrongPass");
        sleep(2000);
        form.b1.doClick();
        sleep(2000);
        form.dispose();
	}
	
}
