package model;

import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Thread.sleep;

import org.junit.jupiter.api.Test;

class busWindowTest {
	long phone = 1234567890;
	@Test
	void test() throws InterruptedException {
		Bus_Window X = new Bus_Window("Aayush", "aayush@gmail.com", phone);
		sleep(1000);
		X.t1.setText("122");
		X.d1.setText("212");
		X.d2.setText("20");
		X.d3.setText("2021");
		sleep(1000);
		X.destCb.setSelectedIndex(1);
		X.srcCb.setSelectedIndex(1);
		sleep(1000);
		X.p1.doClick();
		sleep(1000);
	}
	
	@Test
	void test_fail() throws InterruptedException {
		Bus_Window X = new Bus_Window("Aayush", "aayush@gmail.com", phone);
		sleep(1000);
		X.t1.setText("122");
		X.d1.setText("22");
		X.d2.setText("20");
		X.d3.setText("2021");
		sleep(1000);
		X.destCb.setSelectedIndex(20);
		X.srcCb.setSelectedIndex(1);
		sleep(1000);
		X.p1.doClick();
		sleep(1000);
	}

}
