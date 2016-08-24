package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void testSumar() {
		int a = 5;
		int b = 10;
		int esperado = 15;
		Application ap = new Application();
		
		assertEquals(esperado, ap.sumar(a, b));
	}

}
