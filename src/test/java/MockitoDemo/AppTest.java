/*
 * Tim Brailsford (tim.brailsford@nottingham.edu.my), November 2015
 * 
 * Mockito Demonstration for G53SQM
 * 
 * NB this Maven project requires junit 4.x and mockito-core dependencies.
 * 
 */

/*
 * Test suite
 */

package MockitoDemo;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;
import org.junit.*;

public class AppTest {
	private Hello_col myMock;

	// instantiate the mock and specify it's behaviour - before each test
	@Before
	public void setUp() throws Exception {
		
		// myMock is the mock object
		myMock = mock(Hello_col.class);
		
		// greet() method always returns "Hello World!"
		when(myMock.greet()).thenReturn("Hello World!");
		
		// ask(String q) method returns an answer appropriate for question q 
		when(myMock.ask("What is your favourite colour?")).thenReturn("Blue");
		when(myMock.ask("What is the meaning of life?")).thenReturn("42");
	}

	/**
	 * Test collaborator class
	 */
	@Test
	public final void test_Colgreet() {
		assertEquals("Hello World!", myMock.greet());
	}
	
	/**
	 * Test SUT
	 */
	
	// Greeting
	@Test
	public void test_SUTgreet() {
		assertEquals("Hello World!", myMock.greet());
	}
	
	// Question 1
	@Test
	public final void test_SUT_Q1() {
		assertEquals("Blue", myMock.ask("What is your favourite colour?"));
	}

	// Question 2
	@Test
	public final void test_SUT_Q2() {
		assertEquals("42", myMock.ask("What is the meaning of life?"));
	}
	
}
