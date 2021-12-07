import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static java.lang.Thread.sleep;

class quizMainTest {

	@Test
	public void testMainQuiz() throws InterruptedException {
		quizMain form = new quizMain("Welcome User");   
        form.setVisible(true); //make form visible to the user  
        
        for(int i= 0; i<10;i++) {
	        form.jb[0].setSelected(true);
	        form.jb[1].setSelected(false);
	        form.jb[2].setSelected(false);
	        form.jb[3].setSelected(false);
	        form.jb[4].setSelected(false);
	        sleep(500);
	        form.b1.doClick();
	        sleep(500);
        }
        sleep(2000);
        form.b2.doClick();
        sleep(2000);
       
        System.out.println("Test Completed");   
        form.dispose();
	}

}
