package MockitoDemo;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;
import org.junit.*;

public class AppTest {
	private Hello_col myMock;

	@Before
	public void setUp() throws Exception {
		myMock = mock(Hello_col.class);
		when(myMock.greet()).thenReturn("Hello World!");
		when(myMock.ask("What is your favourite colour?")).thenReturn("Blue");
		when(myMock.ask("What is the meaning of life?")).thenReturn("42");
	}

	@Test
	public final void test_Colgreet() {
		assertEquals("Hello World!", myMock.greet());
	}
	
	@Test
	public final void test_Q1() {
		assertEquals("Blue", myMock.ask("What is your favourite colour?"));
	}

	@Test
	public final void test_Q2() {
		assertEquals("42", myMock.ask("What is the meaning of life?"));
	}
	
	@Test
	public void test_SUTgreet() {
		Hello_SUT mySUT = new Hello_SUT();
		assertEquals("Hello World!", mySUT.greet(myMock));
	}
}
