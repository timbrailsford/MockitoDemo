package MockitoDemo;

public class Hello_SUT {
	public String greet(Hello_col myHello_col) {
		return myHello_col.greet();
	}
	
	public String ask(Hello_col myHello_col, String question) {
		return myHello_col.ask(question);
	}
}
