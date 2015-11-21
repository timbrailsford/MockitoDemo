/*
 * Tim Brailsford (tim.brailsford@nottingham.edu.my), November 2015
 * 
 * Mockito Demonstration for G53SQM
 * 
 * NB this Maven project requires junit 4.x and mockito-core dependencies.
 * 
 */

/*
 * System Under Test (SUT)
 */

package MockitoDemo;

public class Hello_SUT {
	public String greet(Hello_col myHello_col) {
		return myHello_col.greet();
	}
	
	public String ask(Hello_col myHello_col, String question) {
		return myHello_col.ask(question);
	}
}
