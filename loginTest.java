package model;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class loginTest {

	@Test
	void loginSuccess() throws InterruptedException {
		User_Window X = new User_Window();
		sleep(3000);
		X.tf1.setText("Aayush");
		sleep(500);
		X.tf2.setText("xyz@gmail.com");
		sleep(500);
		X.tf3.setText("1234567890");
		sleep(500);
		X.b1.doClick();
		sleep(500);
	}
	
	@Test
	void loginfailEmail() throws InterruptedException {
		User_Window X = new User_Window();
		sleep(3000);
		X.tf1.setText("Aayush");
		sleep(500);
		X.tf2.setText("xyz");
		sleep(500);
		X.tf3.setText("1234567890");
		sleep(500);
		X.b1.doClick();
		sleep(500);
	}
	
	@Test
	void loginfailPhone() throws InterruptedException {
		User_Window X = new User_Window();
		sleep(3000);
		X.tf1.setText("Aayush");
		sleep(500);
		X.tf2.setText("xyz@gmail.com");
		sleep(500);
		X.tf3.setText("1234");
		sleep(500);
		X.b1.doClick();
		sleep(500);
	}

}
