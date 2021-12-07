import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getMarksTest {

	@Test
	public void testMain() throws InterruptedException {
		getMarks mark= new getMarks();  
        mark.setSize(300,100);  //set size of the frame  
        mark.setVisible(true); //make form visible to the user  
        mark.textField1.setText("3");
        sleep(2000);
        mark.b1.doClick();
        sleep(2000);
        System.out.println("Marks displayed successfully.");   
        mark.dispose();
	}
	
	@Test
	public void testMainFail() throws InterruptedException {
		getMarks mark= new getMarks();  
        mark.setSize(300,100);  //set size of the frame  
        mark.setVisible(true); //make form visible to the user  
        mark.textField1.setText("10");
        sleep(2000);
        mark.b1.doClick();
        sleep(2000);
        System.out.println("Incorrect Roll Number.");   
        mark.dispose();
	}

}
